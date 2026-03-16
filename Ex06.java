// Exercicio 6
// Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.

public class Ex06 {

    public static String convBase2(int n){
        if ( n == 0)
            return "0";
        if ( n == 1 )
            return "1";
        
        return convBase2(n/2)+(n%2);
    }

    public static void main(String[] args) {
        int n = 7;

        if ( n < 0){
            System.err.println(" n < 0");
        }

        System.out.println(convBase2(n));
    }
}
