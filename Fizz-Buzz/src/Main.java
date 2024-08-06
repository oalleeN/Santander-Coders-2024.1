import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1 ; i <= 100 ; i++) {
            String fizz = divisivelPorTres(i);
            String buzz = divisivelPorCinco(i);

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(fizz + buzz);
            } else {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static String divisivelPorTres(int numero) {
        if (numero % 3 == 0) {
            return "Fizz";
        } else {
            return "";
        }
    }

    public static String divisivelPorCinco(int numero) {
        if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return "";
        }
    }

}