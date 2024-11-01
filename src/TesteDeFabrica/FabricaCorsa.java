package TesteDeFabrica;

//Fábrica para Corsa
public class FabricaCorsa implements FabricaDeCarro {
@Override
public Carro criarCarro() {
   return new Corsa();
}
}
