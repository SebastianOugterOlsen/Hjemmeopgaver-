public class Main {

    public static void main(String[] args) {

        //********************   opgave: 1.1   ********************

        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");

        //********************   opgave: 1.2   ********************

        // Et loop som starter i 0 og går til mindre end 5
        for (int i = 0; i < 5; i++)
            //Skriver I Love Java
            System.out.println("I Love Java");

        //********************   opgave: 1.4   ********************

        final Object[][] table = new String[5][];
        table[0] = new String[] { "a^2", "a^3", "a^4" };
        table[1] = new String[] { "1", "1", "1" };
        table[2] = new String[] { "4", "8", "16" };
        table[3] = new String[] { "9", "27", "81" };
        table[4] = new String[] { "16", "64", "256" };
        //Venstre vender teksten
        for (final Object[] row : table) {
            System.out.format("%-15s%-15s%-15s\n", row);
        }

        //********************   opgave: 1.5   ********************

        //Udregning af regnestykke direkte i linjen
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        //********************   opgave: 1.6   ********************

        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 );

    }
}
