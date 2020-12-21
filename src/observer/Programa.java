package observer;

import builder.ItemDaNota;
import builder.ItemDaNotaBuilder;
import builder.NotaFiscal;
import builder.NotaFiscalBuilder;

public class Programa {

    public static void main(String[] args) {
        ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();

        ItemDaNota item1 = itemBuilder
                .comDescricao("item 1")
                .comValor(200).build();

        ItemDaNota item2 = itemBuilder
                .comDescricao("item 2")
                .comValor(300).build();

        ItemDaNota item3 = itemBuilder
                .comDescricao("item 3")
                .comValor(400).build();

        NotaFiscalBuilder builder = new NotaFiscalBuilder();

        NotaFiscal nf = builder.acao(new EnviadorDeEmail())
                .paraEmpresa("Nome da Empresa")
                .cnpj("12.123.456/0001-00")
                .observacao(item1)
                .observacao(item2)
                .observacao(item3)
                .observacao("Observações")
                .acao(new NotaFiscalDao())
                .acao(new EnviadorDeSMS())
                .acao(new Impressora())
                .acao(new Multiplicador(4))
                .build();

        System.out.println(nf.getValorBruto());


    }
}
