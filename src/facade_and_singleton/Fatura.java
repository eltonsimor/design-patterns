package facade_and_singleton;

public class Fatura {

    private Cliente cliente;
    private double valor;

    public Fatura(Cliente cliente, double valor) {
        this.cliente = cliente;

        this.valor = valor;
    }
}
