import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {

            Scanner scan = new Scanner(System.in);
            int i;

            do {
                System.out.println("\nSeleziona:");
                System.out.println("1.Inizio Noleggio" +
                        "\n2.Ritira Auto"+
                        "\n3.Termina Noleggio"+
                        "\n4.Inserisci Auto"+
                        "\n5.Ricerca Auto"+
                        "\n6.Gestisci Utente"+
                        "\n7.Ricerca Utente"+
                        "\n8.Inserisci Garage");

                i = Integer.parseInt(scan.nextLine());
                switch (i) {
                    case 1:
                        CarSharing.UC1();
                        break;

                    case 2:
                        CarSharing.UC2();
                        break;

                    case 3:
                        CarSharing.UC3();
                        break;

                    case 4:
                        CarSharing.UC4();
                        break;

                    case 5:
                        CarSharing.UC5();
                        break;

                    case 6:
                        CarSharing.UC6();
                        break;

                    case 7:
                        CarSharing.UC7();
                        break;

                    case 8:
                        CarSharing.UC8();
                        break;

                    default:
                        break;

                }
            }
            while (i != 0);

        } catch (Exception e) {

            {
                System.out.print("Errore inserimento!");
            }

        }
    }
}