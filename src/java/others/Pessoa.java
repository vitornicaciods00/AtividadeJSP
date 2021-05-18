package others;


public class Pessoa {
    
    private String Nome,CPF,RG,CidadeNatal,UF,Mes,Genero,Etnia,Email,Telefone;
    private int Ano,Dia,Idade;
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCidadeNatal() {
        return CidadeNatal;
    }

    public void setCidadeNatal(String CidadeNatal) {
        this.CidadeNatal = CidadeNatal;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEtnia() {
        return Etnia;
    }

    public void setEtnia(String Etnia) {
        this.Etnia = Etnia;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public Pessoa(String Nome, String CPF, String RG, String CidadeNatal, String UF, String Mes, String Genero, String Etnia, int Dia, int Idade, int Ano, String Email, String Telefone) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.RG = RG;
        this.CidadeNatal = CidadeNatal;
        this.UF = UF;
        this.Mes = Mes;
        this.Genero = Genero;
        this.Etnia = Etnia;
        this.Dia = Dia;
        this.Idade = Idade;
        this.Ano = Ano;
        this.Email = Email;
        this.Telefone = Telefone;
    }
}
