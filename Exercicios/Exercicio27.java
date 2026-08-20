package flamingo.aprendedo.basico.Exercicios;

public class Exercicio27 {
    public static void main(String[] args) {
        int codigoProduto = 2;

        System.out.println(
                codigoProduto == 1 ? "Eletrônico" : codigoProduto == 2 ? "Alimento" :
                        codigoProduto == 3 ? "Roupa" : codigoProduto == 4 ? "Livro" : "Categoria inválida"
        );
    }
}



