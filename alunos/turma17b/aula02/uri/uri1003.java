package uri;

import java.util.Scanner;

public class uri1003 {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int varA;
    int varB;
    int soma;

    varA = entrada.nextInt();
    varB = entrada.nextInt();

    soma = varA + varB;

    System.out.println("SOMA = " + soma);

    entrada.close();

    }

}
