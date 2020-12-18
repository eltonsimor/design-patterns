package chains_of_responsibility.requisicaoweb;

public class TestaRespostas {

    public static void main(String[] args) {
        Requisicao requisicao = new Requisicao(Formato.XML);
        Conta conta = new Conta("Elton", 500000.00);
        FormatadorDeRespostas respostas = new FormatadorDeRespostas();
        respostas.resposta(requisicao, conta);
    }
}
