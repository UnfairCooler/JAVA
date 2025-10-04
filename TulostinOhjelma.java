public class TulostinOhjelma {
    public static void main(String[] args) throws Exception {

        double luku1=6;
        double luku2=2;

        // 

        System.out.println("Hei olen Tulostin-ohjelma");
        String tekija = "Risto";
        System.out.println("Ohjelman tekijä: " + tekija);
        
        // Tulostaa luku1 ja luku2 konsoliin
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        double tulo = luku1 * luku2;
        double summa = luku1 + luku2;
        double erotus = luku1 - luku2;
        double jako = luku1 / luku2;


        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);

    }
}