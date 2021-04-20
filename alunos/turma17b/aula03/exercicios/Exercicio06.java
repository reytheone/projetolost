package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int somapar;
        int somaimp;
        int somapares;

        somapar = 0;
        somaimp = 0;
        somapares = 0;

        for (int cont = 1; cont < 6; cont++) {
            System.out.print("Digite o " + cont + "° Número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somapar = somapar + numero;
                somapares++;
            } else {
                somaimp++;
            }
        }
        if (somapar != 0) {
            System.out.println("Média pares: " + (somapar / somapares));
        }
        System.out.println(" % Impares : " + ((somaimp * 100) / (somapares + somaimp)) + "%");

        entrada.close();

    }
}
