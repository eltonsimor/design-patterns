package strategy;

import chains_of_responsibility.Item;
import states.EmAprovacao;
import states.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class Orcamento {

    private double valor;
    private final List<Item> itens;
    private EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EstadoDeUmOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
     }

    public List<Item> getItens() {
        return unmodifiableList(itens);
    }

    public void definirEstado(EstadoDeUmOrcamento estado){
        this.estadoAtual = estado;
    }

    public void aplicarDescontoExtra() {
        this.estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprovar() {
        this.estadoAtual.aprovar(this);
    }

    public void reprovar() {
        this.estadoAtual.reprovar(this);
    }

    public void finalizar() {
        this.estadoAtual.finalizar(this);
    }
}
