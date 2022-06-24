package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(12,34,40);

//        relogio.hora =12;
//        relogio.minuto = 64;
//        relogio.segundo = 11;

        relogio.setHora(10);
        relogio.setMinuto(31);
        relogio.setSegundo(49);

        relogio.mostrarHora();

        int horaAtual = (relogio.getHora() + relogio.getMinuto() + relogio.getSegundo());

        System.out.println("Hora: " + horaAtual);

    }
}
