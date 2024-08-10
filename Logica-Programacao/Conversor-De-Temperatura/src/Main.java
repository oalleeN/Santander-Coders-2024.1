import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:");

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
                System.out.print("\nDigite o valor da temperatura deseja converter (°C para °F): ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.CELSIUS_TO_FAHRENHEIT.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f °F", recebeConversao);

                break;

            case 2:
                System.out.print("\nDigite o valor da temperatura deseja converter (°C para K): ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.CELSIUS_TO_KELVIN.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f K", recebeConversao);

                break;

            case 3:
                System.out.print("\nDigite o valor da temperatura deseja converter (°F para °C): ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.FAHRENHEIT_TO_CELSIUS.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f °C", recebeConversao);

                break;

            case 4:
                System.out.print("\nDigite o valor da temperatura deseja converter (°F para K): ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.FAHRENHEIT_TO_KELVIN.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f K", recebeConversao);

                break;

            case 5:
                System.out.print("\nDigite o valor da temperatura deseja converter (K para °C): ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.KELVIN_TO_CELSIUS.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f °C", recebeConversao);

                break;

            case 6:
                System.out.print("\nDigite o valor da temperatura deseja converter (K para °F): ");
                valorTemperatura = sc.nextDouble();
                recebeConversao = UnidadeTemperatura.KELVIN_TO_FAHRENHEIT.converter(valorTemperatura);

                System.out.printf("A temperatura convertida é de %.3f °F", recebeConversao);

                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}