

public class Paciente {
    double peso;
    double altura;
    double imc;
// Construtor
    Paciente(double peso, double altura){
        this.peso   = peso;
        this.altura = altura;
    }
// Método sem retorno = void 
    public void CalcularIMC(){
        imc = peso / (altura * altura);
    }
// Método com retorno tipo String.
    public String Diagnostico(){
        
        if (imc < 16) return "Baixo peso muito grave";           
        if (imc >= 16 && imc < 17) return "Baixo peso grave";    
        if (imc >= 17 && imc < 18.50) return "Baixo peso";
        if (imc >= 18.50 && imc < 25) return "Peso normal";
        if (imc >= 25 && imc < 30) return "Sobrepeso";           
        if (imc >= 30 && imc < 35) return "Obesidade grau I";           
        if (imc >= 35 && imc < 40) return "Obesidade grau II";
                
        return "Obesidade grau III (Obesidade mórbida)";
    }

}
