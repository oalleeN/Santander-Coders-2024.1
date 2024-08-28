package termostato;

public class Main {
    public static void main(String[] args) {

        Termostato termostato = new Termostato(30.0, 25.0);

        termostato.aumentarTemperatura(5);
        termostato.diminuirTemperatura(5);
        termostato.ajustarTemperaturaDesejada(0);
        termostato.exibirStatus();
    }
}