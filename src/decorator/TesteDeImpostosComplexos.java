package decorator;

import com.sun.org.apache.xpath.internal.operations.Or;
import strategy.ICMS;
import strategy.ISS;
import strategy.Imposto;
import strategy.Orcamento;
import template_method.ICPP;

public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS(new ICPP()));

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
}
