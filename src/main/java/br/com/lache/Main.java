package br.com.lache;

public class Main {
    public static void main(String[] args) {
        CadastrarCliente service = new CadastrarCliente();

        try {
            System.out.println("🔵 Teste 1: cadastro válido");
            Cliente c1 = service.cadastrarCliente("André", 25, "andre@email.com");
            System.out.println("Cliente cadastrado: " + c1.getNome() + ", " + c1.getIdade() + ", " + c1.getEmail());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\n🔵 Teste 2: nome vazio");
            service.cadastrarCliente("", 25, "teste@teste.com");
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            System.out.println("\n🔵 Teste 3: idade inválida");
            service.cadastrarCliente("André", 18, "teste@teste.com");
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            System.out.println("\n🔵 Teste 4: email inválido");
            service.cadastrarCliente("André", 25, "email_invalido");
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
