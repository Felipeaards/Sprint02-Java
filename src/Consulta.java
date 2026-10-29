import java.util.Objects;

public class Consulta {
    private String localConsulta;
    private String cepLocal;
    private String nomeDentista;
    private String cpfDentista;
    private String nomeBeneficiario;
    private String cpfBeneficiario;
    private String dataConsulta;
    private String horarioConsulta;
    private String status;

    public Consulta(String localConsulta, String cepLocal, String nomeDentista, String cpfDentista, String nomeBeneficiario, String cpfBeneficiario, String dataConsulta, String horarioConsulta, String status){
        this.localConsulta = localConsulta;
        this.cepLocal = cepLocal;
        this.nomeDentista = nomeDentista;
        this.cpfDentista = cpfDentista;
        this.nomeBeneficiario = nomeBeneficiario;
        this.cpfBeneficiario = cpfBeneficiario;
        this.dataConsulta = dataConsulta;
        this.horarioConsulta = horarioConsulta;
        this.status = status;
    }

    public String getLocalConsulta() {
        return localConsulta;
    }

    public void setLocalConsulta(String localConsulta) {
        this.localConsulta = localConsulta;
    }

    public String getCepLocal() {
        return cepLocal;
    }

    public void setCepLocal(String cepLocal) {
        this.cepLocal = cepLocal;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        this.nomeDentista = nomeDentista;
    }

    public String getCpfDentista() {
        return cpfDentista;
    }

    public void setCpfDentista(String cpfDentista) {
        this.cpfDentista = cpfDentista;
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

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibirStatus(){
        System.out.println("--------------------Status da Consulta--------------------");
        System.out.println("Nome Beneficiário: "+ this.getNomeBeneficiario());
        System.out.println("Nome Dentista: "+ this.getNomeDentista());
        System.out.println("Data e Horário da Consulta: "+ this.getDataConsulta()+ ", "+this.getHorarioConsulta());
        System.out.println("Status da Consulta: " + this.getStatus());
    }

    public boolean atualizarStatusConsulta(String novoStatus){
        if(novoStatus.equals(this.status)){
            System.out.println("----------------------------------------------------------");
            System.out.println("O status atual já é "+ this.status);
            return false;
        } else {
            System.out.println("----------------------------------------------------------");
            this.status = novoStatus;
            System.out.println("Status ajustado para "+ novoStatus);
            return true;
        }
    }
}
