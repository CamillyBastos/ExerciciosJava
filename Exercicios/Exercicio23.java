package flamingo.aprendedo.basico.Exercicios;

public class Exercicio23 {
    public static void main(String[] args) {
        double salario = 3500;

        System.out.println(
                salario <= 1500 ? "Salário baixo" : salario <= 3000 ? "Salário médio" :
                        salario <= 7000 ? "Salário bom" : "Salário alto"
        );
    }
}
