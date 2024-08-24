class Moto extends Veiculos {
    public Moto(String nome, int ano, String marca, String cor, int vin) {
        super(nome, ano, marca, cor, vin);
    }

    @Override
    public void mover() {
        System.out.println("A moto está se movendo rápido");
    }

    @Override
    public void buzinar() {
        System.out.println("A moto está buzinando bem baixo");
    }
}