package semanaDois.Somador;
public class App {
    public static void main(String[] args) {
      //Criando Classe e instanciando objetos a partir da class Carro.
     /* Carro c1 = new Carro();
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
      c2.imprimir(); */
      
    /*/ Construtores Diferentes para mesma classe.
      Compra compra1 = new Compra(500);
      System.out.println(compra1.getNumeroParcelas());//== 1
      System.out.println(compra1.getValorTotal());// == 500

      Compra compra2 = new Compra(4, 150);
      System.out.println(compra2.getNumeroParcelas());// == 4
      System.out.println(compra2.getValorParcela());// == 150
      System.out.println(compra2.getValorTotal());// == 600 */

      // project IMC
      Paciente paciente1 = new Paciente(90, 1.77);
      paciente1.CalcularIMC();
      System.out.println(paciente1.Diagnostico());
        
      // Semana2 - Variáveis Estatica vs Instância
      Somador s1 = new Somador();
      s1.nome = "Somador 1";
      Somador s2 = new Somador();
      s2.nome = "Somador 2";
      Somador s3 = new Somador();
      s3.nome = "Somador 3";

      for (int i = 0; i < 3; i++) {
        s1.somar();
        s2.somar();
        s3.somar();        
      }

      s2.somar();

      s1.imprimir();
      s2.imprimir();
      s3.imprimir();





    }
}
