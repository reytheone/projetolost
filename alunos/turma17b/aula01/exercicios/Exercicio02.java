package exercicios;

import java.util.Scanner;

public class Exercicio02 {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int Nota1;
    int Nota2;

    System.out.println("Digite Nota1: ");
    Nota1 = entrada.nextInt();
    System.out.println("Digite Nota2: ");
    Nota2 = entrada.nextInt();

    System.out.println("A sua média foi " + (Nota1 + Nota2)/2);

    entrada.close();
 }   
}
