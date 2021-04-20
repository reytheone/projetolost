package exemplos.exemplo03;

public class Pessoa {
    // atributos = característica, a pessoa é
    String nome;
    double salario;

    // construtor = preparar, inicializar o objeto
    public Pessoa(String n, double s) {
        this.nome = nome;
        this.salario = salario;
    }

    // metodos - ação, a pessoa faz
    public void apresentar() {
    System.out.println("Olá! Eu sou " + nome);
   
    }

    public String exibirDados() {
        return nome + " - " + salario;
    }
    
}   