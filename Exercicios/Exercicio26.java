package flamingo.aprendedo.basico.Exercicios;

public class Exercicio26 {
    public static void main(String[] args) {
        int statusPedido = 3;

        System.out.println(
                statusPedido == 1 ? "Pedido recebido" :
                        statusPedido == 2 ? "Pedido em preparação" : statusPedido == 3 ? "Pedido enviado" :
                                statusPedido == 4 ? "Pedido entregue" : "Status inválido"
        );
    }
}

