package flamingo.aprendedo.basico.Exercicios;

public class Exercicio42{
    public static void main(String[] args) {
        double saldo = 300;
        double valorProduto = 500;
        boolean clienteVip = true;

        System.out.println(saldo >= valorProduto ? "Compra aprovada" : clienteVip ?
                "Compra aprovada pelo crédito VIP" : "Compra recusada"
        );
    }
}


