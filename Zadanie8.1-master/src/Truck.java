public class Truck extends Car {

    private double ladunek;

    public Truck(String nazwa, double pojemnosc, double spalanie, boolean klimatyzacja, double ladunek) {
        super(nazwa, pojemnosc, spalanie, klimatyzacja);
        this.ladunek = ladunek;
    }

    public double getLadunek() {
        return ladunek;
    }

    public void setLadunek(double ladunek) {
        this.ladunek = ladunek;
    }

    public double ciezar() {
        double waga = (0.5 * ladunek) / 100;
        return waga;
    }

    @Override
    public double spalanieCalkowite() {
        if (isKlimatyzacja()) {
            return getSpalanie() + 1.6 + ciezar();
        } else {
            return getSpalanie() + ciezar();
        }
    }


    @Override
    public String toString() {
        return super.toString() + " " + "Ładunek" + " " + ladunek;
    }
}
