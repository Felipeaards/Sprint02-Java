public class Clinica {
    private int idClinica;
    private String nomeClinica;
    private String documentoDentistaResponsavel;
    private String endereco;
    private String opcoesParaTratamentoDisponiveis;
    private String horarioAbertura;
    private String horarioFechamento;
    private String datasFuncionamento;

    public Clinica(int idClinica, String nomeClinica, String documentoDentistaResponsavel, String endereco, String opcoesParaTratamentoDisponiveis, String horarioAbertura, String horarioFechamento, String datasFuncionamento) {
        this.idClinica = idClinica;
        this.nomeClinica = nomeClinica;
        this.documentoDentistaResponsavel = documentoDentistaResponsavel;
        this.endereco = endereco;
        this.opcoesParaTratamentoDisponiveis = opcoesParaTratamentoDisponiveis;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.datasFuncionamento = datasFuncionamento;
    }

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getDocumentoDentistaResponsavel() {
        return documentoDentistaResponsavel;
    }

    public void setDocumentoDentistaResponsavel(String documentoDentistaResponsavel) {
        this.documentoDentistaResponsavel = documentoDentistaResponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getOpcoesParaTratamentoDisponiveis() {
        return opcoesParaTratamentoDisponiveis;
    }

    public void setOpcoesParaTratamentoDisponiveis(String opcoesParaTratamentoDisponiveis) {
        this.opcoesParaTratamentoDisponiveis = opcoesParaTratamentoDisponiveis;
    }

    public String getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(String horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public String getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(String horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    public String getDatasFuncionamento() {
        return datasFuncionamento;
    }

    public void setDatasFuncionamento(String datasFuncionamento) {
        this.datasFuncionamento = datasFuncionamento;
    }

    public void exibirInformacoesClinica(){
        System.out.println("------------------Informações da Clinica------------------");
        System.out.println("Nome da Clinica: "+ this.getNomeClinica());
        System.out.println("Endereço da Clinica: "+ this.getEndereco());
        System.out.println("Dias e Horários de funcionamento: "+ this.getDatasFuncionamento()+ ", das "+ this.getHorarioAbertura()+" até as "+ this.getHorarioFechamento());
    }

    public boolean atualizarHorarioAbertura(String novoHorarioAbertura){
        if (this.horarioAbertura.equals(novoHorarioAbertura)){
            System.out.println("----------------------------------------------------------");
            System.out.println("O Horário de abertura é igual ao horario anterior");
            return false;
        } else{
            System.out.println("----------------------------------------------------------");
            this.horarioAbertura = novoHorarioAbertura;
            System.out.println("Horario de abertura atualizado");
            return true;
        }
    }

    public boolean atualizarHorarioAFechamento(String novoHorarioFechamento){
        if (this.horarioFechamento.equals(novoHorarioFechamento)){
            System.out.println("----------------------------------------------------------");
            System.out.println("O Horário de fechamento é igual ao horario anterior");
            return false;
        } else{
            System.out.println("----------------------------------------------------------");
            this.horarioFechamento = novoHorarioFechamento;
            System.out.println("Horario de fechamento atualizado");
            return true;
        }
    }
}
