package observer;

import builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void execute(NotaFiscal notaFiscal){
        System.out.println("Enviei por Email!");
    }
}
