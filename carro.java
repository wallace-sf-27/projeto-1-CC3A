public class carro extends veiculos {
    private String marca;
    private int ano;
    private String cor;
    private int vin;

    public carro(String marca, int ano, String cor, int vin) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.vin = vin;
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo de forma impecável pela estrada");
    }

}