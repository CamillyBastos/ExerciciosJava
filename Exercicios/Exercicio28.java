package flamingo.aprendedo.basico.Exercicios;

public class Exercicio28 {
    public static void main(String[] args) {
        int plano = 3;

        System.out.println(
                plano == 1 ? "Plano Básico - R$ 29,90" : plano == 2 ? "Plano Intermediário - R$ 59,90" :
                                plano == 3 ? "Plano Premium - R$ 99,90" : "Plano inválido"
        );
    }
}

