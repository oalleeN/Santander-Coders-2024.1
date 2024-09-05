public class Carro {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;

    private static int totalCarros = 0;

    public Carro(String placa, String modelo, int ano) {
        if (ano <= 1900) {
            throw new IllegalArgumentException("O ano deve ser maior que 1900.");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = true;
        totalCarros++;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1900) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano deve ser maior que 1900.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    private void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void alugar() {
        if (disponivel) {
            setDisponivel(false);
            System.out.println("Este veículo está disponível para aluguel! (" + modelo + ").");
        } else {
            System.out.println("Este veículo não está disponível para aluguel! (" + modelo + ").");
        }
    }

    public void devolver() {
        if (!disponivel) {
            setDisponivel(true);
            System.out.println("Este veículo foi devolvido! (" + modelo + ").");
        } else {
            System.out.println("Este veículo não foi devolvido! (" + modelo + ").");
        }
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
}
