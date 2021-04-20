package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float salario;
        float prestacao;
        
        System.out.println("Valor do salário: ");
        salario = entrada.nextFloat();
        System.out.println("Valor da parcela: ");
        prestacao = entrada.nextFloat();

            if (prestacao > (salario * 0.3)) {
                System.out.println("Valor execede a condição!");
            } else {
                System.out.println("Emprestimo aprovado!");
            }

            entrada.close();

    }
}
