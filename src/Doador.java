public abstract class Doador extends Usuario{

    public Doador(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int verificadorLogin) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento, verificadorLogin);
    }

    public void doarRedirecionamento(){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Sendo redirecionado para o site de doações (Doare), aguarde.........");
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
        }
    }

    public void consultarBeneficiario(Beneficiario beneficiario){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            beneficiario.exibirInfo();
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
        }
    }

}
