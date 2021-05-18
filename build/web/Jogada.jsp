<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                
                String Valor = request.getParameter("Option");
                String[] Option = {"Papel","Pedra","Tesoura"};
                Random n = new Random();
                int Numero_aleatorio = n.nextInt(3);

                if(Valor.equalsIgnoreCase("Papel")){ // PAPEL
                    if(Numero_aleatorio == 0){ // PAPEL
                        out.print("<p>EMPATOU ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                    }
                    else if(Numero_aleatorio == 1){ // PEDRA
                        out.print("<p>O USUÁRIO GANHOU ;) ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                    }
                    else{
                        if(Numero_aleatorio == 2){ // TESOURA
                            out.print("<p>O USUÁRIO PERDEU :( ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                        }
                    }
                }
                else if(Valor.equalsIgnoreCase("Pedra")){ // PEDRA
                    if(Numero_aleatorio == 0){ // PAPEL
                        out.print("<p>O USUÁRIO PERDEU :( ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                    }
                    else if(Numero_aleatorio == 1){ // PEDRA
                        out.print("<p>EMPATOU ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                    }
                    else{
                        if(Numero_aleatorio == 2){ // TESOURA
                            out.print("<p>O USUÁRIO GANHOU ;) ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                        }
                    }
                }
                else{
                    if(Valor.equalsIgnoreCase("Tesoura")){ // TESOURA
                        if(Numero_aleatorio == 0){ // PAPEL
                            out.print("<p>O USUÁRIO GANHOU ;) ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                        }
                        else if(Numero_aleatorio == 1){ // PEDRA
                            out.print("<p>O USUÁRIO PERDEU :( ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                        }
                        else{
                            if(Numero_aleatorio == 2){ // TESOURA
                                out.print("<p>EMPATOU ... !</p><p>- O usuário jogou " + Valor + " e o P.C. jogou " + Option[Numero_aleatorio] + "</p>");
                            }
                        }
                    }
                }
            }
            catch(Exception Erro){
                out.print("<p>Error :( ..." + Erro + "</p>");
            }
        %>
    </body>
</html>
