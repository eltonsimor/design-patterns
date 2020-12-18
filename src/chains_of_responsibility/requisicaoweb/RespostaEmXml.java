package chains_of_responsibility.requisicaoweb;

import static chains_of_responsibility.requisicaoweb.Formato.XML;

public class RespostaEmXml implements Resposta {

    private Resposta proxima;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if(requisicao.getFormato() == XML)
            System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        else
            this.proxima.responde(requisicao, conta);
    }

    @Override
    public void setProxima(Resposta proxima) {
        this.proxima = proxima;
    }
}
