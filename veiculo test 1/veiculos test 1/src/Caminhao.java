// Subclasse Caminhao
class Caminhao extends Veiculos {
    public Caminhao(String cor, String modelo, int ano, int vin) {
        // Inicializando atributos diretamente
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.setVin(vin);
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está se movendo bem devagar ");
    }

    @Override
    public void buzinar() {
        System.out.println("O caminhão está buzinando um som alto");
    }
}
