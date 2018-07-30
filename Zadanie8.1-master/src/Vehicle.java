public class Vehicle {

    private String nazwa;                           // name
    private double pojemnosc;                       // capacity
    private double spalanie; //na 100km             // combustion

    public Vehicle(String nazwa, double pojemnosc, double spalanie) {
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
        this.spalanie = spalanie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public double spalanieCalkowite() {
        return spalanie;
    }

    public String toString() {
        return "Nazwa:" + " " + nazwa + " " + "Pojemność" + " " + pojemnosc + " " + "Spalanie" + " " + spalanie;
    }

    public double zasieg() {
        double odleglosc = (100 * pojemnosc) / spalanieCalkowite();
        return odleglosc;
    }
}
