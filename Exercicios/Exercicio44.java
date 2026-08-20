package flamingo.aprendedo.basico.Exercicios;

public class Exercicio44 {
    public static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        boolean contaAtiva = false;

        System.out.println(!contaAtiva ? "Conta bloqueada" :
                emailCorreto && senhaCorreta ? "Login realizado" : "Dados inválidos"
        );
    }
}

