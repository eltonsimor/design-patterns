package builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

    private final String razaoSocial;
    private final String cnpj;
    private final Calendar dataDeEmissao;
    private final double valorBruto;
    private final double impostos;
    private final List<ItemDaNota> itens;
    private final String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, double valorBruto, double impostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Calendar getDataDeEmissao() {
        return dataDeEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }
}
