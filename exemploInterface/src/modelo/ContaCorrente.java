package modelo;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()) {
            super.sacar(valor);
        }
    }
}
