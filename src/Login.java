import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kysytään käyttäjältä tiedot
        System.out.print("Anna etunimi: ");
        String firstName = input.nextLine();

        System.out.print("Anna sukunimi: ");
        String lastName = input.nextLine();

        System.out.print("Anna yrityksen verkkotunnus (esim. yritys.fi): ");
        String domain = input.nextLine();

        // Tietojen tarkistus
        if (firstName.isEmpty() || lastName.isEmpty() || domain.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
        } else {
            // Kutsutaan metodeja
            GenerateEmail(firstName, lastName, domain);
            GenerateUsername(firstName, lastName);
        }

        input.close();
    }

    // Sähköpostin luonti
    public static void GenerateEmail(String firstName, String lastName, String domain) {
        // Muodostetaan sähköpostiosoite ja muutetaan pieniksi kirjaimiksi
        String email = (firstName + "." + lastName + "@" + domain).toLowerCase();
        System.out.println("Sähköpostiosoite: " + email);
    }

    // Käyttäjätunnuksen luonti
    public static void GenerateUsername(String firstName, String lastName) {
        // Otetaan etunimestä 4 ensimmäistä ja sukunimestä 4 viimeistä merkkiä
        String firstPart = firstName.substring(0, 4);
        String lastPart = lastName.substring(lastName.length() - 4);
        String username = (firstPart + lastPart).toLowerCase();

        System.out.println("Käyttäjätunnus: " + username);
    }
}
