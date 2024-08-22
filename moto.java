public class moto extends veiculos {
    private String marca;
    private int ano;
    private String cor;
    private int vin;

    public moto(String marca, int ano, String cor, int vin) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.vin = vin;
    }

    @Override
    public void mover() {
        System.out.println("A moto está se movendo muito rapido .");
    }

    @Override
    public void buzinar() {
        System.out.println("A moto está buzinando: Beep Beep!");
    }
}