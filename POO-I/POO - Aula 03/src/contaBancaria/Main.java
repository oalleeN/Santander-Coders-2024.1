package contaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria(1, "Alan", 1000);
        ContaBancaria contaBancaria2 = new ContaBancaria(2, "Matheus", 1000);

        contaBancaria1.sacar(200);
        contaBancaria1.depositar(100);
        contaBancaria1.transferir(500, contaBancaria2);
        contaBancaria1.exibirValor();
    }
}
