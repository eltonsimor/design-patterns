package states;

import strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizados não recebem descontos extras!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não podem ser aprovados!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não podem ser reprovados!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não podem ser finalizados novamente!");
    }
}
