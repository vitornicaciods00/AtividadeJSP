package others;


public class GetMatriz {
    
    public String GetMesesDoAno(){
        
        String Info = "";
        
        String[][] Meses = {
            {"Janeiro","Fevereiro","Março","Abrl"},
            {"Maio","Junho","Julho","Agosto"},
            {"Setembro","Outubro","Novembro","Dezembro"}
        };
        
        for(int i=0; i < Meses.length; i++){
            Info += "</br>";
            for(int j = 0; j < Meses.length; j++){
                Info += Meses[i][j] + " ........................................ ";
            }
        }
        
        Info += "</br>";
        
        return Info;
    }
}
