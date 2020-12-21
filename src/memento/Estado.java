package memento;

import java.util.Calendar;

import static java.util.Calendar.getInstance;

public class Estado {

    private Contrato contrato;
    private Calendar criadoEm;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
        this.criadoEm = getInstance();
    }

    public Contrato getContrato() {
        return contrato;
    }
}
