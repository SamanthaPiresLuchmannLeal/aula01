package exemplo01;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1;
        livro1 = new Livro();

        Livro livro2 = new Livro();

        livro1.nome = "Programando em Java";
        livro1.autor = "Deitel";

        livro2.nome = "Banco de Dados SQL";
        livro2.autor = "Marcos da Silva";

        System.out.println(livro1.nome);
        System.out.println(livro1.autor);
        System.out.println(livro2.nome);
        System.out.println(livro2.autor);
    }
}
