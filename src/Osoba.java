public class Osoba {
    public String imie; // publiczne pola i metody dostępne wszędzie
    private int wiek; // prywatne pola i metody dostępne tylko w tej klasie
    //hermetyzacja

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    //przeciążanie konstruktorów
    public Osoba() {
        imie = "Jaś";
        wiek = 0;
    }
    //do włanosności prywatnych robimy metody dostępowe


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<0){
            this.wiek = 0;
        }
        else {
            this.wiek = wiek;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
