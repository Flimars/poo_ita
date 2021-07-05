public class Carro {
    int potencia;
    int velocidade;
    String marca;
    String modelo;

    void acelerar(){
        velocidade += potencia;
    }

    void frear(){
        velocidade = velocidade/2;
    }

    int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro "+ marca + " está a velocidade de "+ getVelocidade() +" km/h");
    }
} 