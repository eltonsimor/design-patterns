package chains_of_responsibility.requisicaoweb;

public class SemResposta implements Resposta {

    @Override
    public void responde(Requisicao requisicao, Conta conta) {}

    @Override
    public void setProxima(Resposta proxima) {}
}
