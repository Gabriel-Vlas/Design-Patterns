package dio.digitalinovation.gof.singleton;

/**
* Singleton lazy Holder
 **/

public class SingletonLazyHolder {

    private class instanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){

        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return instanceHolder.instancia;
    }

}
