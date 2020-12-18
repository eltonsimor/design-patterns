package states;

import strategy.Orcamento;

public class Reprovar implements EstadoDeUmOrcamento{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento reprovador não recebem descontos extras!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ser aprovados!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ser reprovados novamente!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.definirEstado(new Finalizado());
    }
}
