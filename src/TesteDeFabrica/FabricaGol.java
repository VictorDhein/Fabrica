package TesteDeFabrica;

//Fábrica para Gol
public class FabricaGol implements FabricaDeCarro {
@Override
public Carro criarCarro() {
   return new Gol();	

   
}
}
