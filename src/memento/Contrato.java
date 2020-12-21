package memento;

import java.util.Calendar;

import static memento.TipoContrato.*;

public class Contrato {

    private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Calendar getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void avanca() {
        switch (tipo) {
            case NOVO:
                tipo = EM_ANDAMENTO;
                break;
            case EM_ANDAMENTO:
                tipo = ACERTADO;
                break;
            case ACERTADO:
                tipo = CONCLUIDO;
                break;
            default:
                break;
        }
    }

    public Estado salvar() {
        Contrato contrato = new Contrato(this.data, this.cliente, this.tipo);
        return new Estado(contrato);
    }

    public void restaurar(Estado estado) {
        Contrato contrato = estado.getContrato();
        this.data = contrato.getData();
        this.tipo = contrato.getTipo();
        this.cliente = contrato.getCliente();
    }
}
