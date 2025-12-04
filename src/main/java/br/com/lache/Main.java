package br.com.lache;

public class Main {
    public static void main(String[] args) {

        CadastrarCliente service = new CadastrarCliente();

        try {
            Cliente cliente = service.cadastrarCliente(
                    "André",
                    25,
                    "andre@email.com"
            );

            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Email: " + cliente.getEmail());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
