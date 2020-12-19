package observer;

import builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println("Nota Impressa!");
    }
}
