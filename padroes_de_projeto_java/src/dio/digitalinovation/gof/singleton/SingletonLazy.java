package dio.digitalinovation.gof.singleton;

/**?
 *Singleton "Preguiçoso"
 * Precisa validar se há uma instanciaantes de retornar
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
