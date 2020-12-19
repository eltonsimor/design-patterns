package observer;

import builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println("Salvei no Banco!");
    }
}
