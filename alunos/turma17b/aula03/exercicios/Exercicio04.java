package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma;
        int conta;

        soma = 1;
        conta = 0;
        numero = 1;

            while (numero != 0) {
            System.out.print("Digite o " + soma + "° Número: ");
            numero = entrada.nextInt();
            conta = conta + numero;
            soma++;

            if (numero == 0) {
                System.out.println("A soma é:" + conta);
            }
        }

        entrada.close();

    }
}
