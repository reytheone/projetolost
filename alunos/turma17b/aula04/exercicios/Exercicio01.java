package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int valid;
        valid = percent2(5);
        System.out.println(valid);
    }

    public static int percent2(int a) {
        int valida = (a);

        if (a % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        return valida;
    }

}
