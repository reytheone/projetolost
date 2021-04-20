package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.print("Digite a valor do salário: ");
        salario = entrada.nextDouble();

        if (salario > 2000.00) {
            System.out.println("Aliquota de 30%");
        } else {
            if (salario > 1200.00) {
                System.out.println("Aliquota de 25%");
            } else {
                if (salario > 600.00) {
                    System.out.println("Aliquota de 20%");
                } else {
                    if (salario < 600.00) {
                        System.out.println("Isento!");
                    }
                }
            }
        }
        entrada.close();
    }
}
