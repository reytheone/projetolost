package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int somapar;
        int somaimp;
        
        somapar = 0;
        somaimp = 0;

        for (int cont = 1; cont < 11; cont++) {
            System.out.print("Digite o " + cont + "° Número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somapar++;
            } else {
                somaimp++;
            }
        }
        System.out.println("Total par:" + somapar);
        System.out.println("Total imp:" + somaimp);

        entrada.close();
        
    }
}
