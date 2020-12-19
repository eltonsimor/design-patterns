package builder;

import observer.AcaoAposGerarNota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens;
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;
    private List<AcaoAposGerarNota> acoes;

    public NotaFiscalBuilder() {
        this.todosItens = new ArrayList<>();
        this.data = Calendar.getInstance();
        this.acoes = new ArrayList<>();
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder observacao(ItemDaNota item){
        this.todosItens.add(item);
        this.valorBruto += item.getValor();
        this.impostos += this.valorBruto * 0.05;
        return this;
    }

    public NotaFiscalBuilder observacao(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naData(Calendar data){
        this.data = data;
        return this;
    }

    public NotaFiscalBuilder acao(AcaoAposGerarNota acao){
        this.acoes.add(acao);
        return this;
    }

    public NotaFiscal build(){
        NotaFiscal nf = new NotaFiscal(this.razaoSocial, this.cnpj, this.data, this.valorBruto, this.impostos, this.todosItens, this.observacoes);

        acoes.forEach(acao -> acao.execute(nf));

        return nf;
    }

}
