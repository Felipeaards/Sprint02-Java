public class DoadorPJ extends Doador{
    private String nomeEmpresa;
    private String cnpj;

    public DoadorPJ(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int verificadorLogin, String nomeEmpresa, String cnpj) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento, verificadorLogin);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
