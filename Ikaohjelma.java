public class Ikaohjelma {
    public static void main(String[] args) throws Exception {

        int ika = 100;

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

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");

            if (ika > 58 && ika < 65) {
                System.out.println("Voit mennä varhaiseläkkeelle");
            }

            if (ika == 65) {
                System.out.println("Hyviä eläkepäiviä!");
            }

            if (ika == 100) {
                System.out.println("Paljon onnea 100-vuotiaalle!");
                System.out.println("Olet saavuttanut hienon virstanpylvään.");
                System.out.println("Hyvää juhlapäivää!");
            }
        }
    }
}
