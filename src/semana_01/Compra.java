

public class Compra {
   int valorTotal;
   int numeroParcelas;

//  a vista
   public Compra(int valor){
    valorTotal = valor;
    numeroParcelas = 1;
   }
//  parcelado
   public Compra(int qtdeParcelas, int valorParcela){
    numeroParcelas = qtdeParcelas;
    valorTotal = valorParcela * qtdeParcelas;
   }
// métodos(0)- usando get
   public int getValorTotal(){
       return valorTotal;
   }
   
   public int getNumeroParcelas(){
       return numeroParcelas; 
   }

   public int getValorParcela(){
       return valorTotal / numeroParcelas;
   } 
}
