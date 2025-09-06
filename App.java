public class App {
    public static void main(String[] args) throws Exception {

        int ika = 15;

        // Tulostusehdot
        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            // Tehtävä 1
            if (ika == 16 || ika == 17) {
                System.out.println("Saat ajaa kevaria");
            }
            // Tehtävä 2
        } else if (ika == 18) { 
            System.out.println("Olet nyt täysi-ikäinen!");
            System.out.println("Saat ajaa autoa");

        } else if (ika >= 19 && ika < 65) {
            System.out.println("Olet aikuinen");

        }
    }
}
