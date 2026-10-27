public class Dentista extends Usuario{
    private String cro;
    private String cepClinica;
    private String especialidade;

    public Dentista(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, String cro, String cepClinica, String especialidade) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento);
        this.cro = cro;
        this.cepClinica = cepClinica;
        this.especialidade = especialidade;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getCepClinica() {
        return cepClinica;
    }

    public void setCepClinica(String cepClinica) {
        this.cepClinica = cepClinica;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean realizarConsulta(Beneficiario beneficiario, Consulta consulta){
        if(beneficiario.getCpf().equals(consulta.getCpfBeneficiario())){
            System.out.println("Paciente encontrado! Realizando consulta na data "+consulta.getDataConsulta());
            consulta.atualizarStatusConsulta("Realizada");
            System.out.println("Consulta realizada com sucesso!!!");
            return true;
        } else{
            System.out.println("O paciente não foi encontrado");
            return false;
        }
    }

    public boolean atualizarStatusBeneficiario(Beneficiario beneficiario, String novoStatus){
        if(beneficiario.getStatus().equals(novoStatus)){
            System.out.println("O Status anterior é igual ao novo status, nenhuma alteração foi realizada.");
            return false;
        }else {
            beneficiario.setStatus(novoStatus);
            System.out.println("O Status do Beneficiário " + beneficiario.getNome() + " foi alterado para " + novoStatus);
            return true;
        }
    }

    public boolean cancelarConsulta(Consulta consulta, Beneficiario beneficiario, String dataConsulta){
        if(beneficiario.getCpf().equals(consulta.getCpfBeneficiario())){
            if(consulta.getDataConsulta().equals(dataConsulta)){
                System.out.println("Consulta cancelada!");
                consulta.atualizarStatusConsulta("Cancelada");
                return true;
            } else{
                System.out.println("Não existe consulta para essa data");
                return false;
            }
        } else{
            System.out.println("O Beneficiário não tem nenhuma consulta marcada");
            return false;
        }
    }

}
