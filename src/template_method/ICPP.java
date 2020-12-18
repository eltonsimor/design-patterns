package template_method;

import strategy.Imposto;
import strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP() {}

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
