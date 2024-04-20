package dio.digitalinovation.gof.strategy;

/*
 * STRATEGY - VARIAÇÃO 2
 * */

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente...");
    }
}
