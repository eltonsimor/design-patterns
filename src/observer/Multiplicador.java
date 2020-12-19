package observer;

import builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota{

    private final double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println(notaFiscal.getValorBruto() * this.fator);
    }
}
