public class Beneficiario extends Usuario{
    private String nomeResponsavel;
    private String cpfResponsavel;
    private String telefoneResponsavel;
    private String emailResponsavel;
    private String cep;
    private String status;

    public Beneficiario(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int verificadorLogin, String nomeResponsavel, String cpfResponsavel, String telefoneResponsavel, String emailResponsavel, String cep, String status) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento, verificadorLogin);
        this.nomeResponsavel = nomeResponsavel;
        this.cpfResponsavel = cpfResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.emailResponsavel = emailResponsavel;
        this.cep = cep;
        this.status = status;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean irConsulta(String dataConsulta){
        System.out.println("Indo para a consulta na data "+ dataConsulta+"........");
        return true;
    }

    public boolean cancelarConsulta(String dataConsulta){
        System.out.println("Cancelando consulta da data "+ dataConsulta+"........");
        return true;
    }

    public void solicitarProntuario(Prontuario meuProntuario){
        System.out.println("Solicitando informações de prontuário.......");
        meuProntuario.exibirInformacoesProntuario();
    }

    public void exibirInfo(){
        System.out.println("Buscando informações do Beneficiário......");
        System.out.println("Informações encontradas! Seguem abaixo");
        System.out.println("Nome do Beneficiário: "+this.getNome());
        System.out.println("Data de Nascimento: "+this.getDataNascimento());
        System.out.println("Nome do Responsável: "+this.getNomeResponsavel());
        System.out.println("Telefone do Responsável: "+this.getTelefoneResponsavel());
        System.out.println("Status do Beneficiário: "+this.getStatus());
    }
}
