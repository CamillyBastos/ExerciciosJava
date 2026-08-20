package flamingo.aprendedo.basico.Exercicios;

public class Exercicio33 {
    public static void main(String[] args) {
        double saldo = 500;
        double valorProduto = 300;

        String resultado = saldo >= valorProduto
                ? "Compra aprovada" : "Saldo insuficiente";

        System.out.println(resultado);
    }

}
