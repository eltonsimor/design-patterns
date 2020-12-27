package facade_and_singleton;

public class Cobranca {
    private Tipo boleto;
    private Fatura fatura;

    public Cobranca(Tipo boleto, Fatura fatura) {
        this.boleto = boleto;

        this.fatura = fatura;
    }

    public void emite() {

    }
}
