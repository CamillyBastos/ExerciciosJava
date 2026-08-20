package flamingo.aprendedo.basico.Exercicios;

public class Exercicio14 {
    public static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;

        System.out.println(emailCorreto && senhaCorreta
                ? "Login realizado com sucesso." : "Email ou senha inválidos.");
    }
}

