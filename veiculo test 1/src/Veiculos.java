abstract class Veiculos {
    public String cor;
    public String modelo;
    public int ano;
    private int vin; // VIN privado

    public Veiculos(String cor, String modelo, int ano, int vin) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.setVin(vin); // Usando o setter para validar o VIN
    }

    public Veiculos() {

    }

    // Getters e Setters
    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Vermelho", "Sedan", 2020, 1234);
        Moto moto = new Moto("Azul", "Esportiva", 2021, 5678);
        Caminhao caminhao = new Caminhao("Preto", "Carga", 2019, 9012);

        carro.mover();
        carro.buzinar();

        moto.mover();
        moto.buzinar();

        caminhao.mover();
        caminhao.buzinar();
    }

    public abstract void mover();

    public abstract void buzinar();
}