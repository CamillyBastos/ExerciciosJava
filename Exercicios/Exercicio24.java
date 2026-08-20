package flamingo.aprendedo.basico.Exercicios;

public class Exercicio24 {
    public static void main(String[] args) {
        int temperatura = 28;

        System.out.println(
                temperatura < 15 ? "Frio" : temperatura <= 25 ? "Agradável" :
                        temperatura <= 35 ? "Quente" : "Muito quente"
        );
    }
}

