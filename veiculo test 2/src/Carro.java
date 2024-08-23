import Veiculos.Veiculos;

class Carro extends Veiculos {
    public Carro(String veneno, int i, String lamborghini, String preto, int i1) {
        super();
    }

    public void mover() {
        System.out.println("O carro está se movendo perfeitamente");
    }

    @Override
    public void buzinar() {
        System.out.println("O carro está buzinando estranho");
    }
}