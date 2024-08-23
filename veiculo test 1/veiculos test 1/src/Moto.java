class Moto extends Veiculos {
    public Moto(String cor, String modelo, int ano, int vin) {
        // Inicializando atributos diretamente
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.setVin(vin);
    }

    @Override
    public void mover() {
        System.out.println("A moto está se movendo extremamente rápida");
    }

    @Override
    public void buzinar() {
        System.out.println("A moto está buzinando um som baixo");
    }
}