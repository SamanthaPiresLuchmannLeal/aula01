import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import util.MongoDB;
import util.MySQL;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class AppCont {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222, 1000);

        MySQL mySQL = new MySQL();
        MongoDB mongoDB = new MongoDB();

        ArrayList<Conta> listaDeContas = new ArrayList();
        HashMap<Integer, Conta> mapaDeContas = new HashMap<>();

        listaDeContas.add(cc1);
        listaDeContas.add(ce1);

//        for (int i = 0; i < contas.size(); i++){
//            System.out.println("Conta: " + contas.get(i).getNumero());
//        }



//        cc1.gravar((mySQL));
//        ce1.gravar(mongoDB);

        mapaDeContas.put(cc1.getNumero(),cc1);
        mapaDeContas.put(ce1.getNumero(),ce1);

        for (Conta c : listaDeContas ) { //para cada Conta c da estrutura  listaDeContas
            System.out.println("Conta no array: " + c.getNumero());
        }

        Conta contaEncontrada = mapaDeContas.get(111);
        System.out.println("Conta encontrada no HashMAp: " + contaEncontrada.getNumero());

    }
}
