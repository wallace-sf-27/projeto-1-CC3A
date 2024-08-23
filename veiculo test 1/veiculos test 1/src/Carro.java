class Carro extends Veiculos {
    public Carro(String cor, String modelo, int ano, int vin) {
        super();
        // Inicializando atributos diretamente
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.setVin(vin);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo perfeitamenmte");
    }

    @Override
    public void buzinar() {
        System.out.println("O carro está buzinando estranho");
    }
}
