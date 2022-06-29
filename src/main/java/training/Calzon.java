package training;

public class Calzon {
    private String color;
    private String tela;
    private String liga;

    public Calzon(String color, String tela, String liga) {
        this.color = color;
        this.tela = tela;
        this.liga = liga;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }
}
