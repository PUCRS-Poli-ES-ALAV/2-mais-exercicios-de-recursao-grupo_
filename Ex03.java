// Exercicio 3
// Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.

public class Ex03 {

    public static int fibonacci(int n){
        if ( n <= 1 )
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        
        int n = 5;

        if (n < 0) {
            System.err.println("n < 0");
        }

        System.out.println(fibonacci(n));
    }
}
