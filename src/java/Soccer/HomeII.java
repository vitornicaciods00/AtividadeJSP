package Soccer;


public class HomeII extends Home{
    
    private int CopaDoBrasil;
    
    public int getCopaDoBrasil(){
        return CopaDoBrasil;
    }
    public void setCopaDoBrasil(int CopaDoBrasil){
        this.CopaDoBrasil = CopaDoBrasil;
    }
    
    public String GetInfoHomeII(){
        
        String Dados;
        
        Dados = super.GetInfoHome();
        
        Dados += "<p>_______ : " + getCopaDoBrasil() + " Copa do Brasil</p>";
        
        return Dados;
    }
}
