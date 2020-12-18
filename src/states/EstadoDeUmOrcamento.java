package states;

import strategy.Orcamento;

public interface EstadoDeUmOrcamento {

    void aplicaDescontoExtra(Orcamento orcamento);
    void aprovar(Orcamento orcamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);
}
