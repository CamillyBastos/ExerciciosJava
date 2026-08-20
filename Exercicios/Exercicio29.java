package flamingo.aprendedo.basico.Exercicios;

public class Exercicio29 {
    public static void main(String[] args) {
        double imc = 27.5;

        System.out.println(
                imc < 18.5 ? "Abaixo do peso" : imc <= 24.9 ? "Peso normal" :
                                imc <= 29.9 ? "Sobrepeso" : "Obesidade"
        );
    }
}

