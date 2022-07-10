package modelo;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo() + limite) {
            super.sacar(valor);
        }
    }
}
