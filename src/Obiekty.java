public class Obiekty {
    public static void main(String[] args) {

        Komoda komoda1 = new Komoda();
        komoda1.kolor = "biały";
        komoda1.producent = "ikea";
        komoda1.iloscSzuflad = 3;
        komoda1.wysokosc = 1.2;
        System.out.println("Twój produkt to " );
        System.out.println("Komoda w kolorze " + komoda1.kolor);
        System.out.println("ze sklepu " + komoda1.producent);
        System.out.println(" i ma " + komoda1.iloscSzuflad + " szuflad.");
        System.out.println("Jej wysokość to " + komoda1.wysokosc + "m.");
        System.out.println(" ");

        Komoda komoda2 = new Komoda();
        komoda2.kolor = "szary";
        komoda2.producent = "Abra";
        komoda2.iloscSzuflad = 4;
        komoda2.wysokosc = 1.5;
        System.out.println("Twój produkt to " );
        System.out.println("Komoda w kolorze " + komoda2.kolor);
        System.out.println("ze sklepu " + komoda2.producent);
        System.out.println(" i ma " + komoda2.iloscSzuflad + " szuflad.");
        System.out.println("Jej wysokość to " + komoda2.wysokosc + "m.");

        }
}
