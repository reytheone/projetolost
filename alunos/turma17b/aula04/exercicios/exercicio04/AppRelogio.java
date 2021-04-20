package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(0, 0, 0);

        relogio.setHora(12);
        relogio.setMinuto(13);
        relogio.setSegundo(14);

        relogio.horaAtual();

        System.out.println("Hora: " + relogio.getHora());
        System.out.println("Minuto: " + relogio.getMinuto());
        System.out.println("Segundo: " + relogio.getSegundo());
    }
}
