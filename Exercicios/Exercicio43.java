package flamingo.aprendedo.basico.Exercicios;

public class Exercicio43 {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCarteirinhaEstudante = true;

        System.out.println(idade < 12 ? "Paga meia" : temCarteirinhaEstudante ?
                "Paga meia" : "Paga inteira"
        );
    }
}

