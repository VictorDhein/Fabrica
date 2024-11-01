package TesteDeFabrica;

//Fábrica para Celta
public class FabricaCelta implements FabricaDeCarro {
 @Override
 public Carro criarCarro() {
     return new Celta();
 }
}
