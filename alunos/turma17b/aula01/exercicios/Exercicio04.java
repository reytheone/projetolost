package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double salarioMinimo;
        Double consumoKw;
        Double conta;
                    
        System.out.println("Salario Minimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Qual foi o Consumo: ");
        consumoKw = entrada.nextDouble();

        conta = (salarioMinimo/500)*consumoKw;
        
        System.out.println("O valor do Kw é de:" + (salarioMinimo/500));

        System.out.println("O valor da conta é de:" + ((salarioMinimo/500)*consumoKw));

        System.out.println("O valor da conta com desconto é de:" + (conta * 0.85));
    
        entrada.close();
    }
}
