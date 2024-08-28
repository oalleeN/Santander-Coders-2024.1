package termostato;

public class Termostato {

    double temperaturaAtual;
    double temperaturaDesejada;

    public Termostato(double temperaturaAtual, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void aumentarTemperatura(double valor) {
        temperaturaAtual += valor;
    }

    public void diminuirTemperatura(double valor) {
        temperaturaAtual -= valor;
    }

    public void ajustarTemperaturaDesejada(double novaTemperatura) {
        temperaturaDesejada = novaTemperatura;
    }

    public void exibirStatus() {
        System.out.println("Temperatura atual: " + temperaturaAtual);
        System.out.println("Temperatura desejada: " + temperaturaDesejada);
        if (temperaturaAtual < temperaturaDesejada) {
            System.out.println("Temperatura atual esta abaixo da temperatura desejada");
        } else if (temperaturaAtual > temperaturaDesejada) {
            System.out.println("Temperatura atual esta acima da temperatura desejada");
        } else {
            System.out.println("Está na temperatura desejada.");
        }

    }
}
