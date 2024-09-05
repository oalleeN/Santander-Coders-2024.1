public class PagamentoBoleto extends Pagamento{
    private boolean codigoBoleto;

    public PagamentoBoleto(double valor, String data, boolean codigoBoleto) {
        super(valor, data);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public boolean processarPagamento() {
        return codigoBoleto;
    }
}
