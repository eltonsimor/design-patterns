package strategy;

public class CalculadorDeImposto {

    public void calcula(Orcamento orcamento, Imposto imposto){
        double calculo = imposto.calcula(orcamento);
        System.out.println(calculo);
    }
}
