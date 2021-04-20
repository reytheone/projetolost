package uri;

import java.util.Scanner;

public class uri1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valA;
        int valB;
        int valC;
        int valD;

        
        valA = entrada.nextInt();
        valB = entrada.nextInt();
        valC = entrada.nextInt();
        valD = entrada.nextInt();

        if ((valB > valC) && (valD > valA) && ((valC + valD) > (valA + valB)) && ((valC > 0) && (valD > 0)) && (valA % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
             }

             entrada.close();

    }
}
