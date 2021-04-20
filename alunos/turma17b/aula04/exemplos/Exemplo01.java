package exemplos;

// import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        int valor = 35;
        String mensagem = ("Seja bem vindo [Carlos Alberto]");
        
        linha();
        System.out.println("Sistema v0.1");
        linha();
        System.out.println("Seja Bem Vindo [Carlos Alberto]");
        linha2(31);
        linha2(valor);
        System.out.println(mensagem);
        linha2 (mensagem.length());
        linha3 (mensagem.length(), '*');
        linha3 (mensagem.length(), '#');
    }

    public static void linha() {
        System.out.println("------------");

    }

    public static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();

    }

    public static void linha3(int tamanho, char tipo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();

    }
    
}
