package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int sequencia;
        
        sequencia = 1;

        System.out.print("Digite o Número: ");
        numero = entrada.nextInt();

        System.out.print(sequencia);

        while (sequencia <= (numero / 2)) {
            System.out.print(", " + (sequencia * 2));
            sequencia = sequencia * 2;

        }

        entrada.close();

    }
}
