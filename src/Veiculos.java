abstract class Veiculos {
    public String nome;
    public int ano;
    public String marca;
    public String cor;
    private int vin; // VIN privado

    // Construtor
    public Veiculos(String nome, int ano, String marca, String cor, int vin) {
        this.nome = nome;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.setVin(vin); // Usando o setter para validar o VIN
    }

    // Métodos abstratos
    public abstract void mover();

    public abstract void buzinar();

    // Getters e Setters
    private int getVin() {
        return vin;
    }

    private void setVin(int vin) {
        this.vin = vin;
    }

    // Método para exibir detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
    }
}