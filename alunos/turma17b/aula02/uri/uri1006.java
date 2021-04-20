package uri;

import java.util.Scanner;

public class uri1006 {
    
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
        Double varA;
        Double varB;
        Double varC;
        Double media;
    
        varA = entrada.nextDouble();
        varB = entrada.nextDouble();
        varC = entrada.nextDouble();
    
        media = (((varA * 2) + (varB * 3) + (varC * 5))/10);
    
        System.out.printf("MEDIA = %.1f\n", media);
    
        entrada.close();

    }

}
