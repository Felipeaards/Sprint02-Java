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

    public boolean irConsulta(Consulta consulta, String dataConsulta){
        if(getVerificadorLogin() == 1) {
            if(consulta.getCpfBeneficiario().equals(getCpf())){
                System.out.println("----------------------------------------------------------");
                System.out.println("Verificando se existem consultas marcadas para "+ dataConsulta+"........");
                if(consulta.getDataConsulta().equals(dataConsulta) && !consulta.getStatus().equals("Realizada") && !consulta.getStatus().equals("Cancelada")){
                    System.out.println("Consulta encontrada na data "+ dataConsulta+"!!");
                    System.out.println("Check-in realizado! Aguardando o dentista iniciar o atendimento...");
                    return true;
                } else if (consulta.getStatus().equals("Cancelada")){
                    System.out.println("A consulta marcada para a data informada está cancelada, favor entrar em contato com o Dentista para marcar uma nova");
                    return false;
                } else{
                    System.out.println("Não foram localizadas consultas nessa data ou ela já foi realizada, verifique com o Dentista responsável");
                    return false;
                }
            } else{
                System.out.println("----------------------------------------------------------");
                System.out.println("Não foram localizadas consultas marcadas para esse paciente, favor verificar com o dentista responsável");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean cancelarConsulta(Consulta consulta, String dataConsulta){
        if(getVerificadorLogin() == 1) {
            if(consulta.getCpfBeneficiario().equals(getCpf())){
                System.out.println("----------------------------------------------------------");
                System.out.println("Verificando se existem consultas marcadas para "+ dataConsulta+"........");
                if(consulta.getDataConsulta().equals(dataConsulta) && !consulta.getStatus().equals("Cancelada")){
                    System.out.println("Consulta encontrada na data "+ dataConsulta+"!!");
                    System.out.println("Aguarde........");
                    System.out.println("Cancelamento realizado com sucesso!!");
                    consulta.setStatus("Cancelada");
                    return true;
                }
                else{
                    System.out.println("A consulta marcada para a data "+dataConsulta+" já está cancelada.");
                    return false;
                }
            } else{
                System.out.println("----------------------------------------------------------");
                System.out.println("Não foram localizadas consultas marcadas para esse paciente, favor verificar com o dentista responsável");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public void solicitarProntuario(Prontuario meuProntuario){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Solicitando informações de prontuário.......");
            meuProntuario.exibirInformacoesProntuario();
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
        }
    }

    public void exibirInfo(){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Buscando informações do Beneficiário......");
            System.out.println("Informações encontradas! Seguem abaixo");
            System.out.println("Nome do Beneficiário: "+this.getNome());
            System.out.println("Data de Nascimento: "+this.getDataNascimento());
            System.out.println("Nome do Responsável: "+this.getNomeResponsavel());
            System.out.println("Telefone do Responsável: "+this.getTelefoneResponsavel());
            System.out.println("Status do Beneficiário: "+this.getStatus());
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
        }
    }
}
