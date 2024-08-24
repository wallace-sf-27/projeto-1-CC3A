public class Main {
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