package template_method;

import strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {
    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.01;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() * 0.13) + 100.00;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return temItemIguais(orcamento);
    }

    private boolean temItemIguais(Orcamento orcamento) {
        return orcamento.getItens().stream().filter(item -> item.getNome().equals(item.getNome())).count() > 1;
    }
}
