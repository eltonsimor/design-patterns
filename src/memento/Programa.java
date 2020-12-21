package memento;

import java.util.Calendar;

import static memento.TipoContrato.NOVO;

public class Programa {

    public static void main(String[] args) {
        Historico historico = new Historico();
        Contrato contrato = new Contrato(Calendar.getInstance(), "João", NOVO);

        historico.adicionar(contrato.salvar());

        contrato.avanca();
        historico.adicionar(contrato.salvar());

        contrato.avanca();
        historico.adicionar(contrato.salvar());

        contrato.avanca();
        historico.adicionar(contrato.salvar());

        System.out.println(contrato.getTipo());
        contrato.restaurar(historico.getEstado(1));
        System.out.println(contrato.getTipo());
    }
}
