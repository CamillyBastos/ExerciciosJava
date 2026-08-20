package flamingo.aprendedo.basico.Exercicios;

public class Exercicio25 {
    public static void main(String[] args) {
        int xp = 7500;

        System.out.println(
                xp < 1000 ? "Iniciante" : xp <= 4999 ? "Intermediário" :
                                xp <= 9999 ? "Avançado" : "Lendário"
        );
    }
}

