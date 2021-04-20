package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int vezes;

        vezes = 0;

        System.out.print("Digite o Número: ");
        numero = entrada.nextInt();
        
        while (vezes < 11) {
            //System.out.println(numero + " x " + vezes + " = " + (vezes * numero));
            System.out.printf("%d x %02d = %2d\n", numero, vezes, (vezes * numero));
            vezes++;
        }

        System.out.println("FIM");

        entrada.close();
    }
}
