package chains_of_responsibility;

import strategy.Orcamento;

public class TestaDescontos {

    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();
        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("Lapis", 250.0));
        orcamento.adicionaItem(new Item("Borracha", 100.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);
    }
}
