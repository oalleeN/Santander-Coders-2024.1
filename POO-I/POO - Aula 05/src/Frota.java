import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Carro> carro;

    public Frota() {
        carro = new ArrayList<>();
    }

    public void adiconarCarro (Carro carro) {
        this.carro.add(carro);
        System.out.println("Carro adicionado à frota!");
    }

    public int carrosDisponiveis() {
        int carrosDisponiveis = 0;

        for (Carro c : carro) {
            if (c.isDisponivel()) {
                carrosDisponiveis++;
            }
        }

        return carrosDisponiveis;
    }

    public void statusFrota() {
        System.out.println("\nCarros disponíveis: " + carrosDisponiveis());
        System.out.println("Total de carros: " + Carro.getTotalCarros() + "\n");

    }
}
