package Soccer;

import java.util.Calendar;


public class Home {
    
    private String NameOfClub,ColorOfClub,MonthOfFoundation;
    private int DayOfFoundation,YearOfFoundation,CampeonatoBrasileiro,CopaLibertadoresDaAmerica;
    public int Ano_atual = Calendar.getInstance().get(Calendar.YEAR);

    public String getNameOfClub() {
        return NameOfClub;
    }

    public void setNameOfClub(String NameOfClub) {
        this.NameOfClub = NameOfClub;
    }

    public String getColorOfClub() {
        return ColorOfClub;
    }

    public void setColorOfClub(String ColorOfClub) {
        this.ColorOfClub = ColorOfClub;
    }

    public String getMonthOfFoundation() {
        return MonthOfFoundation;
    }

    public void setMonthOfFoundation(String MonthOfFoundation) {
        this.MonthOfFoundation = MonthOfFoundation;
    }

    public int getDayOfFoundation() {
        return DayOfFoundation;
    }

    public void setDayOfFoundation(int DayOfFoundation) {
        this.DayOfFoundation = DayOfFoundation;
    }

    public int getYearOfFoundation() {
        return YearOfFoundation;
    }

    public void setYearOfFoundation(int YearOfFoundation) {
        this.YearOfFoundation = YearOfFoundation;
    }

    public int getCampeonatoBrasileiro() {
        return CampeonatoBrasileiro;
    }

    public void setCampeonatoBrasileiro(int CampeonatoBrasileiro) {
        this.CampeonatoBrasileiro = CampeonatoBrasileiro;
    }

    public int getCopaLibertadoresDaAmerica() {
        return CopaLibertadoresDaAmerica;
    }

    public void setCopaLibertadoresDaAmerica(int CopaLibertadoresDaAmerica) {
        this.CopaLibertadoresDaAmerica = CopaLibertadoresDaAmerica;
    }
    
    public String GetInfoHome(){
        
        String Dados = "";
        
        Dados += "<h2>" + getNameOfClub() + "</h2>";
        Dados += "<p>Fundação : " + getDayOfFoundation() + " de " + getMonthOfFoundation() + " de " + getYearOfFoundation() + " (" + (Ano_atual - getYearOfFoundation()) + " anos)</p>";
        Dados += "<p>Cor : " + getColorOfClub() + "</p>";
        Dados += "<p>-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=</p>";
        Dados += "<p>_______ : " + getCopaLibertadoresDaAmerica() + " Copa Libertadores da América</p>";
        Dados += "<p>_______ : " + getCampeonatoBrasileiro() + " Campeonato brasileiro</p>";
        
        return Dados;
    }
}
