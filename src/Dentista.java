public class Dentista extends Usuario{
    private String cro;
    private String cepClinica;
    private String especialidade;

    public Dentista(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int verificadorLogin, String cro, String cepClinica, String especialidade) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento, verificadorLogin);
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
        if(getVerificadorLogin() == 1) {
            if(beneficiario.getCpf().equals(consulta.getCpfBeneficiario())){
                System.out.println("----------------------------------------------------------");
                System.out.println("Paciente encontrado! Realizando consulta na data "+consulta.getDataConsulta());
                consulta.atualizarStatusConsulta("Realizada");
                System.out.println("Consulta realizada com sucesso!!!");
                return true;
            } else{
                System.out.println("O paciente não foi encontrado");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean atualizarStatusBeneficiario(Beneficiario beneficiario, String novoStatus){
        if(getVerificadorLogin() == 1) {
            if(beneficiario.getStatus().equals(novoStatus)){
                System.out.println("----------------------------------------------------------");
                System.out.println("O Status anterior é igual ao novo status, nenhuma alteração foi realizada.");
                return false;
            }else {
                beneficiario.setStatus(novoStatus);
                System.out.println("----------------------------------------------------------");
                System.out.println("O Status do Beneficiário " + beneficiario.getNome() + " foi alterado para " + novoStatus);
                return true;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean cancelarConsulta(Consulta consulta, Beneficiario beneficiario, String dataConsulta){
        if(getVerificadorLogin() == 1) {
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
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean marcarConsulta(Beneficiario beneficiario, Consulta consulta, String dataConsulta){
        if(getVerificadorLogin() == 1) {
            if(beneficiario.getCpf().equals(consulta.getCpfBeneficiario()) && consulta.getStatus().equals("Realizada")){
                System.out.println("Nova consulta marcada para o dia "+ dataConsulta);
                consulta.setDataConsulta(dataConsulta);
                return true;
            } else if (beneficiario.getCpf().equals(consulta.getCpfBeneficiario()) && !consulta.getStatus().equals("Realizada")) {
                System.out.println("O Beneficiário já tem uma consulta marcada para a data "+ consulta.getDataConsulta());
                return false;
            } else {
                System.out.println("O Beneficiário não tem registro no sistema. Favor entrar em contato com a Turma Do Bem para que eles informem o dentista parceiro mais próximo de sua localização");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean preencherProntuario(Prontuario prontuario, String nomeBeneficiario, String cpfBeneficiario, String anamneseBeneficiario, String observacoesCasoAtual, String diagnostico, String metodoTratamento, String evolucaoTratamento, String observacoes){
        if(getVerificadorLogin() == 1) {
            if(!prontuario.getCpfBeneficiario().equals(cpfBeneficiario)) {
                Prontuario prontuarioo = new Prontuario(getNome(), getCro(), nomeBeneficiario, cpfBeneficiario, anamneseBeneficiario, observacoesCasoAtual, diagnostico, metodoTratamento, evolucaoTratamento, observacoes);
                System.out.println("Prontuário Preenchido!!");
                return true;
            } else{
                System.out.println("O Prontuário desse Beneficiário já foi criado, favor usar a função de Atualizar Prontuário caso queira alterar alguma informação");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }

    }

    public boolean atualizarProntuario(Prontuario prontuario, String cpfBeneficiario, String novaEvolucao, String novasObservacoes){
        if(getVerificadorLogin() == 1) {
            if (prontuario.getCpfBeneficiario().equals(cpfBeneficiario)){
                prontuario.setEvolucaoTratamento(novaEvolucao);
                prontuario.setObservacoesCasoAtual(novasObservacoes);
                System.out.println("As informações foram atualizadas com sucesso");
                return true;
            } else{
                System.out.println("O Beneficiário informado ainda não tem um prontuário, favor utilizar a função Preencher Prontuário");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }


}
