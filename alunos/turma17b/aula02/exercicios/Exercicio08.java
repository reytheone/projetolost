package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double ladoC;

        System.out.print("Digite a medida A: ");
        ladoA = entrada.nextDouble();
        System.out.print("Digite a medida B: ");
        ladoB = entrada.nextDouble();
        System.out.print("Digite a medida C: ");
        ladoC = entrada.nextDouble();

        if (((ladoA + ladoB) < ladoC) || ((ladoC + ladoB) < ladoA) || ((ladoA + ladoC) < ladoB)) {
            System.out.println("Não é triângulo!");
        } else {
                if ((ladoA == ladoB) && (ladoB == ladoC)) {
                    System.out.println("Triângulo Equilátero!");
                } else {
                        if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
                            System.out.println("Triângulo Isóceles!");
                        } else {
                                System.out.println("Triângulo Escaleno!");
                            }
                        
                    }
                

            }
            
        

        entrada.close();
    }
}
