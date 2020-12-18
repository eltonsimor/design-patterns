package strategy;

public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto() {
        outroImposto = null;
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcula(Orcamento orcamento);

    protected double calculoDoOutroImposto(Orcamento orcamento) {
        return outroImposto == null ? 0 : outroImposto.calcula(orcamento);
    }

}
