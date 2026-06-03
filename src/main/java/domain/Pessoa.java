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
            throw new IllegalArgumentException("Idade inválida. Não pode ser menor que 0.");
        }

        if (novaIdade > 200) {
            throw new IllegalArgumentException("Idade inválida. Não pode ser maior que 200.");
        }

        this.idade = novaIdade;
    }

    public int getIdade() {
        return idade;
    }

    public void alterarNome(String novoNome) {

        if (novoNome == null) {
            throw new IllegalArgumentException("Nome inválido.");
        }

        if (novoNome.length() > 50) {
            throw new IllegalArgumentException("Nome inválido. Máximo de 50 caracteres.");
        }

        if (novoNome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido. O campo não pode estar vazio.");
        }

        if (novoNome.length() < 5) {
            throw new IllegalArgumentException("Nome inválido. Mínimo de 5 caracteres.");
        }

        this.nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void alterarEmail(String novoEmail) {

        if (novoEmail == null) {
            throw new IllegalArgumentException("Email inválido.");
        }

        if (novoEmail.length() > 70) {
            throw new IllegalArgumentException("Email inválido. Máximo de 70 caracteres.");
        }

        if (novoEmail.isBlank()) {
            throw new IllegalArgumentException("Email inválido. O campo não pode estar vazio.");
        }

        if (novoEmail.length() < 5) {
            throw new IllegalArgumentException("Email inválido. Mínimo de 5 caracteres.");
        }

        if (!novoEmail.contains("@")) {
            throw new IllegalArgumentException("Email inválido. Deve conter '@'.");
        }

        if (!novoEmail.contains(".")) {
            throw new IllegalArgumentException("Email inválido. Deve conter '.'.");
        }

        if (novoEmail.contains(" ")) {
            throw new IllegalArgumentException("Email inválido. Não pode conter espaços.");
        }

        if (novoEmail.startsWith("@")) {
            throw new IllegalArgumentException("Email inválido. Não pode começar com '@'.");
        }

        if (novoEmail.endsWith(".")) {
            throw new IllegalArgumentException("Email inválido. Não pode terminar com '.'.");
        }

        this.email = novoEmail;
    }

    public String getEmail() {
        return email;
    }

    public void alterarSenha(String novaSenha) {

        if (novaSenha == null) {
            throw new IllegalArgumentException("Senha inválida.");
        }

        if (novaSenha.isBlank()) {
            throw new IllegalArgumentException("Senha inválida. O campo não pode estar vazio.");
        }

        if (novaSenha.contains(" ")) {
            throw new IllegalArgumentException("Senha inválida. Não pode conter espaços.");
        }

        if (novaSenha.length() < 8) {
            throw new IllegalArgumentException("Senha inválida. Mínimo de 8 caracteres.");
        }

        if (novaSenha.length() > 25) {
            throw new IllegalArgumentException("Senha inválida. Máximo de 25 caracteres.");
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
            throw new IllegalArgumentException("Senha inválida. Deve conter letra maiúscula.");
        }

        if (!temMinusculas) {
            throw new IllegalArgumentException("Senha inválida. Deve conter letra minúscula.");
        }

        if (!temNumero) {
            throw new IllegalArgumentException("Senha inválida. Deve conter número.");
        }

        if (!temEspecial) {
            throw new IllegalArgumentException("Senha inválida. Deve conter caractere especial.");
        }

        String[] senhasFracas = {
                "123456", "123456789", "12345", "1234", "123123",
                "password", "admin", "qwerty", "abc123", "111111",
                "000000", "senha", "senha123", "123senha", "admin123",
                "qwert123", "123qwe", "987654", "654321", "00000000",
                "112233", "121212", "iloveyou", "welcome", "usuario",
                "teste", "test123", "root", "root123", "java123"
        };

        for (String senhaFraca : senhasFracas) {
            if (novaSenha.equalsIgnoreCase(senhaFraca)) {
                throw new IllegalArgumentException("Senha inválida. Senha muito fraca.");
            }
        }

        int repetidos = 0;

        for (int i = 0; i < novaSenha.length() - 1; i++) {
            if (novaSenha.charAt(i) == novaSenha.charAt(i + 1)) {
                repetidos++;
            }
        }

        if (repetidos >= 3) {
            throw new IllegalArgumentException("Senha inválida. Muitos caracteres repetidos.");
        }

        this.senha = novaSenha;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', email='" + email + "', idade=" + idade + "}";
    }
}