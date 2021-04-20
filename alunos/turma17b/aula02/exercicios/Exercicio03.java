package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        float numero1;
        float numero2;

        System.out.println("Nota 1: ");
        numero1 = entrada.nextFloat();
        System.out.println("Nota 2: ");
        numero2 = entrada.nextFloat();

            if (numero1 < numero2) {
                System.out.println("A ordem dos números é essa: " + numero1 + " - " + numero2);
            }
            else
            {
                System.out.println("A ordem dos números é essa: " + numero2 + " - " + numero1);
            }

            entrada.close();
}

}
