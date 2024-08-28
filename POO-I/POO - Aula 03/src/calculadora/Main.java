package calculadora;

public class Main {
    public static void main(String[] args) {

        int valor1 = 2;
        int valor2 = 5;

        Calculadora calculadora = new Calculadora();

        // Adição
        System.out.println(calculadora.somar(valor1, valor2));

        // Subtração
        System.out.println(calculadora.subtrairV1deV2(valor1, valor2));
        System.out.println(calculadora.subtrairV2deV1(valor2, valor1));

        // Divisão
        System.out.println(calculadora.dividirV1deV2(valor1, valor2));
        System.out.println(calculadora.dividirV2deV1(valor2, valor1));

        // Multiplicação
        System.out.println(calculadora.multiplicar(valor1, valor2));
    }
}
