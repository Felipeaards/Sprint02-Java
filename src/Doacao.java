public class Doacao {
    private String nomeDoador;
    private String documentoDoador;
    private double valorDoado;
    private String dataDoacao;
    private String status;

    public Doacao(String nomeDoador, String documentoDoador, double valorDoado, String dataDoacao, String status){
        this.nomeDoador = nomeDoador;
        this.documentoDoador = documentoDoador;
        this.valorDoado = valorDoado;
        this.dataDoacao = dataDoacao;
        this.status = status;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public String getDocumentoDoador() {
        return documentoDoador;
    }

    public void setDocumentoDoador(String documentoDoador) {
        this.documentoDoador = documentoDoador;
    }

    public double getValorDoado() {
        return valorDoado;
    }

    public void setValorDoado(double valorDoado) {
        this.valorDoado = valorDoado;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(String dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibirInformacoesDoacao(){
        System.out.println("-------------------Informações Doação--------------------");
        System.out.println("Nome do Doador: "+ this.getNomeDoador());
        System.out.println("Documento do Doador: "+ this.getDocumentoDoador());
        System.out.println("Valor Doado: "+ this.getValorDoado());
        System.out.println("Data da Doação: "+ this.getDataDoacao());
        System.out.println("Status da Doação: "+ this.getStatus());
    }
}
