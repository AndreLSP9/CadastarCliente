import br.com.lache.CadastrarCliente;
import br.com.lache.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CadastrarClienteTest {
    private final CadastrarCliente service = new CadastrarCliente();

    @Test
    void deveCadastrarComSucesso() {
        Cliente cliente = service.cadastrarCliente("André", 25, "andre@email.com");

        assertEquals("André", cliente.getNome());
        assertEquals(25, cliente.getIdade());
        assertEquals("andre@email.com", cliente.getEmail());
    }

    @Test
    void deveLancarErroQuandoNomeVazio() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                service.cadastrarCliente("", 25, "teste@teste.com")
        );

        assertEquals("Nome não pode ser vazio", ex.getMessage());
    }

    @Test
    void deveLancarErroQuandoIdadeInvalida() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                service.cadastrarCliente("André", 18, "teste@teste.com")
        );

        assertEquals("Idade deve ser maior que 18", ex.getMessage());
    }

    @Test
    void deveLancarErroQuandoEmailInvalido() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                service.cadastrarCliente("André", 25, "email_invalido")
        );

        assertEquals("E-mail inválido", ex.getMessage());
    }

}
