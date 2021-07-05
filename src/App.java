public class App {
    public static void main(String[] args) {
      Carro c1 = new Carro();
      c1.potencia = 10;
      c1.marca =  "Corcel";
      c1.velocidade = 0;

      while (c1.velocidade < 100) {
        c1.acelerar();
        c1.imprimir();
        System.out.println("Acelera mais...");
      }  
      Carro c2 = new Carro();
      c2.potencia  = 15;
      c2.marca = "Brasilia";
      c2.velocidade = 0;
      
        for (int i = 0; i <= 6; i++) {
          c2.acelerar();
          c2.imprimir(); 
          if (c2.velocidade >= 100) {
            c2.frear();                        
          }
        }
      System.out.println("Frear Agora!");
      c2.imprimir();
    }
}
