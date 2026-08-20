package flamingo.aprendedo.basico.Exercicios;

public class Exercicio41 {
    public static void main(String[] args) {
        double nota = 8;
        double presenca = 80;

        System.out.println(nota >= 7 && presenca >= 75 ? "Aprovado" : nota >= 5 && nota < 7 ?
                "Recuperação" : "Reprovado"
        );
    }
}

