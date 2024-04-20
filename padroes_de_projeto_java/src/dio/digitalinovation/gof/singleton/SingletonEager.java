package dio.digitalinovation.gof.singleton;

/**
 *Singleton "Apressado"
 * Não precisa de validaçao pra instanciar, a instancia é feita
 * assim que o atributo é criado
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
