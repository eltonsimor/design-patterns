package builder;

public class TesteDaNotaFiscal {

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

        NotaFiscalBuilder notaBuilder = new NotaFiscalBuilder();
        notaBuilder.paraEmpresa("UOL")
            .cnpj("12.123.456/0001-00")
            .com(item1)
            .com(item2)
            .com(item3)
            .com("Observações");

        NotaFiscal nf = notaBuilder.build();

        System.out.println(nf.getValorBruto());
    }
}
