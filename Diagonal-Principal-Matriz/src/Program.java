import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        valoresMatriz(matriz);
        imprimirMatriz(matriz);
        diagonalPrincipal(matriz);
        somar(matriz);
    }

    public static void valoresMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static void diagonalPrincipal(int[][] matriz) {
        System.out.println();
        System.out.print("\nOs valores da diagonal principal são " + matriz[0][0] + ", " + matriz[1][1] + " e " + matriz[2][2] + ".");
    }

    public static void somar(int[][] matriz) {
        int soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.println(" E a soma é " + soma);
    }
}