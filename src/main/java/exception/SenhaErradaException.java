package exception;

public class SenhaErradaException extends RuntimeException {

    public SenhaErradaException(String mensagem) {
        super(mensagem);
    }
}