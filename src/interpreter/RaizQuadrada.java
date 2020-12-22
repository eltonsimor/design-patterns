package interpreter;

public class RaizQuadrada implements Expressao {

    private Expressao numero;

    public RaizQuadrada(Expressao expressao) {
        this.numero = expressao;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(numero.avalia());
    }
}
