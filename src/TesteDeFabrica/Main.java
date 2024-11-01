package TesteDeFabrica;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabricaCelta = new FabricaCelta();
        FabricaDeCarro fabricaCorsa = new FabricaCorsa();
        FabricaDeCarro fabricaUno = new FabricaUno();
        FabricaDeCarro fabricaGol = new FabricaGol();

        Carro celta = fabricaCelta.criarCarro();
        Carro corsa = fabricaCorsa.criarCarro();
        Carro uno = fabricaUno.criarCarro();
        Carro gol = fabricaGol.criarCarro();

        System.out.println("Carros produzidos pela fábrica:");
        celta.exibirInfo();
        corsa.exibirInfo();
        uno.exibirInfo();
        gol.exibirInfo();
    }
}
