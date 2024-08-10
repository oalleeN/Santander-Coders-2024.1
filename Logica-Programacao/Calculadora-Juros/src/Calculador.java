public class Calculador {
    private double valor;
    private int juros;

    public Calculador() {
    }

    public Calculador(double valor, int juros) {
        this.valor = valor;
        this.juros = juros;
    }

    public double calcularJuros(double valor, int juros) {
        return valor * (juros / 100.0);
    }
}
