public class Prontuario {
    private String nomeDentista;
    private String cro;
    private String nomeBeneficiario;
    private String cpfBeneficiario;
    private String anamneseBeneficiario;
    private String observacoesCasoAtual;
    private String diagnostico;
    private String metodoTratamento;
    private String evolucaoTratamento;
    private String observacoes;

    public Prontuario(String nomeDentista, String cro, String nomeBeneficiario, String cpfBeneficiario, String anamneseBeneficiario, String observacoesCasoAtual, String diagnostico, String metodoTratamento, String evolucaoTratamento, String observacoes) {
        this.nomeDentista = nomeDentista;
        this.cro = cro;
        this.nomeBeneficiario = nomeBeneficiario;
        this.cpfBeneficiario = cpfBeneficiario;
        this.anamneseBeneficiario = anamneseBeneficiario;
        this.observacoesCasoAtual = observacoesCasoAtual;
        this.diagnostico = diagnostico;
        this.metodoTratamento = metodoTratamento;
        this.evolucaoTratamento = evolucaoTratamento;
        this.observacoes = observacoes;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        this.nomeDentista = nomeDentista;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getCpfBeneficiario() {
        return cpfBeneficiario;
    }

    public void setCpfBeneficiario(String cpfBeneficiario) {
        this.cpfBeneficiario = cpfBeneficiario;
    }

    public String getAnamneseBeneficiario() {
        return anamneseBeneficiario;
    }

    public void setAnamneseBeneficiario(String anamneseBeneficiario) {
        this.anamneseBeneficiario = anamneseBeneficiario;
    }

    public String getObservacoesCasoAtual() {
        return observacoesCasoAtual;
    }

    public void setObservacoesCasoAtual(String observacoesCasoAtual) {
        this.observacoesCasoAtual = observacoesCasoAtual;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMetodoTratamento() {
        return metodoTratamento;
    }

    public void setMetodoTratamento(String metodoTratamento) {
        this.metodoTratamento = metodoTratamento;
    }

    public String getEvolucaoTratamento() {
        return evolucaoTratamento;
    }

    public void setEvolucaoTratamento(String evolucaoTratamento) {
        this.evolucaoTratamento = evolucaoTratamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void exibirInformacoesProntuario(){
        System.out.println("--------------------Prontuário--------------------");
        System.out.println("Nome do Dentista: "+ this.getNomeDentista());
        System.out.println("CRO: "+ this.getCro());
        System.out.println("Nome do Beneficiário: "+ this.getNomeBeneficiario());
        System.out.println("CPF do Beneficiário: "+this.getCpfBeneficiario());
        System.out.println("Anamnese: "+ this.getAnamneseBeneficiario());
        System.out.println("Observações Atuais: "+ this.getObservacoesCasoAtual());
        System.out.println("Diagnóstico: "+this.getDiagnostico());
        System.out.println("Método de Tratamento: "+this.getMetodoTratamento());
        System.out.println("Evolução do Tratamento: "+this.getEvolucaoTratamento());
        System.out.println("Observações Gerais: "+this.getObservacoes());
    }
}
