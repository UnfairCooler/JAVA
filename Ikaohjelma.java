public class Ikaohjelma {
    public static void main(String[] args) throws Exception {

        int ika = 18;

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika == 16 || ika == 17) {
                System.out.println("Saat ajaa kevaria");
                }
        } else if (ika == 18) { 
            System.out.println("Olet juuri tullut täysi-ikäiseksi!");
            System.out.println("Saat ajaa autoa");

        } else if (ika >= 19 && ika < 65) {
            System.out.println("Olet aikuinen");

            if (ika % 10 == 0) {
                System.out.println("Onnea " + ika + "-vuotispäivän johdosta!");
            }

            if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää!");

            }
        }
    }
}
