package uri;

import java.util.Scanner;

public class uri1051 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        double salario;

        
        salario = entrada.nextDouble();

        if (salario > 4500.00) {
            System.out.println(salario * 0.28);
        } else {
            if (salario > 3000.01) {
                System.out.println(salario * 0.18);
            } else {
                if (salario > 2000.01) {
                    System.out.println(salario * 0.08);
                } else {
                    if (salario <= 2000.00) {
                        System.out.println("Isento!");
                    }
                }
            }
        }
        entrada.close();

    }
}
