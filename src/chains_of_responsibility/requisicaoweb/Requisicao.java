package chains_of_responsibility.requisicaoweb;

public class Requisicao {
    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
