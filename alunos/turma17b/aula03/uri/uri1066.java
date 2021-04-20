package uri;

import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int somapar;
        int somaimp;
        int somapos;
        int somaneg;

        somapar = 0;
        somaimp = 0;
        somapos = 0;
        somaneg = 0;

        for (int cont = 1; cont < 6; cont++) {

            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somapar++;
            } else {
                somaimp++;
            }

            if (numero > 0) {
                somapos++;
            } else {
                if (numero < 0) {
                    somaneg++;
                }
                
            }

        }

        System.out.println(somapar + " valor(es) par(es)");
        System.out.println(somaimp + " valor(es) impar(es)");
        System.out.println(somapos + " valor(es) positivo(s)");
        System.out.println(somaneg + " valor(es) negativo(s)");

        entrada.close();
    }
}
