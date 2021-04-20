package exercicios;

import java.util.Scanner;

public class Exercicio05 {
   
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valorCusto;
        Double valorDistrib;
        Double valorImposto;
                           
        System.out.println("Preço de Custo: ");
        valorCusto = entrada.nextDouble();
        
        valorImposto = (valorCusto * 0.45);

        valorDistrib = (valorCusto * 0.28);
                
        System.out.println("O valor de custo é de :" + (valorCusto));
        
        System.out.println("O valor do distribuidor é de:" + (valorCusto * 0.28));

        System.out.println("O valor do imposto é de:" + (valorImposto));

        System.out.println("O valor final para o consumidor é de:" + (valorCusto + valorImposto + valorDistrib));
    
        entrada.close();

    }
}
