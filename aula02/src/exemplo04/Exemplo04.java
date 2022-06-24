package exemplo04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro: ");

        try {
            numero = Integer.parseInt(teclado.nextLine());
            System.out.println(numero);
        } catch (InputMismatchException ex) {
            System.out.println("Digitaçao invalida.");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Valor incorreto.");
            System.out.println(ex.getMessage());
        }catch (Exception ex) {
            System.out.println("Erro...");
        } finally {
            System.out.println("Fim do programa.");
            teclado.close();
        }



    }
}
