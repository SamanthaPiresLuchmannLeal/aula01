package exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {
//        int numeros[], a; // neste caso colocar colchetes apos o nome da variavel, significa que numeros é um vetor e a é uma variavel int
//        int [] numeros1, b; // neste caso de colocar colchetes apos a declaraçao do tipo int significa que cada nome é um vetor do tipo inteiro

        final int TAMANHO = 5;
        int numeros[] = new int[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            numeros[i] = i;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
