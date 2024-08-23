//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Classe abstrata Veiculos
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
            public int getVin() {
                return vin;
            }

            public void setVin(int vin) {
                this.vin = vin;
            }

            // Método para exibir detalhes do veículo
            public void exibirDetalhes() {
                System.out.println("Nome: " + nome);
                System.out.println("Ano: " + ano);
                System.out.println("Marca: " + marca);
                System.out.println("Cor: " + cor);
                System.out.println("VIN: " + vin);
            }
            public static void main(String[] args) {
                Carro carro = new Carro("Veneno", 2020, "Lamborghini", "Preto", 3754);
                Moto moto = new Moto("Trail", 2007, "Honda", "Azul", 9011);
                Caminhao caminhao = new Caminhao("Truck", 2012, "Mercedes", "Amarelo", 7683);

                carro.exibirDetalhes();
                carro.mover();
                carro.buzinar();

                moto.exibirDetalhes();
                moto.mover();
                moto.buzinar();

                caminhao.exibirDetalhes();
                caminhao.mover();
                caminhao.buzinar();
            }
        }

    }
}