package chains_of_responsibility;

import strategy.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(aconteceuVendaCasadaEm(orcamento))
            return orcamento.getValor() * 0.05;
        return this.proximo.desconta(orcamento);
    }

    private boolean aconteceuVendaCasadaEm(Orcamento orcamento){
        return contemItem("caneta", orcamento) && contemItem("lapis", orcamento);
    }

    private boolean contemItem(String nome, Orcamento orcamento){
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
