package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 5000);
        Pessoa p2 = new Pessoa("Ana", 6000);
        
        p1.apresentar();
        System.out.println(p1.exibirDados());
        
        p2.apresentar();
        System.out.println(p2.exibirDados());
    }
}
