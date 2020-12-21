package template_method;

import chains_of_responsibility.Item;
import strategy.Orcamento;

public class Programa {

    public static void main(String[] args) {
        TemplateDeImpostoCondicional icpp = new ICPP();
        TemplateDeImpostoCondicional ikcv = new IKCV();
        TemplateDeImpostoCondicional ihit = new IHIT();

        Orcamento orcamento = new Orcamento(500.00);
        orcamento.adicionaItem(new Item("Jaqueta", 200.00));
        orcamento.adicionaItem(new Item("Sapato", 80.00));
        orcamento.adicionaItem(new Item("Sapato", 80.00));

        System.out.println("Valor do Imposto ICPP: " + icpp.calcula(orcamento));
        System.out.println("Valor do Imposto IKCV: " + ikcv.calcula(orcamento));
        System.out.println("Valor do Imposto IHIT: " + ihit.calcula(orcamento));
    }
}
