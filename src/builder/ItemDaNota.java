package builder;

public class ItemDaNota {

    private final String descricao;
    private final double valor;

    public ItemDaNota(String nome, double valor) {
        this.descricao = nome;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
