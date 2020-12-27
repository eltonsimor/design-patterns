package command;

public class Programa {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Elton", 150.0);
        Pedido pedido2 = new Pedido("Luana", 250.0);

        FilaDeTrabalho fila = new FilaDeTrabalho();

        fila.adicionar(new PagaPedido(pedido1));
        fila.adicionar(new PagaPedido(pedido2));
        fila.adicionar(new ConcluiPedido(pedido1));

        fila.processar();
    }
}
