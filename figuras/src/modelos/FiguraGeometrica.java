package modelos;

import interfaces.Exibir;

public abstract class FiguraGeometrica {
    private int x, y;
    public Exibir exibir;

    public abstract void posicao();

    public FiguraGeometrica(Exibir exibir) {
        this.exibir = exibir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
