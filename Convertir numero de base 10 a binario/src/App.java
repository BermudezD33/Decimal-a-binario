import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int decimalNumber = sc.nextInt();
        sc.close();

        String binaryNumber = "";

        while (decimalNumber > 0) {

            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber = decimalNumber / 2;
            
        }

        System.out.print("El numero en binario es: " + binaryNumber);

    }
}
