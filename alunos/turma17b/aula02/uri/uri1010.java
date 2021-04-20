package uri;

import java.util.Scanner;

public class uri1010 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdadepeca1;
        double valorpeca1;

        int qtdadepeca2;
        double valorpeca2;
        double total;

        qtdadepeca1 = entrada.nextInt();
        valorpeca1 = entrada.nextDouble();

        qtdadepeca2 = entrada.nextInt();
        valorpeca2 = entrada.nextDouble();

        total = ((qtdadepeca1 * valorpeca1) + (qtdadepeca2 * valorpeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        entrada.close();

    }

}
