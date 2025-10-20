public class Uczen extends Osoba implements Dyzurny{
    //klasa Uczen to klasa potomna dla klasy bazowej Osoba
    private int nr_ucznia;
    private static int liczbaUczniow; //do przechowywania liczby instancji klasy UCzen

    public Uczen(String imie, int wiek, int nr_ucznia) {
        super(imie, wiek);//odwołanie do konstruktora klasy bazowej
        this.nr_ucznia = nr_ucznia;
        liczbaUczniow++;
    }

    public Uczen() {
        liczbaUczniow++;
    }

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow++;
        nr_ucznia = liczbaUczniow;
    }

    public int getNr_ucznia() {
        return nr_ucznia;
    }

    public void setNr_ucznia(int nr_ucznia) {
        this.nr_ucznia = nr_ucznia;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        Uczen.liczbaUczniow = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nr_ucznia=" + nr_ucznia +
                "wiek= "+getWiek()+
                ", imie='" + imie + '\'' +
                "} " ;
    }

    @Override
    public void wykonajDuzur() {
        System.out.println("wytrzyj tablice");
    }
}
