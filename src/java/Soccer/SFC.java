package Soccer;


public class SFC extends HomeII{
    
    private int CopaIntercontinental,RecopaSul_americana,RecopaDosCampeoesIntercontinentais;
    private int SupercopaSul_americanaDosCampeoesIntercontinentais,CopaConmebol;

    public int getCopaIntercontinental() {
        return CopaIntercontinental;
    }
    public void setCopaIntercontinental(int CopaIntercontinental) {
        this.CopaIntercontinental = CopaIntercontinental;
    }

    public int getRecopaSul_americana() {
        return RecopaSul_americana;
    }
    public void setRecopaSul_americana(int RecopaSul_americana) {
        this.RecopaSul_americana = RecopaSul_americana;
    }

    public int getRecopaDosCampeoesIntercontinentais() {
        return RecopaDosCampeoesIntercontinentais;
    }
    public void setRecopaDosCampeoesIntercontinentais(int RecopaDosCampeoesIntercontinentais) {
        this.RecopaDosCampeoesIntercontinentais = RecopaDosCampeoesIntercontinentais;
    }

    public int getSupercopaSul_americanaDosCampeoesIntercontinentais() {
        return SupercopaSul_americanaDosCampeoesIntercontinentais;
    }
    public void setSupercopaSul_americanaDosCampeoesIntercontinentais(int SupercopaSul_americanaDosCampeoesIntercontinentais) {
        this.SupercopaSul_americanaDosCampeoesIntercontinentais = SupercopaSul_americanaDosCampeoesIntercontinentais;
    }

    public int getCopaConmebol() {
        return CopaConmebol;
    }
    public void setCopaConmebol(int CopaConmebol) {
        this.CopaConmebol = CopaConmebol;
    }
    
    public String GetInfoSantos(){
        
        String Dados;
        
        Dados = super.GetInfoHomeII();
        
        Dados += "<p>_______ : " + getCopaIntercontinental() + " Copa Intercontinental</p>";
        Dados += "<p>_______ : " + getRecopaDosCampeoesIntercontinentais() + " Recopa dos Campões Intercontinentais</p>";
        Dados += "<p>_______ : " + getRecopaSul_americana() + " Recopa Sul-americana</p>";
        Dados += "<p>_______ : " + getCopaConmebol() + " Copa Conmebol</p>";
        Dados += "<p>_______ : " + getSupercopaSul_americanaDosCampeoesIntercontinentais() + " Supercopa Sul-americana dos Campeões Intercontinentais</p>";
        Dados += "<hr>";
        
        return Dados;
    }
}
