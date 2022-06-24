package exemplo02;

public class Relogio {
    //atributos
    private int hora;
    private int minuto;
    private int segundo;

    // construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.minuto = minuto;
        this.segundo = segundo;
    }


    public void setHora(int novaHora) {
        if(novaHora >= 0 && novaHora < 24){
            hora = novaHora;
        }
    }

    public void setMinuto(int novoMinuto) {
        if(novoMinuto >= 0 && novoMinuto < 60) {
            minuto = novoMinuto;
        }
    }

    public void setSegundo(int novoSegundo) {
        if(novoSegundo >= 0 && novoSegundo < 60) {
            segundo = novoSegundo;
        }
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //métodos = açoes
    public void mostrarHora(){
        System.out.println(
                hora + ":" +
                minuto + ":" +
                segundo);
    }

}
