package dio.digitalinovation.gof.strategy;

/*
 * STRATEGY - VARIAÇÃO 1
 * */

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
