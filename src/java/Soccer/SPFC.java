package Soccer;


public class SPFC extends Home {
    
    private int CopaDoMundoDeClubesDaFIFA,CopaIntercontinental,CopaSul_americana,RecopaSul_americana,CopaConmebol;
    private int SupercopaLibertadores,CopaMasterDaConmebol;

    public int getCopaDoMundoDeClubesDaFIFA() {
        return CopaDoMundoDeClubesDaFIFA;
    }

    public void setCopaDoMundoDeClubesDaFIFA(int CopaDoMundoDeClubesDaFIFA) {
        this.CopaDoMundoDeClubesDaFIFA = CopaDoMundoDeClubesDaFIFA;
    }

    public int getCopaIntercontinental() {
        return CopaIntercontinental;
    }

    public void setCopaIntercontinental(int CopaIntercontinental) {
        this.CopaIntercontinental = CopaIntercontinental;
    }

    public int getCopaSul_americana() {
        return CopaSul_americana;
    }

    public void setCopaSul_americana(int CopaSul_americana) {
        this.CopaSul_americana = CopaSul_americana;
    }

    public int getRecopaSul_americana() {
        return RecopaSul_americana;
    }

    public void setRecopaSul_americana(int RecopaSul_americana) {
        this.RecopaSul_americana = RecopaSul_americana;
    }

    public int getCopaConmebol() {
        return CopaConmebol;
    }

    public void setCopaConmebol(int CopaConmebol) {
        this.CopaConmebol = CopaConmebol;
    }

    public int getSupercopaLibertadores() {
        return SupercopaLibertadores;
    }

    public void setSupercopaLibertadores(int SupercopaLibertadores) {
        this.SupercopaLibertadores = SupercopaLibertadores;
    }

    public int getCopaMasterDaConmebol() {
        return CopaMasterDaConmebol;
    }

    public void setCopaMasterDaConmebol(int CopaMasterDaConmebol) {
        this.CopaMasterDaConmebol = CopaMasterDaConmebol;
    }
    
    public String GetInfoSaoPaulo(){
        
        String Dados;
        
        Dados = super.GetInfoHome();
        
        Dados += "<p>_______ : " + getCopaDoMundoDeClubesDaFIFA() + " Copa do Mundo de Clubes da FIFA</p>";
        Dados += "<p>_______ : " + getCopaIntercontinental() + " Copa Intercontinental</p>";
        Dados += "<p>_______ : " + getCopaSul_americana() + " Copa Sul-americana</p>";
        Dados += "<p>_______ : " + getRecopaSul_americana() + " Recopa Sul-americana</p>";
        Dados += "<p>_______ : " + getCopaConmebol() + " Copa Conmebol</p>";
        Dados += "<p>_______ : " + getSupercopaLibertadores() + " Supercopa Libertadores</p>";
        Dados += "<p>_______ : " + getCopaMasterDaConmebol() + " Copa Master da Conmebol</p>";
        Dados += "<hr>";
        
        return Dados;
    }
}
