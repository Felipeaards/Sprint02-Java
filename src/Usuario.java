public abstract class Usuario {
    private String nome;
    private String cpf;
    private String senhaAcesso;
    private String email;
    private String telefone;
    private String dataNascimento;

    public Usuario(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.senhaAcesso = senhaAcesso;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean realizarLogin(String identificador, String senhaAcesso){
        if(identificador.equals(cpf) && senhaAcesso.equals(getSenhaAcesso())){
            System.out.println("Login realizado com sucesso!!");
            return true;
        } else {
            System.out.println("Identificador ou Senha de Acesso incorretos, favor tentar novamente");
            return false;
        }
    }

    public void realizarLogout(){
        System.out.println("Logout realizado com sucesso!!");
    }
}
