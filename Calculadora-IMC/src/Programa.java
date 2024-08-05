import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.print("Informe seu peso em Kg: ");
        double peso = sc.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println();

        System.out.printf("O valor do seu IMC é %.2f. ", imc);
        consultarIMC(imc);

        sc.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void consultarIMC(double imc) {
        if (imc < 17.0) {
            System.out.println("Muito abaixo do peso.");
        } else if (imc >= 17.0 && imc <= 18.49) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal.");
        } else if (imc >= 25.0 && imc <= 29.99) {
            System.out.println("Acima do peso.");
        } else if (imc >= 30.0 && imc <= 34.99) {
            System.out.println("Obesidade I.");
        } else if (imc >= 35.0 && imc <= 39.99) {
            System.out.println("Obesidade II (severa).");
        } else {
            System.out.println("Obesidade III (mórbida).");
        }
    }
}


