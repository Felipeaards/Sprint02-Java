public abstract class Doador extends Usuario{

    public Doador(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento);
    }

    public void doarRedirecionamento(){
        System.out.println("Sendo redirecionado para o site de doações (Doare), aguarde.........");
    }

    public void consultarBeneficiario(Beneficiario beneficiario){
        beneficiario.exibirInfo();
    }

}
