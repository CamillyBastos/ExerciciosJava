package flamingo.aprendedo.basico.Exercicios;

public class Exercicio22 {
    public static void main(String[] args) {
        double nota = 8;

        System.out.println(
                nota >= 9 ? "Excelente" : nota >= 7 ? "Bom" : nota >= 5 ? "Recuperação" : "Reprovado"
        );
    }
}

