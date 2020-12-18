package states;

import strategy.Orcamento;

public class Aprovar implements EstadoDeUmOrcamento{

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado){
            double valor = orcamento.getValor() - (orcamento.getValor() * 0.02);
            orcamento.setValor(valor);
            this.descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser aprovados novamente!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.definirEstado(new Finalizado());
    }
}
