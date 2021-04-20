package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        double valor = 123.456;
        int numero = 12;

        // printf( FORMATO , VARIAVEIS );
        // %d = int
        // %f = com decimal
        // %.xf = x é o número de casas decimais
        // \n vai para a próxima linha

        System.out.printf("O valor %.1f é baseado em %d\n.", valor, numero * 2);


    }
}
