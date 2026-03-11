// Exercicio 2
// Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.

public class Ex02 {

    public static int somatorio(int n){

        if (n < 0){
            return n+somatorio(n+1);
        }
        
        if (n > 0){
            return n+somatorio(n-1);
        }
        return n;
    }

    public static void main(String[] args) {
        
        int n = 5;

        System.out.println(somatorio(n));
    }
}
