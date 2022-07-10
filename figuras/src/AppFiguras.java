import interfaces.Exibir;
import modelos.Circulo;
import modelos.FiguraGeometrica;
import modelos.Quadrado;
import util.ExibirTela;

public class AppFiguras {
    public static void main(String[] args) {
//        modelos.FiguraGeometrica f1 = new modelos.FiguraGeometrica();

        ExibirTela ex1 = new ExibirTela();

        Circulo c1 = new Circulo(ex1);
        FiguraGeometrica f1 = new Circulo(ex1);
        FiguraGeometrica f2 = new Quadrado(ex1);

        f1.posicao();
        f2.posicao();

//        Exibir e = new Exibir();
//        Exibir ex2 = new ExibirTela();
    }
}
