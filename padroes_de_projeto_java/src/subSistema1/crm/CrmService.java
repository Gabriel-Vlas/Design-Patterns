package subSistema1.crm;
/*
* SUBSISTEMA CRM CRIADO PARA TESTE DE REDUÇÃO DE COMPLEXIDADE COM FACADE
*
* */
public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no Sistema CRM");
        System.out.print(nome +" "+ cep +" "+ cidade +" "+ estado);
    }

}
