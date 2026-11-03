package main;

import entidades.*;

public class main {
    public static void main(String[] args){

        //Teste Clinica
        Clinica clinica01 = new Clinica(1, "Clinica Sorrisos", "123456", "02819-123", "Aparelho, Implante", "09:00", "18:00", "Segunda a Sexta");

        clinica01.exibirInformacoesClinica();
        clinica01.atualizarHorarioAbertura("08:00");
        clinica01.atualizarHorarioAbertura("08:00");
        clinica01.atualizarHorarioFechamento("17:00");
        clinica01.atualizarHorarioFechamento("17:00");
        clinica01.exibirInformacoesClinica();


        //Teste Consulta
        Consulta consulta01 = new Consulta("Clinica Sorrisos","02819-123", "Marcos", "123321", "Lesley", "765567", "17/11/2026", "15:30", "Pendente");
        Consulta consulta02 = new Consulta("Clinica Sorrisos","02819-123", "Marcos", "123321", "Patricia", "247395", "17/11/2026", "15:30", "Pendente");
        consulta01.exibirStatus();
        consulta01.atualizarStatusConsulta("Realizada");
        consulta01.exibirStatus();
        consulta01.atualizarStatusConsulta("Pendente"); //Para o teste em Beneficiário


        //Teste Doação
        Doacao doacao01 = new Doacao("Ronaldo", "213231", 50, "17/11/2026", "Completa");
        doacao01.exibirInformacoesDoacao();


        //Teste Prontuario
        Prontuario prontuario01 = new Prontuario("Marcos", "123RA", "Lesley", "765567", "Paciente relata dor aguda ao ingerir líquidos gelados. Nega alergias a medicamentos", "Apresenta leve inchaço na região do maxilar inferior direito e dificuldade de mastigação" , "Cárie profunda com comprometimento pulpar no dente 46. Gengivite leve", "Tratamento endodôntico (canal) e posterior restauração em resina", "Tratamento iniciado recentemente, sem evoluções", "Retorno agendado para troca do curativo em 15 dias. Receitado Ibuprofeno em caso de dor");
        Prontuario prontuario02 = new Prontuario("Marcos", "123RA", "Patricia", "247395", "Paciente relata dor aguda ao ingerir líquidos gelados. Nega alergias a medicamentos", "Apresenta leve inchaço na região do maxilar inferior direito e dificuldade de mastigação" , "Cárie profunda com comprometimento pulpar no dente 46. Gengivite leve", "Tratamento endodôntico (canal) e posterior restauração em resina", "Tratamento iniciado recentemente, sem evoluções", "Retorno agendado para troca do curativo em 15 dias. Receitado Ibuprofeno em caso de dor");
        prontuario01.exibirInformacoesProntuario();


        //Teste Beneficiario
        Beneficiario beneficiario01 = new Beneficiario("Lesley", "765567", "123Lesley", "lesley@gmail.com", "11 98765-4321", "11/11/2011", 0,"Chica","345654", "11 96543-1234", "Chica@gmail.com", "53468-913", "Ativo");
        beneficiario01.realizarLogin("765567", "123Lesley");
        beneficiario01.irConsulta(consulta01,"17/11/2026");
        beneficiario01.irConsulta(consulta01,"16/11/2026");
        beneficiario01.irConsulta(consulta01,"17/11/2026");
        beneficiario01.setCpf("765566");
        beneficiario01.irConsulta(consulta01,"17/11/2026");
        beneficiario01.irConsulta(consulta01,"16/11/2026");
        beneficiario01.setCpf("765567");
        beneficiario01.irConsulta(consulta01,"17/11/2026");
        beneficiario01.cancelarConsulta(consulta01, "17/11/2026");
        System.out.println(consulta01.getStatus());
        beneficiario01.cancelarConsulta(consulta01, "17/11/2026");
        //irConsulta com a consulta cancelada na data correta
        beneficiario01.irConsulta(consulta01,"17/11/2026");
        //cancelarConsulta com data sem consulta marcada
        beneficiario01.cancelarConsulta(consulta01, "16/11/2026");
        //cancelarConsulta com CPF diferente do da consulta
        beneficiario01.setCpf("765566");
        beneficiario01.cancelarConsulta(consulta01, "17/11/2026");
        beneficiario01.setCpf("765567");
        beneficiario01.solicitarProntuario(prontuario01);
        beneficiario01.exibirInfo();
        beneficiario01.solicitarProntuario(prontuario02);
        beneficiario01.realizarLogout();
        beneficiario01.exibirInfo();
        //Beneficiário sem login
        beneficiario01.irConsulta(consulta01,"17/11/2026");
        beneficiario01.cancelarConsulta(consulta01, "17/11/2026");
        beneficiario01.solicitarProntuario(prontuario01);



        //Teste Doador PF
        DoadorPF doadorPF01 = new DoadorPF("Renan", "654321", "123Renan", "Renan@gmail.com", "11 94002-8922", "13/08/1994", 0);
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.realizarLogout();
        doadorPF01.realizarLogin("654320", "123Renan");
        doadorPF01.realizarLogin("654321", "123Renaoo");
        doadorPF01.realizarLogout();
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.doarRedirecionamento();
        doadorPF01.consultarBeneficiario(beneficiario01);
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.doarRedirecionamento();
        doadorPF01.consultarBeneficiario(beneficiario01);
        doadorPF01.realizarLogout();
        doadorPF01.doarRedirecionamento();
        doadorPF01.consultarBeneficiario(beneficiario01);

        //Teste Doador PJ
        DoadorPJ doadorPJ01 = new DoadorPJ("Maria", "908089", "123Maria", "Maria@empresarial.com.br", "11 94332-9822", "20/02/2002", 0, "Empresa Empresarial", "11.111.111/0001-11");
        System.out.println("-------------------------------------------------------------------------------------");
        doadorPJ01. realizarLogout();
        doadorPJ01.realizarLogin("908089","123Maria");
        doadorPJ01.realizarLogin("908089","123Maria");
        doadorPJ01. realizarLogout();
        doadorPJ01.realizarLogin("108089","123Maria");
        doadorPJ01.realizarLogin("908089","133Maria");
        doadorPJ01. realizarLogout();
        doadorPJ01.realizarLogin("908089","123Maria");
        doadorPJ01.realizarLogin("908089","123Maria");
        doadorPJ01.doarRedirecionamento();
        doadorPJ01.consultarBeneficiario(beneficiario01);
        doadorPJ01.realizarLogout();
        doadorPJ01.doarRedirecionamento();
        doadorPJ01.consultarBeneficiario(beneficiario01);


        //Teste Dentista
        Dentista dentista01 = new Dentista("Marcos", "123321", "123Marcos", "marcos@gmail.com", "11 93433-1234", "19/12/1990", 0,"123RA","40045-230","Bucomaxilo");
        dentista01.realizarLogin("123321", "123Marcos");
        consulta01.atualizarStatusConsulta("Pendente");
        dentista01.realizarConsulta(beneficiario01, consulta01);
        //realizarConsulta com beneficiário de CPF diferente do da consulta
        dentista01.realizarConsulta(beneficiario01, consulta02);
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Inativo");
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Ativo");
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Ativo");

        dentista01.marcarConsulta(beneficiario01, consulta01, "18/11/2026");
        dentista01.marcarConsulta(beneficiario01, consulta01, "18/11/2026");
        //marcarConsulta com beneficiário de CPF diferente do da consulta
        dentista01.marcarConsulta(beneficiario01, consulta02, "18/11/2026");

        dentista01.preencherProntuario(null, beneficiario01, "Paciente relata dor aguda ao ingerir líquidos gelados. Nega alergias a medicamentos", "Apresenta leve inchaço na região do maxilar inferior direito e dificuldade de mastigação" , "Cárie profunda com comprometimento pulpar no dente 46. Gengivite leve", "Tratamento endodôntico (canal) e posterior restauração em resina", "Tratamento inciado recentemente, sem evoluções", "Retorno agendado para troca do curativo em 15 dias. Receitado Ibuprofeno em caso de dor");
        //preencherProntuario com prontuário já existente do mesmo beneficiário
        dentista01.preencherProntuario(prontuario01, beneficiario01, "Anamnese", "Observações atuais", "Diagnóstico", "Método de tratamento", "Evolução", "Observações gerais");
        //preencherProntuario com prontuário de outro beneficiário
        dentista01.preencherProntuario(prontuario02, beneficiario01, "Anamnese", "Observações atuais", "Diagnóstico", "Método de tratamento", "Evolução", "Observações gerais");
        dentista01.atualizarProntuario(prontuario01, beneficiario01, "Sessão concluída sem dor", "Reavaliar em 30 dias");
        //atualizarProntuario com prontuário de outro beneficiário
        dentista01.atualizarProntuario(prontuario02, beneficiario01, "Sessão concluída sem dor", "Reavaliar em 30 dias");

        dentista01.verificarDisponibilidadeConsulta(consulta01,"18/11/2026", "15:30");//data da consulta original alterada algumas linhas atrás
        dentista01.verificarDisponibilidadeConsulta(consulta01,"18/11/2026", "15:00");

        dentista01.cancelarConsulta(consulta01, beneficiario01, "18/11/2026");
        dentista01.cancelarConsulta(consulta01, beneficiario01, "18/11/2026");
        dentista01.cancelarConsulta(consulta01, beneficiario01, "17/11/2026");
        //cancelarConsulta com beneficiário de CPF diferente do da consulta
        dentista01.cancelarConsulta(consulta02, beneficiario01, "17/11/2026");
        //realizarConsulta com a consulta cancelada
        dentista01.realizarConsulta(beneficiario01, consulta01);
        dentista01.realizarLogout();
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Ativo");
        dentista01.realizarConsulta(beneficiario01, consulta02);
        //Dentista sem login
        dentista01.marcarConsulta(beneficiario01, consulta01, "20/11/2026");
        dentista01.cancelarConsulta(consulta01, beneficiario01, "18/11/2026");
        dentista01.preencherProntuario(null, beneficiario01, "Anamnese", "Observações atuais", "Diagnóstico", "Método de tratamento", "Evolução", "Observações gerais");
        dentista01.atualizarProntuario(prontuario01, beneficiario01, "Evolução", "Observações");
        dentista01.verificarDisponibilidadeConsulta(consulta01, "18/11/2026", "15:30");



        //Teste Administrador
        Administrador adminNivel0 = new Administrador("Lara", "475910", "123Lara", "lara@gmail.com", "11 92346-6536", "21/01/1993", 0, 0);
        Administrador adminNivel1 = new Administrador("José", "574385", "123Jose", "Jose@gmail.com", "11 96753-2356", "12/04/1999", 0, 1);
        System.out.println("----------------------------------------------------------");

        //Adm nível 0
        adminNivel0.cadastrarBeneficiario("Bruno", "123222", "123Bruno", "bruno@gmail.com", "11 94545-2020", "20/03/2014", "Sebastião", "123324", "11 92334-8448", "sebastiao@gmail.com", "01023-230", "Ativo");
        //Cadastros sem login
        adminNivel0.cadastrarDentista("Camila", "485930", "123Camila", "camila@gmail.com", "11 98475-3847", "05/06/1988", "12345SP", "05432-111", "Ortodontia");
        adminNivel0.cadastrarDoadorPF("Roberto", "839405", "123Roberto", "roberto@gmail.com", "11 97463-5241", "15/09/1975");
        adminNivel0.cadastrarDoadorPJ("Juliano", "485934", "123Juliano", "Juliano@techcorp.com", "11 38475-5930", "10/10/2000", "Tech Solutions LTDA", "12.345.678/0001-99");
        adminNivel0.cadastrarAdministrador("Amanda", "948573", "123Amanda", "amanda@gmail.com", "11 92837-4655", "30/11/1995", 1);
        adminNivel0.realizarLogin("475910", "123Lara");
        adminNivel0.cadastrarBeneficiario("Bruno", "123222", "123Bruno", "bruno@gmail.com", "11 94545-2020", "20/03/2014", "Sebastião", "123324", "11 92334-8448", "sebastiao@gmail.com", "01023-230", "Ativo");
        adminNivel0.cadastrarDentista("Camila", "485930", "123Camila", "camila@gmail.com", "11 98475-3847", "05/06/1988", "12345SP", "05432-111", "Ortodontia");
        adminNivel0.cadastrarDoadorPF("Roberto", "839405", "123Roberto", "roberto@gmail.com", "11 97463-5241", "15/09/1975");
        adminNivel0.cadastrarDoadorPJ("Juliano", "485934", "123Juliano", "Juliano@techcorp.com", "11 38475-5930", "10/10/2000", "Tech Solutions LTDA", "12.345.678/0001-99");
        adminNivel0.cadastrarAdministrador("Amanda", "948573", "123Amanda", "amanda@gmail.com", "11 92837-4655", "30/11/1995", 1);

        System.out.println("----------------------------------------------------------");
        System.out.println(beneficiario01.getTelefone());
        adminNivel0.atualizarBeneficiario(beneficiario01, "telefone", "11 98888-7777");
        System.out.println(beneficiario01.getTelefone());
        System.out.println("----------------------------------------------------------");
        System.out.println(dentista01.getNome());
        adminNivel0.atualizarDentista(dentista01, "nome", "Marcos Silva");
        System.out.println(dentista01.getNome());
        System.out.println("----------------------------------------------------------");
        System.out.println(doadorPF01.getCpf());
        adminNivel0.atualizarDoadorPF(doadorPF01, "cpf", "654321999");
        System.out.println(doadorPF01.getCpf());
        System.out.println("----------------------------------------------------------");
        System.out.println(doadorPJ01.getCnpj());
        adminNivel0.atualizarDoadorPJ(doadorPJ01, "cnpj", "11.111.111/0001-22");
        System.out.println(doadorPJ01.getCnpj());
        System.out.println("----------------------------------------------------------");
        System.out.println(adminNivel1.getEmail());
        adminNivel0.atualizarAdministrador(adminNivel1, "email", "jose.Nogueira@gmail.com");
        System.out.println(adminNivel1.getEmail());
        adminNivel0.atualizarBeneficiario(beneficiario01, "aaaa", "11 98888-7777");
        //Campo inválido nos demais métodos de atualização
        adminNivel0.atualizarDentista(dentista01, "aaaa", "valor");
        adminNivel0.atualizarDoadorPF(doadorPF01, "aaaa", "valor");
        adminNivel0.atualizarDoadorPJ(doadorPJ01, "aaaa", "valor");
        adminNivel0.atualizarAdministrador(adminNivel1, "aaaa", "valor");


        adminNivel0.excluirBeneficiario(beneficiario01);
        adminNivel0.excluirDoadorPF(doadorPF01);
        adminNivel0.excluirDoadorPJ(doadorPJ01);
        adminNivel0.excluirDentista(dentista01);
        adminNivel0.excluirAdministrador(adminNivel1);

        adminNivel0.gerarRelatorio("geral", "01/11/2026", "30/11/2026");
        adminNivel0.excluirAdministrador(adminNivel0);
        adminNivel0.realizarLogout();
        adminNivel0.excluirAdministrador(adminNivel0);
        //Adm nível 0 sem login
        adminNivel0.excluirBeneficiario(beneficiario01);
        adminNivel0.excluirDoadorPF(doadorPF01);
        adminNivel0.excluirDoadorPJ(doadorPJ01);
        adminNivel0.excluirDentista(dentista01);
        adminNivel0.atualizarBeneficiario(beneficiario01, "telefone", "11 90000-0000");
        adminNivel0.atualizarDentista(dentista01, "email", "teste@email.com");
        adminNivel0.atualizarDoadorPF(doadorPF01, "email", "teste@email.com");
        adminNivel0.atualizarDoadorPJ(doadorPJ01, "email", "teste@email.com");
        adminNivel0.atualizarAdministrador(adminNivel1, "email", "teste@email.com");
        adminNivel0.gerarRelatorio("geral", "01/11/2026", "30/11/2026");



        //Adm nível 1
        adminNivel1.realizarLogin("574385", "123Jose");
        adminNivel1.atualizarBeneficiario(beneficiario01, "cpf", "333222");

        adminNivel1.excluirAdministrador(adminNivel0);
        adminNivel1.cadastrarAdministrador("Fernando", "394857", "123Fernando", "fernando@gmail.com", "11 93847-5647", "05/05/1992", 1);

        adminNivel1.atualizarBeneficiario(beneficiario01, "cep", "02030-400");
        adminNivel1.atualizarAdministrador(adminNivel0, "nome", "Rodolfo");
        adminNivel1.atualizarDoadorPF(doadorPF01, "email", "emailteste@email.com");
        adminNivel1.atualizarDentista(dentista01, "email", "emailTesteeeeeee@email.com");
        //Campos restritos ao nível 0
        adminNivel1.atualizarDentista(dentista01, "nome", "Marcos Souza");
        adminNivel1.atualizarDoadorPF(doadorPF01, "cpf", "654321888");
        adminNivel1.atualizarDoadorPJ(doadorPJ01, "nome", "Maria Souza");
        adminNivel1.atualizarDoadorPJ(doadorPJ01, "cnpj", "11.111.111/0001-33");
        //Campo permitido ao nível 1 no Doador PJ
        adminNivel1.atualizarDoadorPJ(doadorPJ01, "nomeEmpresa", "Empresa Nova");


        adminNivel1.gerarRelatorio("geral", "01/11/2026", "30/11/2026");
        adminNivel1.gerarRelatorio("cadastros", "01/11/2026", "30/11/2026");
        adminNivel1.gerarRelatorio("exclusoes", "01/11/2026", "30/11/2026");
        adminNivel1.gerarRelatorio("alteracoes", "01/11/2026", "30/11/2026");
        adminNivel1.gerarRelatorio("aaaaaa", "01/11/2026", "30/11/2026");



    }
}