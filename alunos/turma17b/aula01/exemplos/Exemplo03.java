package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorInteiro;
        double valorDecimal;

        System.out.println("Digite o valor inteiro: ");
        valorInteiro = entrada.nextInt();
        System.out.println("Digite o valor decimal: ");
        valorDecimal = entrada.nextDouble();

        System.out.println("Você digitou " + valorInteiro + " e " + valorDecimal);

        entrada.close();
    }
}
