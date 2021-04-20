package uri;

import java.util.Scanner;

public class uri1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valor;

        valor = entrada.nextFloat();
        
        if ((valor <= 100) && (valor > 75)) {
            System.out.println("Intervalo (75,100]");            
        } else {
            if ((valor <= 75) && (valor > 50)) {
                System.out.println("Intervalo (50,75]");
            } else {
                if((valor <= 50) && (valor > 25)) {
                    System.out.println("Intervalo (25,50]");
                } else {
                    if ((valor <= 25) && (valor >= 0)) {
                        System.out.println("Intervalo [0,25]");
                    } else {
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }
        entrada.close();
    }
}
