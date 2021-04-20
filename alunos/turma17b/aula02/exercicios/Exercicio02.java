package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1;
        int nota2;
        double media;

        System.out.println("Nota 1: ");
        nota1 = entrada.nextInt();
        System.out.println("Nota 2: ");
        nota2 = entrada.nextInt();

        media = ((nota1 * 0.4) + (nota2 * 0.6));

        if (media >= 6) {
            System.out.println("Aprovado " + media);
        } else {
           System.out.println("Reprovado " + media);

           entrada.close();
        }
    }
}
