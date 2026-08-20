package flamingo.aprendedo.basico.Exercicios;

public class Exercicio16 {
    public static void main(String[] args) {
        double valorCompra = 250;

        System.out.println(valorCompra >= 200
                ? "Valor final: R$ " + (valorCompra * 0.90) : "Valor original da compra: R$ " + valorCompra);
    }
}
