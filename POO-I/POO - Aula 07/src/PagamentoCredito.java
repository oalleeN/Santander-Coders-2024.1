public class PagamentoCredito extends Pagamento{
    private String numeroCartao;
    private String dataValidade;

    public PagamentoCredito(double valor, String data, String numeroCartao, String dataValidade) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean processarPagamento() {
        return numeroCartao.length() == 12 && numeroCartao.startsWith("11");
    }
}
