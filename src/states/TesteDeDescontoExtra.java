package states;

import strategy.Orcamento;

public class TesteDeDescontoExtra {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.00);
        reforma.aplicarDescontoExtra();
        System.out.println(reforma.getValor());

        reforma.aprovar();
        reforma.aplicarDescontoExtra();
        System.out.println(reforma.getValor());

        reforma.finalizar();
        reforma.aprovar();
    }
}
