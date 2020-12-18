package strategy;

import java.util.Calendar;
import java.util.List;

public class Conta {
    private double saldo;
    private double valor;

    private Calendar dataAbertura;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }
}
