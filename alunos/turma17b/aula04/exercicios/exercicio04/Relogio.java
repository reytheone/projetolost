package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int novaHora) {
        if (novaHora > -1 && novaHora < 24) {
            hora = novaHora;
        }
    }

    public void setMinuto(int novoMinuto) {
        if (novoMinuto > -1 && novoMinuto < 60) {
            minuto = novoMinuto;
        }
    }

    public void setSegundo(int novoSegundo) {
        if (novoSegundo > -1 && novoSegundo < 60) {
            segundo = novoSegundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }
}