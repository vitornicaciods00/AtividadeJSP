package Soccer;


public class SEP extends HomeII {
    
    private int CopaRio,CopaMercosul,CopaDosCampeoes;

    public int getCopaRio() {
        return CopaRio;
    }

    public void setCopaRio(int CopaRio) {
        this.CopaRio = CopaRio;
    }

    public int getCopaMercosul() {
        return CopaMercosul;
    }

    public void setCopaMercosul(int CopaMercosul) {
        this.CopaMercosul = CopaMercosul;
    }

    public int getCopaDosCampeoes() {
        return CopaDosCampeoes;
    }

    public void setCopaDosCampeoes(int CopaDosCampeoes) {
        this.CopaDosCampeoes = CopaDosCampeoes;
    }
    
    public String GetInfoPalmeiras(){
        
        String Dados;
        
        Dados = super.GetInfoHomeII();
        
        Dados += "<p>_______ : " + getCopaRio() + " Copa Rio</p>";
        Dados += "<p>_______ : " + getCopaMercosul() + " Copa Mercosul</p>";
        Dados += "<p>_______ : " + getCopaDosCampeoes() + " Copa dos Campeões</p>";
        Dados += "<hr>";
        
        return Dados;
    }
}
