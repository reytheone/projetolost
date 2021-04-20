package exercicios.exercicio03;

public class AppExercicio03 {
    public static void main(String[] args) {
        Exercicio03 c1 = new Exercicio03("Subaru", "Impreza", 9.5);
        Exercicio03 c2 = new Exercicio03("Subaru", "Forester", 8.5);
        Exercicio03 c3 = new Exercicio03("Subaru", "Legacy", 9.0);

        System.out.println("Segue abaixo a lista de veículos pesquisados:");
        System.out.println("---------------------------------------------");

        c1.apresentar();
        c1.exibirDados();
        c1.obterConsumo();
        
        c2.apresentar();
        c2.exibirDados();
        c2.obterConsumo();

        c3.apresentar();
        c3.exibirDados();
        c3.obterConsumo();

    }
}
