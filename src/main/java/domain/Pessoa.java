package domain;

public class Pessoa {

    private String nome;
    private String email;
    private int idade;
    private String senha;

    public Pessoa(String nome, String email, String senha, int idade) {
        alterarNome(nome);
        alterarEmail(email);
        alterarSenha(senha);
        alterarIdade(idade);
    }

    public void alterarIdade(int novaIdade) {

        if (novaIdade < 0) {
            System.out.println("Erro!, idade invalida. Sua idade estar abaixo de zero!");
            return;
        }

        if (novaIdade > 200) {
            System.out.println("Erro!, idade invalida. Sua idade estar acima de 200!");
            return;
        }

        this.idade = novaIdade;
    }

    public int getIdade() {
        return idade;
    }

    public void alterarNome(String novoNome) {

        if (novoNome == null) {
            System.out.println("Erro!, nome invalido. O seu nome estar null!");
            return;
        }

        if (novoNome.length() > 50) {
            System.out.println("Erro!, nome invalido. O nome nao pode ter mais de 50 caractere!");
            return;
        }

        if (novoNome.isBlank()) {
            System.out.println("Erro!, nome invalido. Nao a nada em seu nome!");
            return;
        }

        if (novoNome.length() < 5) {
            System.out.println("Erro!. nome invalido. O nome nao pode ter menos de 5 caractere!");
            return;
        }

        this.nome = novoNome;
    }

    public String getNome() {
        return nome;
    }
    
    public void alterarEmail(String novoEmail) {

        if (novoEmail == null) {
            System.out.println("Erro!, email invalido. O seu email estar null!");
            return;
        }

        if (novoEmail.length() > 70) {
            System.out.println("Erro!, email invalido. O email nao pode ter mais de 70 caractere!");
            return;
        }

        if (novoEmail.isBlank()) {
            System.out.println("Erro!, email invalido. Nao a nada no seu email!");
            return;
        }

        if (novoEmail.length() < 5) {
            System.out.println("Erro!, email invalido. O email nao pode ter menos de 5 caractere!");
            return;
        }

        if (!novoEmail.contains("@")) {
            System.out.println("Erro!, email invalido. A utilizacao do ( @ ) e obrigatorio!");
            return;
        }

        if (!novoEmail.contains(".")) {
            System.out.println("Erro!, email invalido. A utilizacao de ( . ) e obrigatorio!");
            return;
        }

        if (novoEmail.contains(" ")) {
            System.out.println("Erro!, email invalido. Nao pode o uso de espaco no email!");
            return;
        }

        if (novoEmail.startsWith("@")) {
            System.out.println("Erro!, email invalido. Nao pode comecar com ( @ )!");
            return;
        }

        if (novoEmail.endsWith(".")) {
            System.out.println("Erro!, email invalido. Nao pode terminar com ( . )!");
            return;
        }

        this.email = novoEmail;
    }

    public String getEmail() {
        return email;
    }

    public void alterarSenha(String novaSenha) {

        if (novaSenha == null) {
            System.out.println("Erro!, senha invalida. A sua senha nao pode ser null!");
            return;
        }

        if (novaSenha.isBlank()) {
            System.out.println("Erro!, senha invalida. A sua senha estar vazia!");
            return;
        }

        if (novaSenha.contains(" ")) {
            System.out.println("Erro!, senha invalida. A sua senha nao pode ter espaco!");
            return;
        }

        if (novaSenha.length() < 8) {
            System.out.println("Erro!, senha invalida. A sua senha tem menos de 8 caractere!");
            return;
        }

        if (novaSenha.length() > 25) {
            System.out.println("Erro!, senha invalida. A sua senha tem mais de 25 caractere!");
            return;
        }

        boolean temMaiusculas = false;
        boolean temMinusculas = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (int i = 0; i < novaSenha.length(); i++) {

            char letra = novaSenha.charAt(i);

            if (Character.isUpperCase(letra)) {
                temMaiusculas = true;

            } else if (Character.isLowerCase(letra)) {
                temMinusculas = true;

            } else if (Character.isDigit(letra)) {
                temNumero = true;

            } else {
                temEspecial = true;
            }
        }

        if (!temMaiusculas) {
            System.out.println("Erro!, senha invalida. A sua senha nao tem letra maiuscula!, ex: (M).");
            return;
        }

        if (!temMinusculas) {
            System.out.println("Erro!, senha invalida. A sua senha nao tem letra menusculas!, ex: (m)");
            return;
        }

        if (!temNumero) {
            System.out.println("Erro!, senha invalida. A sua senha nao tem numeros!, ex: (1)");
            return;
        }

        if (!temEspecial) {
            System.out.println("Erro!, senha invalida. A sua senha nao tem caractere especial!, ex: (#)");
            return;
        }

        String[] senhasFracas = {
                "123456",
                "123456789",
                "12345",
                "1234",
                "123123",
                "password",
                "admin",
                "qwerty",
                "abc123",
                "111111",
                "000000",
                "senha",
                "senha123",
                "123senha",
                "admin123",
                "qwert123",
                "123qwe",
                "987654",
                "654321",
                "00000000",
                "112233",
                "121212",
                "iloveyou",
                "welcome",
                "usuario",
                "teste",
                "test123",
                "root",
                "root123",
                "java123"
        };

        for (String senhaFraca : senhasFracas) {

            if (novaSenha.equals(senhaFraca)) {
                System.out.println("Erro!, senha invalida. A sua senha e muito fraca!");
                return;
            }
        }

        int repetidos = 0;

        for (int i = 0; i < novaSenha.length() - 1; i++) {

            if (novaSenha.charAt(i) == novaSenha.charAt(i + 1)) {
                repetidos++;
            }
        }

        if (repetidos >= 3) {
            System.out.println("Erro!, senha invalida. A sua senha tem 2 pares de caractere repetindo!");
            return;
        }

        this.senha = novaSenha;
    }

    public String getSenha() {
        return senha;
    }
}