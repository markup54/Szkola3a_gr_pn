public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Osoba osoba1 = new Uczen(); //żeby utworzyć obiekt wywoływany jest konstruktor

        System.out.println(osoba1.imie);
        osoba1.imie = "Jan";
        System.out.println(osoba1.imie);
        System.out.println(osoba1);
        Uczen uczen = new Uczen("Emil",12,1234);
        System.out.println(uczen);
        uczen.setWiek(14);
        System.out.println(uczen);

        Uczen uczen1 = new Uczen("Fiona",10);
        System.out.println(uczen1);
        System.out.println("Liczba uczniow "+Uczen.getLiczbaUczniow()+"");
        Uczen uczen2 = new Uczen("Szrek",15);
        System.out.println(uczen2);
        System.out.println("Liczba uczniow "+Uczen.getLiczbaUczniow()+"");
        Nauczyciel nauczycielFizyki = new Nauczyciel("Edmund",70,"fizyka");
        System.out.println(nauczycielFizyki);
        nauczycielFizyki.wykonajDuzur();
        uczen1.wykonajDuzur();
        //polimorfizm
    }
}