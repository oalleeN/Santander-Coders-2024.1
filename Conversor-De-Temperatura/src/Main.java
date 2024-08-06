import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("[1] -  Celsius para Fahrenheit");
        System.out.println("[2] -      Celsius para Kelvin");
        System.out.println("[3] -  Fahrenheit para Celsius");
        System.out.println("[4] -   Fahrenheit para Kelvin");
        System.out.println("[5] -      Kelvin para Celsius");
        System.out.println("[6] -   Kelvin para Fahrenheit");
        System.out.println("------------------------------");

        System.out.print("Digite uma dessas opções: ");
        int entradaOpcao = sc.nextInt();

        double valorTemperatura;
        double recebeConversao;

        switch (entradaOpcao) {
            case 1:
                System.out.print("\nDigite o valor que deseja converter da temperatura em Celsius para Fahrenheit: ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.CELSIUS_TO_FAHRENHEIT.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f", recebeConversao);

                break;

            case 2:
                System.out.print("\nDigite o valor que deseja converter da temperatura em Celsius para Kelvin: ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.CELSIUS_TO_KELVIN.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f", recebeConversao);

                break;

            case 3:
                System.out.print("\nDigite o valor que deseja converter da temperatura em Fahrenheit para Celsius: ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.FAHRENHEIT_TO_CELSIUS.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f", recebeConversao);

                break;

            case 4:
                System.out.print("\nDigite o valor que deseja converter da temperatura em Fahrenheit para Kelvin: ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.FAHRENHEIT_TO_KELVIN.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f", recebeConversao);

                break;

            case 5:
                System.out.print("\nDigite o valor que deseja converter da temperatura em Kelvin para Celsius: ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.KELVIN_TO_CELSIUS.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f", recebeConversao);

                break;

            case 6:
                System.out.print("\nDigite o valor que deseja converter da temperatura em Kelvin para Fahrenheit: ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.KELVIN_TO_FAHRENHEIT.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f", recebeConversao);

                break;

            default:
                System.out.println("Insira um valor válido!");
        }

        sc.close();
    }
}