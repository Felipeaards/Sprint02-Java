public abstract class Usuario {
    private String nome;
    private String cpf;
    private String senhaAcesso;
    private String email;
    private String telefone;
    private String dataNascimento;
    private int verificadorLogin = 0;

    public Usuario(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int verificadorLogin) {
        this.nome = nome;
        this.cpf = cpf;
        this.senhaAcesso = senhaAcesso;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.verificadorLogin = verificadorLogin;
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

    public int getVerificadorLogin() {
        return verificadorLogin;
    }

    public void setVerificadorLogin(int verificadorLogin) {
        this.verificadorLogin = verificadorLogin;
    }

    public boolean realizarLogin(String cpf, String senhaAcesso) {
        if (getVerificadorLogin() == 0) {
            if (cpf.equals(getCpf()) && senhaAcesso.equals(getSenhaAcesso())) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Verificando os dados.....");
                System.out.println("Login realizado com sucesso!!");
                setVerificadorLogin(1);
                return true;
            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Verificando os dados.....");
                System.out.println("CPF ou Senha de Acesso incorretos, favor tentar novamente");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando.....");
            System.out.println("Você já está logado, não é possível realizar o login novamente. Faça Logout primeiro.");
            return false;
        }
    }

    public void realizarLogout(){
        if(getVerificadorLogin() == 1){
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando.....");
            System.out.println("Logout realizado com sucesso!!");
            setVerificadorLogin(0);
        } else{
            System.out.println("Você já está deslogado, não é possível realizar o Logout");
        }
    }
}
