public class main {
    public static void main(String[] args){

        //Teste Clinica
        Clinica clinica01 = new Clinica(1, "Clinica Sorrisos", "123456", "Rua 01", "Aparelho, Implante", "09:00", "18:00", "Segunda a Sexta");

        clinica01.exibirInformacoesClinica();
        clinica01.atualizarHorarioAbertura("08:00");
        clinica01.atualizarHorarioFechamento("17:00");
        clinica01.exibirInformacoesClinica();


        //Teste Consulta
        Consulta consulta01 = new Consulta("Clinica Sorrisos","Rua 01", "Marcos", "123321", "Lesley", "765567", "17/11/2026", "15:30", "Pendente");

        consulta01.exibirStatus();
        consulta01.atualizarStatusConsulta("Realizada");
        consulta01.exibirStatus();
        consulta01.atualizarStatusConsulta("Pendente"); //Para o teste em Beneficiário


        //Teste Doação
        Doacao doacao01 = new Doacao("Ronaldo", "213231", 50, "17/11/2026", "Completa");
        doacao01.exibirInformacoesDoacao();


        //Teste Prontuario
        Prontuario prontuario01 = new Prontuario("Marcos", "123RA", "Lesley", "765567", "Paciente relata dor aguda ao ingerir líquidos gelados. Nega alergias a medicamentos", "Apresenta leve inchaço na região do maxilar inferior direito e dificuldade de mastigação" , "Cárie profunda com comprometimento pulpar no dente 46. Gengivite leve", "Tratamento endodôntico (canal) e posterior restauração em resina", "Tratamento inciado recentemente, sem evoluções", "Retorno agendado para troca do curativo em 15 dias. Receitado Ibuprofeno em caso de dor");
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
        beneficiario01.solicitarProntuario(prontuario01);
        beneficiario01.exibirInfo();
        beneficiario01.realizarLogout();


        //Teste Doador PF
        Doador doadorPF01 = new DoadorPF("Renan", "654321", "123Renan", "Renan@gmail.com", "11 94002-8922", "13/08/1994", 0);
        System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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

        //Teste Doador PJ
        Doador doadorPJ01 = new DoadorPJ("Maria", "908089", "123Maria", "Maria@empresarial.com.br", "11 94332-9822", "20/02/2002", 0, "Empresa Empresial Empresaria", "11.111.111/0001-11");
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
        System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");


        //Teste Dentista
        Dentista dentista01 = new Dentista("Marcos", "123321", "123Marcos", "marcos@gmail.com", "11 93433-1234", "19/12/1990", 0,"123RA","40045-230","Bucomaxilo");
        dentista01.realizarLogin("123321", "123Marcos");
        dentista01.realizarConsulta(beneficiario01, consulta01);
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Inativo");
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Ativo");
        dentista01.atualizarStatusBeneficiario(beneficiario01, "Ativo");

        dentista01.marcarConsulta(beneficiario01, consulta01, "18/11/2026");
        dentista01.marcarConsulta(beneficiario01, consulta01, "18/11/2026");

        dentista01.preencherProntuario(null, beneficiario01, "Paciente relata dor aguda ao ingerir líquidos gelados. Nega alergias a medicamentos", "Apresenta leve inchaço na região do maxilar inferior direito e dificuldade de mastigação" , "Cárie profunda com comprometimento pulpar no dente 46. Gengivite leve", "Tratamento endodôntico (canal) e posterior restauração em resina", "Tratamento inciado recentemente, sem evoluções", "Retorno agendado para troca do curativo em 15 dias. Receitado Ibuprofeno em caso de dor");
        dentista01.atualizarProntuario(prontuario01, beneficiario01, "Sessão concluída sem dor", "Reavaliar em 30 dias");

        dentista01.verificarDisponibilidadeConsulta(consulta01,"18/11/2026", "15:30");//data da consulta original alterada na linha 83
        dentista01.verificarDisponibilidadeConsulta(consulta01,"18/11/2026", "15:00");

        dentista01.cancelarConsulta(consulta01, beneficiario01, "18/11/2026");
        dentista01.cancelarConsulta(consulta01, beneficiario01, "18/11/2026");
        dentista01.cancelarConsulta(consulta01, beneficiario01, "17/11/2026");


    }
}
