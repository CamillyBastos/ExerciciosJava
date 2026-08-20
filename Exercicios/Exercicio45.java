package flamingo.aprendedo.basico.Exercicios;

public class Exercicio45 {
    public static void main(String[] args) {
        double valorCompra = 400;

        double desconto = valorCompra <= 100 ? 0 :
                valorCompra <= 300 ? 0.05 :
                        valorCompra <= 500 ? 0.10 :
                                0.15;

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra + "\nDesconto: " + (desconto * 100) + "%" +
                "\nValor do desconto: R$ " + valorDesconto + "\nValor final: R$ " + valorFinal
        );
    }
}
