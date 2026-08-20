package flamingo.aprendedo.basico.Exercicios;

public class Exercicio21 {
    public static void main(String[] args) {
        int idade = 25;

        System.out.println(
                idade < 12 ? "Criança" : idade <= 17 ? "Adolescente" :
                        idade <= 59 ? "Adulto" : "Idoso"
        );
    }
}


