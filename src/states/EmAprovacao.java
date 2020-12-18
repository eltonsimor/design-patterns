package states;

import strategy.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento{

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado){
            double valor = orcamento.getValor() - (orcamento.getValor() * 0.05);
            orcamento.setValor(valor);
            this.descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconta já aplicado!");
        }
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.definirEstado(new Aprovar());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.definirEstado(new Reprovar());
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos em aprovação não podem ser finalizados!");
    }
}
