import java.util.ArrayList;
import java.util.List;

public class GestorPagamentos {
    private List<Pagamento> pagamentos;

    public GestorPagamentos() {
        pagamentos = new ArrayList<>();
    }

    public void adicionarPagamentos(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void processarPagamentos() {
        for(Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento();
            System.out.println("Pagamento processado com sucesso!");
        }
    }
}
