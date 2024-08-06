import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numeroUsuario = sc.nextInt();

        int soma = numeroUsuario;
        for (int i = 1; i < numeroUsuario; i++) {
            soma += i;
        }

        System.out.println(soma);

        sc.close();
    }
}