import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase ou número: ");
        String input = sc.nextLine();

        try {
            int test = Integer.parseInt(input);
            System.out.println("\nNúmero inteiro válido! [ " + test + " ]");
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro: A entrada não representa um inteiro válido!");
        }
        sc.close();
    }
}