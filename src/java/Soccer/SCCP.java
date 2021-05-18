package Soccer;


public class SCCP extends HomeII {
    
    private int CopaDoMundoDeClubesDaFIFA,RecopaSul_americana,SupercopaDoBrasil;

    public int getCopaDoMundoDeClubesDaFIFA() {
        return CopaDoMundoDeClubesDaFIFA;
    }

    public void setCopaDoMundoDeClubesDaFIFA(int CopaDoMundoDeClubesDaFIFA) {
        this.CopaDoMundoDeClubesDaFIFA = CopaDoMundoDeClubesDaFIFA;
    }

    public int getRecopaSul_americana() {
        return RecopaSul_americana;
    }

    public void setRecopaSul_americana(int RecopaSul_americana) {
        this.RecopaSul_americana = RecopaSul_americana;
    }

    public int getSupercopaDoBrasil() {
        return SupercopaDoBrasil;
    }

    public void setSupercopaDoBrasil(int SupercopaDoBrasil) {
        this.SupercopaDoBrasil = SupercopaDoBrasil;
    }
    
    public String GetInfoCorinthians(){
        
        String Dados;
        
        Dados = super.GetInfoHomeII();
        
        Dados += "<p>_______ : " + getCopaDoMundoDeClubesDaFIFA() + " Copa doMundo de Clubes da FIFA</p>";
        Dados += "<p>_______ : " + getRecopaSul_americana() + " Recopa Sul-americana</p>";
        Dados += "<p>_______ : " + getSupercopaDoBrasil() + " Supercopa do Brasil</p>";
        
        return Dados;
    }
}
