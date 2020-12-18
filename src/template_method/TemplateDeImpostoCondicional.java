package template_method;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {
    }

    @Override
    public final double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento))
            return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
        return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
