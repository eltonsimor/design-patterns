package chains_of_responsibility.requisicaoweb;

public class FormatadorDeRespostas {

    public void resposta(Requisicao requisicao, Conta conta){
        Resposta r1 = new RespostaEmCsv();
        Resposta r2 = new RespostaEmPorcento();
        Resposta r3 = new RespostaEmXml();
        Resposta r4 = new SemResposta();

        r1.setProxima(r2);
        r2.setProxima(r3);
        r3.setProxima(r4);

        r1.responde(requisicao, conta);
    }
}
