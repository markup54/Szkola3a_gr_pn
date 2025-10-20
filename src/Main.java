public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Osoba osoba1 = new Osoba(); //żeby utworzyć obiekt wywoływany jest konstruktor
        System.out.println(osoba1.imie);
        osoba1.imie = "Jan";
        System.out.println(osoba1.imie);
        System.out.println(osoba1);
        Uczen uczen = new Uczen("Emil",12,1234);
        System.out.println(uczen);
        uczen.setWiek(14);
        System.out.println(uczen);
    }
}