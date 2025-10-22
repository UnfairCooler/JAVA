public class Ehtolause {
    public static void main(String[] args) {

        // OSA 1: Numerot
        int luku1 = 10;
        int luku2 = 20;
        int luku3 = 10;

        // 1. Onko luku1 ja luku2 yhtä suuria TAI luku2 ja luku3 yhtä suuria
        if (luku1 == luku2 || luku2 == luku3) {
            System.out.println("Ehto 1: Joko luku1==luku2 tai luku2==luku3 on tosi.");
        }

        // 2. Onko luku1 suurempi kuin luku2 JA luku1 yhtä suuri kuin luku3
        if (luku1 > luku2 && luku1 == luku3) {
            System.out.println("Ehto 2: luku1 > luku2 JA luku1 == luku3.");
        }

        // 3. Onko luku1 ja luku2 ja luku3 yhtä suuria
        if (luku1 == luku2 && luku2 == luku3) {
            System.out.println("Ehto 3: Kaikki luvut ovat yhtä suuria.");
        }

        // 4. Onko luku1 suurempi kuin luku2. Jos ei, tutki onko luku2 suurempi kuin luku3
        if (luku1 > luku2) {
            System.out.println("Ehto 4: luku1 on suurempi kuin luku2.");
        } else if (luku2 > luku3) {
            System.out.println("Ehto 4: luku2 on suurempi kuin luku3.");
        }

        // 5. Onko luku1 ja luku2 yhtä suuria. Jos ei, tutki onko luku1 ja luku3 yhtä suuria
        if (luku1 == luku2) {
            System.out.println("Ehto 5: luku1 ja luku2 ovat yhtä suuria.");
        } else if (luku1 == luku3) {
            System.out.println("Ehto 5: luku1 ja luku3 ovat yhtä suuria.");
        }


        // OSA 2: String-muuttujat
        String nimi1 = "Matti";
        String nimi2 = "Matti";
        String nimi3 = "Teppo";

        // 1. Onko nimi1 ja nimi2 samoja
        if (nimi1.equals(nimi2)) {
            System.out.println("Ehto 1 (nimet): nimi1 ja nimi2 ovat samoja.");
        }

        // 2. Onko nimi1 ja nimi2 erisuuria
        if (!nimi1.equals(nimi2)) {
            System.out.println("Ehto 2 (nimet): nimi1 ja nimi2 ovat erisuuria.");
        }

        // 3. Onko nimi1 ja nimi2 samoja. Jos ei, tutki onko nimi1 ja nimi3 samoja
        if (nimi1.equals(nimi2)) {
            System.out.println("Ehto 3 (nimet): nimi1 ja nimi2 ovat samoja.");
        } else if (nimi1.equals(nimi3)) {
            System.out.println("Ehto 3 (nimet): nimi1 ja nimi3 ovat samoja.");
        }

    }
}
