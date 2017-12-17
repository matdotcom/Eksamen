package Sprgsmaal7;
import java.util.*;

public class Exceptions {
    public static void main(String[] args) throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        int x = 1;
        // Her har vi en try block. Den kører først fra toppen til bunden.
        // Du kan ikke have en try block uden en catch block.
        // Så den kører alt koden, og hvis der kommer nogen fejl kører catch linjen.
        do {
            try {
                System.out.println(" Enter first num : ");
                int n1 = input.nextInt();
                System.out.println(" Enter second num : ");
                int n2 = input.nextInt();

                int sum = n1 / n2;
                System.out.println(sum);
                x = 2;
            }
            // Denne linje kører kun hvis det kommer nogle fejl.
            // InputMismatch fanger hvis den input du skriver ind ikke svarer over ens med datatypen.
            // Arithmetic fanger exceptions som har med matematiske fejl at gøre.
            // Exception e fanger ALLE fejl.
            catch (ArithmeticException e) {
                System.out.println(" Du har divideret med 0!!!!");
            } catch (Exception e) {
                System.out.println(" Something went wrong. Try agian. ");
            }
        } while (x==1);
    }
}
