public class Ikaohjelma {
    public static void main(String[] args) throws Exception {

        int ika = 16;

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika == 16 || ika == 17) {
                System.out.println("Saat ajaa kevaria");

            }
        }
    }
}
