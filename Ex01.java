// Exercicio 1
// Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.

public class Ex01 {

    public static int fatorial(int n){
        if (n <= 1)
            return 1;
        return n*fatorial(n-1);
    }

    public static void main(String[] args) {
        
        int n = 5;

        if (n < 0) {
            System.err.println("n < 0");
        }

        else
           System.out.println(fatorial(n));
    }
}