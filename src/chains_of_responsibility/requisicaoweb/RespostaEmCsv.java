package chains_of_responsibility.requisicaoweb;

import static chains_of_responsibility.requisicaoweb.Formato.CSV;

public class RespostaEmCsv implements Resposta {

    private Resposta proxima;

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if(requisicao.getFormato() == CSV)
            System.out.println(conta.getTitular() + "," + conta.getSaldo());
        else
            this.proxima.responde(requisicao, conta);
    }

    @Override
    public void setProxima(Resposta proxima) {
        this.proxima = proxima;
    }
}
