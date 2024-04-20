package dio.digitalinovation.gof.strategy;

/*
 * STRATEGY - CLASSE QUE EXECUTA TODAS AS VARIAÇÕES DE ALGORITMO.
 * */

public class Robo {
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover(){
        strategy.mover();
    }

}
