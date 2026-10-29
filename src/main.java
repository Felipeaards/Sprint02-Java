public class main {
    public static void main(String[] args){

        //Teste Clinica
        Clinica clinica01 = new Clinica(1, "Clinica Sorrisos", "123456", "Rua 01", "Aparelho, Implante", "09:00", "18:00", "Segunda a Sexta");

        clinica01.exibirInformacoesClinica();
        clinica01.atualizarHorarioAbertura("08:00");
        clinica01.atualizarHorarioAFechamento("17:00");
        clinica01.exibirInformacoesClinica();


        //Teste Consulta
        Consulta consulta01 = new Consulta("Clinica Sorrisos","Rua 01", "Marcos", "123321", "Renato", "321123", "17/11/2026", "15:30", "Pendente");

        consulta01.exibirStatus();
        consulta01.atualizarStatusConsulta("Realizada");
        consulta01.exibirStatus();


        //Teste Doação
        Doacao doacao01 = new Doacao("Ronaldo", "213231", 50, "17/11/2026", "Completa");
        doacao01.exibirInformacoesDoacao();


        //Teste Prontuario
        Prontuario prontuario01 = new Prontuario("Marcos", "123RA", "Renato", "321123", "Paciente relata dor aguda ao ingerir líquidos gelados. Nega alergias a medicamentos", "Apresenta leve inchaço na região do maxilar inferior direito e dificuldade de mastigação" , "Cárie profunda com comprometimento pulpar no dente 46. Gengivite leve", "Tratamento endodôntico (canal) e posterior restauração em resina", "Tratamento inciado recentemente, sem evoluções", "Retorno agendado para troca do curativo em 15 dias. Receitado Ibuprofeno em caso de dor");
        prontuario01.exibirInformacoesProntuario();


        //Teste Doador PF
        Usuario doadorPF01 = new DoadorPF("Renan", "654321", "123Renan", "Renan@gmail.com", "11 94002-8922", "13/08/1994", 0);
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.realizarLogout();
        doadorPF01.realizarLogin("654320", "123Renan");
        doadorPF01.realizarLogin("654321", "123Renaoo");
        doadorPF01.realizarLogout();
        doadorPF01.realizarLogin("654321", "123Renan");
        doadorPF01.realizarLogin("654321", "123Renan");


        //Teste Doador PJ
        Usuario doadorPJ01 = new DoadorPJ("Maria", "908089", "123Maria", "Maria@empresarial.com.br", "11 94332-9822", "20/02/2002", 0, "Empresa Empresial Empresaria", "11.111.111/0001-11");
        System.out.println("-------------------------------------------------------------------------------------");
        doadorPJ01. realizarLogout();
        doadorPJ01.realizarLogin("908089","123Maria");
        doadorPJ01.realizarLogin("908089","123Maria");
        doadorPJ01. realizarLogout();
        doadorPJ01.realizarLogin("108089","123Maria");
        doadorPJ01.realizarLogin("908089","133Maria");
        doadorPJ01. realizarLogout();
        doadorPJ01.realizarLogin("908089","123Maria");




    }
}
