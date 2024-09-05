public class Main {
    public static void main(String[] args) {
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(1000, "10/08/2024", true);
        PagamentoDebito pagamentoDebito = new PagamentoDebito(2000, "10/08/2024", "100", "Banco", 200);
        PagamentoCredito pagamentoCredito = new PagamentoCredito(3000, "10/08/2024", "10123", "20/10/2024");

        GestorPagamentos gestorPagamentos = new GestorPagamentos();

        gestorPagamentos.adicionarPagamentos(pagamentoBoleto);
        gestorPagamentos.adicionarPagamentos(pagamentoCredito);
        gestorPagamentos.adicionarPagamentos(pagamentoDebito);

        gestorPagamentos.processarPagamentos();
    }
}
