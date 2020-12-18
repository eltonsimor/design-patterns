package chains_of_responsibility.requisicaoweb;

public interface Resposta {
    void responde(Requisicao requisicao, Conta conta);
    void setProxima(Resposta proxima);
}
