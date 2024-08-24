class Carro extends Veiculos {
    public Carro(String nome, int ano, String marca, String cor, int vin) {
        super(nome, ano, marca, cor, vin);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo perfeitamente");
    }

    @Override
    public void buzinar() {
        System.out.println("O carro está buzinando estranho");
    }
}