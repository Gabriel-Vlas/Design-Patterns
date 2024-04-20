package subSistema2.cep;

/*
 * SUBSISTEMA CEP CRIADO PARA TESTE DE REDUÇÃO DE COMPLEXIDADE COM FACADE
 *
 * */

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){

        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }

}
