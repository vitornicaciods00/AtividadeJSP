<%@page import="Soccer.SCCP"%>
<%@page import="Soccer.SEP"%>
<%@page import="Soccer.SFC"%>
<%@page import="Soccer.SPFC"%>
<%@page import="others.GetMatriz"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="others.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GAME: Papel, Pedra e Tesoura</title>
    </head>
    
    <body>
        <header>
            <h1>JOGO</h1>
        </header>
        <section id="Principal">
            <form action="Jogada.jsp" name="Formulary" method="GET" id="Form" target="Resultado">
                <fieldset>
                    <legend>Opções de Jogadas</legend>
                    <p>Selecione apenas uma opção para jogada:</p>
                    <input type="checkbox" name="Option" id="Papel" value="Papel"><label for="Papel">Papel</label>
                    <input type="checkbox" name="Option" id="Pedra" value="Pedra"><label for="Pedra">Pedra</label>
                    <input type="checkbox" name="Option" id="Tesoura" value="Tesoura"><label for="Tesoura">Tesoura</label>
                </fieldset>
                </br>
                <input type="submit" name="enviar" id="Button" value="Clique aqui">
            </form>
            </br>
            <div id="div_resposta">
                <iframe name="Resultado" id="Janela-resposta" height="144" width="484"></iframe>
            </div>
            <%
                out.print(new GetMatriz().GetMesesDoAno());
        %>
            <%
            
                int Ano_atual = Calendar.getInstance().get(Calendar.YEAR);
                
            List<Pessoa> User = new ArrayList<Pessoa>();
            
            User.add(new Pessoa("Ricardo Fontes","091.283.746 - 05","55.248.369 - 7","São Paulo","SP","Fevereiro","Masculino","Branco",13,(Ano_atual - 2000),2000,"r_fontes@gmail.com","(11) 9 9876-4321"));
            User.add(new Pessoa("Maria Júlia","987.123.456 - 08","55.416.525 - 3","Belo Horizonte","MG","Agosto","Feminino","Branco",16,(Ano_atual - 2001),2001,"mj_01@gmail.com","(31) 9 0918-5432"));
            User.add(new Pessoa("Vitor Emanoel","981.864.749 - 03","55.124.225 - 5","Campo Grande","MS","Janeiro","Masculino","Branco",31,(Ano_atual - 2001),2001,"v_emanoel31@gmail.com","(67) 9 6150-9876"));
            User.add(new Pessoa("Isabela Freitas","256.324.400 - 09","55.006.529 - 2","Curitiba","PR","Março","Feminino","Branco",30,(Ano_atual - 2002),2002,"isa_f30@gmail.com","(41) 9 1632-4864"));
            
            for(Pessoa Usuario : User){
                out.print("<h2>DADOS DO(A) " + Usuario.getNome() + "</h2>");
                out.print("<p>Data de nascimento: " + Usuario.getDia() + " de " + Usuario.getMes() + " de " + Usuario.getAno() + "</p>");
                out.print("<p>Idade: " + Usuario.getIdade() + " anos</p>");
                out.print("<p>CPF: " + Usuario.getCPF() + "</p>");
                out.print("<p>RG : " + Usuario.getRG() + "</p>");
                out.print("<p>Local de origem: " + Usuario.getCidadeNatal() + " - " + Usuario.getUF() + "</p>");
                out.print("<p>Gênero: " + Usuario.getGenero() + "</p>");
                out.print("<p>Etnia: " + Usuario.getEtnia() + "</p>");
                out.print("<p>E-mail: " + Usuario.getEmail() + "</p>");
                out.print("<p>Telefone: " + Usuario.getTelefone() + "</p>");
                out.print("<hr>");
            }
        %>
            <%
            
            SPFC SaoPaulo = new SPFC();
            SFC Santos = new SFC();
            SEP Palmeiras = new SEP();
            SCCP Corinthians = new SCCP();
            
            SaoPaulo.setNameOfClub("São Paulo F.C.");
            SaoPaulo.setDayOfFoundation(25);
            SaoPaulo.setMonthOfFoundation("Janeiro");
            SaoPaulo.setYearOfFoundation(1930);
            SaoPaulo.setColorOfClub("Preto, Branco e Vermelho");
            SaoPaulo.setCopaDoMundoDeClubesDaFIFA(1);
            SaoPaulo.setCopaIntercontinental(2);
            SaoPaulo.setCopaLibertadoresDaAmerica(3);
            SaoPaulo.setCopaSul_americana(1);
            SaoPaulo.setRecopaSul_americana(2);
            SaoPaulo.setCopaConmebol(1);
            SaoPaulo.setSupercopaLibertadores(1);
            SaoPaulo.setCopaMasterDaConmebol(1);
            SaoPaulo.setCampeonatoBrasileiro(6);
            
            Santos.setNameOfClub("Santos F.C.");
            Santos.setDayOfFoundation(14);
            Santos.setMonthOfFoundation("Abril");
            Santos.setYearOfFoundation(1912);
            Santos.setColorOfClub("Preto e Branco");
            Santos.setCopaIntercontinental(2);
            Santos.setRecopaDosCampeoesIntercontinentais(1);
            Santos.setCopaLibertadoresDaAmerica(3);
            Santos.setRecopaSul_americana(1);
            Santos.setSupercopaSul_americanaDosCampeoesIntercontinentais(1);
            Santos.setCopaConmebol(1);
            Santos.setCampeonatoBrasileiro(8);
            Santos.setCopaDoBrasil(1);
            
            Palmeiras.setNameOfClub("S.E. Palmeiras");
            Palmeiras.setDayOfFoundation(27);
            Palmeiras.setMonthOfFoundation("Agosto");
            Palmeiras.setYearOfFoundation(1914);
            Palmeiras.setColorOfClub("Verde e Branco");
            Palmeiras.setCopaRio(1);
            Palmeiras.setCopaLibertadoresDaAmerica(2);
            Palmeiras.setCopaMercosul(1);
            Palmeiras.setCampeonatoBrasileiro(10);
            Palmeiras.setCopaDoBrasil(4);
            Palmeiras.setCopaDosCampeoes(1);
            
            Corinthians.setNameOfClub("S.C. Corinthians P.");
            Corinthians.setDayOfFoundation(1);
            Corinthians.setMonthOfFoundation("Setembro");
            Corinthians.setYearOfFoundation(1910);
            Corinthians.setColorOfClub("Preto e Branco");
            Corinthians.setCopaDoMundoDeClubesDaFIFA(2);
            Corinthians.setCopaLibertadoresDaAmerica(1);
            Corinthians.setRecopaSul_americana(1);
            Corinthians.setCampeonatoBrasileiro(7);
            Corinthians.setCopaDoBrasil(3);
            Corinthians.setSupercopaDoBrasil(1);
            
            out.print(SaoPaulo.GetInfoSaoPaulo());
            out.print(Santos.GetInfoSantos());
            out.print(Palmeiras.GetInfoPalmeiras());
            out.print(Corinthians.GetInfoCorinthians());
            
        %>
        </section>
    </body>
</html>
