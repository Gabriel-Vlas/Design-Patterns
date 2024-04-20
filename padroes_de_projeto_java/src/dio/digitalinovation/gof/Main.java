package dio.digitalinovation.gof;

import dio.digitalinovation.gof.facade.Facade;
import dio.digitalinovation.gof.singleton.SingletonEager;
import dio.digitalinovation.gof.singleton.SingletonLazy;
import dio.digitalinovation.gof.singleton.SingletonLazyHolder;
import dio.digitalinovation.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        // teste relacionado ao design pattener Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        Eager = SingletonEager.getInstancia();
        System.out.println(Eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo bot = new Robo();
        bot.setStrategy(normal);

        bot.mover();
        bot.mover();

        bot.setStrategy(agressivo);

        bot.mover();
        bot.mover();

        bot.setStrategy(defensivo);

        bot.mover();
        bot.mover();

        // FACADE
        Facade facade = new Facade();
        facade.migrarCliente("Valderson", "1481788");


    }
}
