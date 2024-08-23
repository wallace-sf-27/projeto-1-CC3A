public abstract class veiculos {
    private String marca;
    private int ano;
    private String cor;
    private int vin;

    public veiculos(String marca, int ano, String cor, int vin) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.vin = vin;
    }

    // Getter para vin
    public int getVin() {
        return vin;
    }

    // Setter para vin
    public void setVin(int vin) {
        this.vin = vin;
    }

    public abstract void acelerar();
    public abstract void buzinar();
}