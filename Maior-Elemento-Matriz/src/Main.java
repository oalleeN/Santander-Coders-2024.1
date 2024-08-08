import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Quantidade de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0 ; i < linhas ; i++) {
            for (int j = 0 ; j < colunas ; j++) {
                System.out.print("Elemento [" + i + "] [" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int maiorElemento = matriz[0][0];
        for (int i = 0 ; i < linhas ; i++) {
            for (int j = 0 ; j < colunas ; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }

        System.out.println("O maior elemento encontrado na matriz foi: " + maiorElemento);

        sc.close();
    }
}