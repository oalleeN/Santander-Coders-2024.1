public class Principal {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro1 = new Carro("AHAJ - 9121", "Gol", 2020);
        Carro carro2 = new Carro("LASL - 8182", "Civic", 2021);
        Carro carro3 = new Carro("DSAD - 9090", "Palio", 2022);
        Carro carro4 = new Carro("GHJJ - 1212", "Fusca", 1990);

        frota.adiconarCarro(carro1);
        frota.adiconarCarro(carro2);
        frota.adiconarCarro(carro3);
        frota.adiconarCarro(carro4);

        frota.statusFrota();

        carro1.alugar();
        carro2.alugar();
        carro4.alugar();
        carro3.alugar();

        frota.statusFrota();

        carro1.devolver();
        carro3.devolver();

        frota.statusFrota();
    }
}
