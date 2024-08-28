package calculadora;

public class Calculadora {

    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int subtrairV1deV2(int valor1, int valor2) {
        return valor1 - valor2;
    }
    public int subtrairV2deV1(int valor2, int valor1) {
        return valor2 - valor1;
    }

    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public double dividirV1deV2(int valor1, int valor2) {

        if (valor2 == 0) {
            return 0;
        }

        return valor1 / valor2;
    }

    public double dividirV2deV1(int valor2, int valor1) {

        if (valor1 == 0) {
            return 0;
        }

        return valor2 / valor1;
    }

}
