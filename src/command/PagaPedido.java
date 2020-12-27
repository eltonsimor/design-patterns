package command;

public class PagaPedido implements Comando {

    private Pedido pedido;

    public PagaPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void execute() {
        System.out.println("Pagando pedido de : " + pedido.getCliente());
        this.pedido.paga();
    }
}
