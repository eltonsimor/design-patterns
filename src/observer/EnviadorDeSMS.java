package observer;

import builder.NotaFiscal;

public class EnviadorDeSMS implements AcaoAposGerarNota{

    @Override
    public void execute(NotaFiscal nf) {
        System.out.println("Enviei por SMS!");
    }
}
