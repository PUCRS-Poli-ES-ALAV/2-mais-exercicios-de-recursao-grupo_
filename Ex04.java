// Exercicio 4
// Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j, passados como parâmetro.

public class Ex04 {

    public static int somatorioJK(int k, int j){
        if ( k < j ){
            return k + somatorioJK(k+1, j);
        }   
        if ( k > j ){
            return somatorioJK(j, k);
        }
        return k;
    }
    public static void main(String[] args) {
        
        int j = 5;
        int k = 0;

        System.out.println(somatorioJK(k, j));
    }
}
