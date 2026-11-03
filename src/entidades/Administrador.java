package entidades;

public class Administrador extends Usuario{
    private int nivelAcesso;
    private int qtdCadastros = 0;
    private int qtdAlteracoes = 0;
    private int qtdExclusoes = 0;

    public Administrador(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int verificadorLogin, int nivelAcesso) {
        super(nome, cpf, senhaAcesso, email, telefone, dataNascimento, verificadorLogin);
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public int getQtdCadastros() {
        return qtdCadastros;
    }

    public void setQtdCadastros(int qtdCadastros) {
        this.qtdCadastros = qtdCadastros;
    }

    public int getQtdAlteracoes() {
        return qtdAlteracoes;
    }

    public void setQtdAlteracoes(int qtdAlteracoes) {
        this.qtdAlteracoes = qtdAlteracoes;
    }

    public int getQtdExclusoes() {
        return qtdExclusoes;
    }

    public void setQtdExclusoes(int qtdExclusoes) {
        this.qtdExclusoes = qtdExclusoes;
    }


    // Os objetos criados não são armazenados, pois ainda não estamos utilizando listas. Apenas para deixar registrado


    public boolean cadastrarBeneficiario(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, String nomeResponsavel, String cpfResponsavel, String telefoneResponsavel, String emailResponsavel, String cep, String status){
        if(getVerificadorLogin() == 1) {
            Beneficiario beneficiario = new Beneficiario(nome, cpf, senhaAcesso, email, telefone, dataNascimento, 0, nomeResponsavel, cpfResponsavel, telefoneResponsavel, emailResponsavel, cep, status);
            System.out.println("----------------------------------------------------------");
            System.out.println("Cadastrando beneficiário.....");
            System.out.println("Beneficiário "+ nome+ " cadastrado com sucesso!!");
            this.qtdCadastros++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean cadastrarDoadorPF(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento){
        if(getVerificadorLogin() == 1) {
            DoadorPF doadorPF = new DoadorPF(nome, cpf, senhaAcesso, email, telefone, dataNascimento, 0);
            System.out.println("----------------------------------------------------------");
            System.out.println("Cadastrando Doador PF.....");
            System.out.println("Doador PF "+ nome + " cadastrado com sucesso!!");
            this.qtdCadastros++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean cadastrarDoadorPJ(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, String nomeEmpresa, String cnpj){
        if(getVerificadorLogin() == 1) {
            DoadorPJ doadorPJ = new DoadorPJ(nome, cpf, senhaAcesso, email, telefone, dataNascimento, 0, nomeEmpresa, cnpj);
            System.out.println("----------------------------------------------------------");
            System.out.println("Cadastrando Doador PJ.....");
            System.out.println("Doador PJ "+ nome + " cadastrado com sucesso!!");
            this.qtdCadastros++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean cadastrarDentista(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, String cro, String cepClinica, String especialidade){
        if(getVerificadorLogin() == 1) {
            Dentista dentista = new Dentista(nome, cpf, senhaAcesso, email, telefone, dataNascimento, 0, cro, cepClinica, especialidade);
            System.out.println("----------------------------------------------------------");
            System.out.println("Cadastrando dentista.....");
            System.out.println("Dentista "+ nome + " cadastrado com sucesso!!");
            this.qtdCadastros++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean cadastrarAdministrador(String nome, String cpf, String senhaAcesso, String email, String telefone, String dataNascimento, int nivelAcesso){
        if(getVerificadorLogin() == 1) {
            if(this.nivelAcesso == 0) {
                Administrador administrador = new Administrador(nome, cpf, senhaAcesso, email, telefone, dataNascimento, 0, nivelAcesso);
                System.out.println("----------------------------------------------------------");
                System.out.println("Cadastrando administrador.....");
                System.out.println("Administrador " + nome + " cadastrado com sucesso!!");
                this.qtdCadastros++;
                return true;
            } else{
                System.out.println("----------------------------------------------------------");
                System.out.println("Você não tem permissão para realizar essa ação, contate um administrador de nível 0");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean excluirAdministrador(Administrador administrador){
        if(getVerificadorLogin() == 1) {
            if(this.nivelAcesso == 0) {
                if (!administrador.getCpf().equals(this.getCpf())) {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Procurando administrador.....");
                    System.out.println("Administrador " + administrador.getNome() + " excluído com sucesso!!");
                    this.qtdExclusoes++;
                    return true;
                } else {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Um administrador não pode excluir a si mesmo");
                    return false;
                }
            } else{
                System.out.println("----------------------------------------------------------");
                System.out.println("Você não tem permissão para realizar essa ação, contate um administrador de nível 0");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean excluirBeneficiario(Beneficiario beneficiario){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Procurando beneficiário.....");
            System.out.println("Beneficiário " + beneficiario.getNome() + " excluído com sucesso!!");
            this.qtdExclusoes++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean excluirDoadorPF(DoadorPF doadorPF){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Procurando doador PF.....");
            System.out.println("Doador PF " + doadorPF.getNome() + " excluído com sucesso!!");
            this.qtdExclusoes++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean excluirDoadorPJ(DoadorPJ doadorPJ){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Procurando doador PJ.....");
            System.out.println("Doador PJ " + doadorPJ.getNomeEmpresa() + " excluído com sucesso!!");
            this.qtdExclusoes++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean excluirDentista(Dentista dentista){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Procurando dentista.....");
            System.out.println("Dentista " + dentista.getNome() + " excluído com sucesso!!");
            this.qtdExclusoes++;
            return true;
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean atualizarDentista(Dentista dentista, String campo, String novoValor){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando informações para realizar a alteração......");
            switch (campo){
                case "nome":
                    if (getNivelAcesso() == 0) {
                        dentista.setNome(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "cpf":
                    if (getNivelAcesso() == 0) {
                        dentista.setCpf(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "senhaAcesso":
                    if (getNivelAcesso() == 0) {
                        dentista.setSenhaAcesso(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado com sucesso.");
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "email":
                    dentista.setEmail(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "telefone":
                    dentista.setTelefone(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "cro":
                    dentista.setCro(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "cepClinica":
                    dentista.setCepClinica(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "especialidade":
                    dentista.setEspecialidade(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                default:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("O campo '"+campo+"' não foi identificado, favor verificar se foi digitado corretamente");
                    return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean atualizarBeneficiario(Beneficiario beneficiario, String campo, String novoValor){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando informações para realizar a alteração......");
            switch (campo){
                case "nome":
                    if (getNivelAcesso() == 0) {
                        beneficiario.setNome(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "cpf":
                    if (getNivelAcesso() == 0) {
                        beneficiario.setCpf(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "senhaAcesso":
                    if (getNivelAcesso() == 0) {
                        beneficiario.setSenhaAcesso(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado com sucesso.");
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "email":
                    beneficiario.setEmail(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "telefone":
                    beneficiario.setTelefone(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "nomeResponsavel":
                    beneficiario.setNomeResponsavel(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "cpfResponsavel":
                    beneficiario.setCpfResponsavel(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "telefoneResponsavel":
                    beneficiario.setTelefoneResponsavel(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "emailResponsavel":
                    beneficiario.setEmailResponsavel(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "cep":
                    beneficiario.setCep(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "status":
                    beneficiario.setStatus(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                default:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("O campo '"+campo+"' não foi identificado, favor verificar se foi digitado corretamente");
                    return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean atualizarDoadorPF(DoadorPF doadorPF, String campo, String novoValor){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando informações para realizar a alteração......");
            switch (campo){
                case "nome":
                    if (getNivelAcesso() == 0) {
                        doadorPF.setNome(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "cpf":
                    if (getNivelAcesso() == 0) {
                        doadorPF.setCpf(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "senhaAcesso":
                    if (getNivelAcesso() == 0) {
                        doadorPF.setSenhaAcesso(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado com sucesso.");
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "email":
                    doadorPF.setEmail(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "telefone":
                    doadorPF.setTelefone(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                default:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("O campo '"+campo+"' não foi identificado, favor verificar se foi digitado corretamente");
                    return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean atualizarDoadorPJ(DoadorPJ doadorPJ, String campo, String novoValor){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando informações para realizar a alteração......");
            switch (campo){
                case "nome":
                    if (getNivelAcesso() == 0) {
                        doadorPJ.setNome(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "cpf":
                    if (getNivelAcesso() == 0) {
                        doadorPJ.setCpf(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "senhaAcesso":
                    if (getNivelAcesso() == 0) {
                        doadorPJ.setSenhaAcesso(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado com sucesso.");
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                case "email":
                    doadorPJ.setEmail(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "telefone":
                    doadorPJ.setTelefone(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "nomeEmpresa":
                    doadorPJ.setNomeEmpresa(novoValor);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                    this.qtdAlteracoes++;
                    return true;
                case "cnpj":
                    if (getNivelAcesso() == 0) {
                        doadorPJ.setCnpj(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo "+ campo+ " alterado para "+ novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                        return false;
                    }
                default:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("O campo '"+campo+"' não foi identificado, favor verificar se foi digitado corretamente");
                    return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public boolean atualizarAdministrador(Administrador administrador, String campo, String novoValor){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Verificando informações para realizar a alteração......");
            if (getNivelAcesso() == 0) {
                switch (campo) {
                    case "nome":
                        administrador.setNome(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo " + campo + " alterado para " + novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    case "cpf":
                        administrador.setCpf(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo " + campo + " alterado para " + novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    case "senhaAcesso":
                        administrador.setSenhaAcesso(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo " + campo + " alterado com sucesso.");
                        this.qtdAlteracoes++;
                        return true;
                    case "email":
                        administrador.setEmail(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo " + campo + " alterado para " + novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    case "telefone":
                        administrador.setTelefone(novoValor);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Campo " + campo + " alterado para " + novoValor);
                        this.qtdAlteracoes++;
                        return true;
                    default:
                        System.out.println("----------------------------------------------------------");
                        System.out.println("O campo '" + campo + "' não foi identificado, favor verificar se foi digitado corretamente");
                        return false;
                }
            } else{
                System.out.println("----------------------------------------------------------");
                System.out.println("Você não tem permissão para alterar esse campo, contate um administrador de nível 0");
                return false;
            }
        } else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
            return false;
        }
    }

    public void gerarRelatorio(String tipoRelatorio, String dataInicio, String dataFim){
        if(getVerificadorLogin() == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Gerando relatório de: " + tipoRelatorio);
            System.out.println("Período analisado: " + dataInicio + " até " + dataFim);

            switch (tipoRelatorio) {
                case "cadastros":
                    System.out.println("Total de novos cadastros realizados: " + this.qtdCadastros);
                    break;
                case "exclusoes":
                    System.out.println("Total de exclusões realizadas: " + this.qtdExclusoes);
                    break;
                case "alteracoes":
                    System.out.println("Total de alterações realizadas: " + this.qtdAlteracoes);
                    break;
                case "geral":
                    System.out.println("Resumo Geral do Período:");
                    System.out.println("- Cadastros: " + this.qtdCadastros);
                    System.out.println("- Alterações: " + this.qtdAlteracoes);
                    System.out.println("- Exclusões: " + this.qtdExclusoes);
                    break;
                default:
                    System.out.println("Erro: O tipo de relatório '" + tipoRelatorio + "' não é válido.");
                    System.out.println("Opções válidas: cadastros, exclusoes, alteracoes, geral.");
                    break;
            }
        } else {
            System.out.println("----------------------------------------------------------");
            System.out.println("Realize login primeiro para realizar essa função");
        }
    }

}
