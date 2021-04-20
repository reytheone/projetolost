package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String senha;

        System.out.print("Digite a Senha: ");
        senha = entrada.next();

                if (senha.equals("R10p5")) {
                System.out.println("Acesso concedido!");
            } else {
                System.out.println("Acesso negado!");
            }

            System.out.println( senha.equals("R10p5"));

            entrada.close();
        
        }
}
