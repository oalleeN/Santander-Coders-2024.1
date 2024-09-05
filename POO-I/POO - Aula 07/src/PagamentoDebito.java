public class PagamentoDebito extends Pagamento{
    private String numeroConta;
    private String banco;
    private double saldo;

    public PagamentoDebito(double valor, String data, String numeroConta, String banco, double saldo) {
        super(valor, data);
        this.numeroConta = numeroConta;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public boolean processarPagamento() {
        return saldo > 0;
    }
}
