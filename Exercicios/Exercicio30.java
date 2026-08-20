package flamingo.aprendedo.basico.Exercicios;

public class Exercicio30 {
    public static void main(String[] args) {
        int tipoCliente = 3;
        double valorCompra = 500;

        double desconto = tipoCliente == 1 ? 0 :
                          tipoCliente == 2 ? 0.05 :
                                  tipoCliente == 3 ? 0.10 :
                                        tipoCliente == 4 ? 0.15 :
                                                -1;

        System.out.println(desconto == -1 ? "Tipo de cliente inválido."
                : "Valor final: R$ " + (valorCompra - (valorCompra * desconto)));
    }
}
