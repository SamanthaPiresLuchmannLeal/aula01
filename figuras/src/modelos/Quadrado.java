package modelos;

import interfaces.Exibir;

public class Quadrado extends FiguraGeometrica{
    public Quadrado(Exibir exibir) {
        super(exibir);
    }

    @Override
    public void posicao() {
        exibir.show( "modelos.Quadrado: " + getX() + ", " + getY());
    }
}
