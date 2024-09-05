public abstract class Pagamento {

    private double valor;
    private String data;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public abstract boolean processarPagamento();
}
