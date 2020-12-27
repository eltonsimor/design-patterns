package facade_and_singleton;

public class Programa {

    public static void main(String[] args) {
        EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();

        String cpf = "cpf";
        Cliente cliente = new Cliente();

        double valor = 10.0D;
        facade.buscaCliente(cpf);
        facade.criaFatura(cliente, valor);

        Fatura fatura = new Fatura(cliente, valor);
        Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);

        facade.fazContato(cliente, cobranca);
        facade.geraCobranca(fatura);
    }
}
