package TesteDeFabrica;

//Fábrica para Uno
public class FabricaUno implements FabricaDeCarro {
@Override
public Carro criarCarro() {
   return new Uno();
}
}
