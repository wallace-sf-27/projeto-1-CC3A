class Caminhao extends Veiculos {
    public Caminhao(String nome, int ano, String marca, String cor, int vin) {
        super(nome, ano, marca, cor, vin);
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está se movendo lentamente");
    }

    @Override
    public void buzinar() {
        System.out.println("O caminhão está buzinando muito alto");
    }
}
