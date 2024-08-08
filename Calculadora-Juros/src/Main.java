import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor inicial investido em REAIS: R$");
        double valorInvestido = sc.nextDouble();

        System.out.print("Informe o juros ao mês em %: ");
        int juros = sc.nextInt();

        System.out.print("Informe o tempo e meses que o dinheiro ficará investido: ");
        int meses = sc.nextInt();

        Calculador calculador = new Calculador();

        sc.close();

        System.out.printf("\n%.2f reais, %d%% de juros ao mês por %d meses.\n\n", valorInvestido, juros, meses);

        for (int i = 0; i < meses; i++) {
            double valorJuros = calculador.calcularJuros(valorInvestido, juros);
            valorInvestido += valorJuros;

            System.out.println("Mês " + (i+1) +
                    ": Juros: R$" + valorJuros +
                    ", Saldo: R$" + valorInvestido);
        }
    }
}