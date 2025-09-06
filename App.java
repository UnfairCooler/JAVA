public class App {
    public static void main(String[] args) throws Exception {

        int ika = 65;

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
            
            // Tehtävä 3: tasavuosikymenet
            if (ika % 10 == 0) {
                System.out.println("Onnea " + ika + "-vuotispäivän johdosta!");
            }

            // Tehtävä 7: 40–50-vuotiaille
            if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää!");
            }

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");

        }
    }
}
