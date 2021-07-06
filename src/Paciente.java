

public class Paciente {
    double peso;
    double altura;
    double imc;

    Paciente(double peso, double altura){
        this.peso   = peso;
        this.altura = altura;
    }

    public void CalcularIMC(){
        imc = peso / (altura * altura);
    }

    public String Diagnostico(){
        if (imc < 16){
            return "Baixo peso muito grave";
        }   
        if (imc >= 16 || imc < 17){
            return "Baixo peso grave";
        }   
        if (imc >= 17 || imc <= 18.49){
            return "Baixo peso";
        }   
        if (imc >= 18.50 || imc <= 24.99){
            return "Peso normal";
        }   
        if (imc >= 25 || imc <= 29.99){
            return "Sobrepeso";
        }   
        if (imc >= 30 || imc <= 34.99){
            return "Obesidade grau I";
        }   
        if (imc >= 35 || imc <= 39.99){
            eturn "Obesidade grau II";
        }   
        if (imc >= 40){
            return "Obesidade grau III (Obesidade mórbida)";
        }
        return null;  
        

    }

}
