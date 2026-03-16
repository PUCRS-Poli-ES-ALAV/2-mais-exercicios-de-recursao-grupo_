// Exercicio 7
// Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.

import java.util.ArrayList;

public class Ex07 {

    public static int somaArray(ArrayList<Integer> ar){
        if ( ar.size() == 1)
            return ar.get(0);
        
        int st = ar.get(0);
        ar.remove(0);
        return st+somaArray(ar);
    }

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(7);
        ar.add(-2);
        ar.add(23);
        ar.add(40);

        if (ar == null) {
            System.err.println("list is null");
        }
        if ( ar.isEmpty()){
            System.err.println("list is empty");
        }

        System.out.println(somaArray(ar));


    }
}
