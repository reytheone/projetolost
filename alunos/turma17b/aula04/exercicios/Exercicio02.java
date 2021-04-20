package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int valid;
        valid = menor(11, 10, 15);
        System.out.println("O menor número é o: " + valid);
    }

    public static int menor(int a, int b, int c) {
        
        if ((a <= b) && (a <= c)) {
            return (a);
        } else {
            if ((b <= c) && (b <= a)) {
                return (b);
            } else {
                return (c);
            }
        }
    }

}
