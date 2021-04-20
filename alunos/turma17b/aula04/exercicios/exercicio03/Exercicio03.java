package exercicios.exercicio03;

public class Exercicio03 {
    String marca;
    String modelo;
    double consumo;

    public Exercicio03(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public void apresentar() {
        System.out.println("Veículo: "+ marca +" - "+ modelo + " - " + consumo +" Km/L");
    }

        public String exibirDados() {
        return "Veiculo: " + marca + " - " + modelo;
    }

    public double obterConsumo() {
        return consumo;
    }
}
