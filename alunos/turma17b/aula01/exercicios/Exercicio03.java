package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double salario;
        Double aumento;
    
        System.out.println("Digite Salario: ");
        salario = entrada.nextDouble();
        System.out.println("Digite Aumento: ");
        aumento = entrada.nextDouble();
    
        System.out.println("O novo valor é de:" + (((salario * aumento)/100) + salario));
    
        entrada.close();
    }
}
