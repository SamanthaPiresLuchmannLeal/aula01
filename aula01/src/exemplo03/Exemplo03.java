package exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        int contador;

        contador = 0; // 1. inicio
        while(contador < 5) { // enquanto   2. condiçao
            System.out.println("Contagem");
//            contador = contador + 1;   maneiras diferentes de fazer a mesma coisa
//            contador += 1;
            contador++; // 3. passo
        }

        for (contador = 0; contador < 6; contador ++) {
            System.out.println("contagem");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
