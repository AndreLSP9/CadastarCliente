package br.com.lache;

public class CadastrarCliente {

    public Cliente cadastrarCliente(String nome, int idade, String email) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        if (idade <= 18) {
            throw new IllegalArgumentException("Idade deve ser maior que 18");
        }

        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail inválido");
        }

        return new Cliente(nome, idade, email);
    }
}
