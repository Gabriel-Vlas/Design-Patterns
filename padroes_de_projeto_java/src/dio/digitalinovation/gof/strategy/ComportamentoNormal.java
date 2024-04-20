package dio.digitalinovation.gof.strategy;

/*
 * STRATEGY - VARIAÇÃO 3
 * */

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
