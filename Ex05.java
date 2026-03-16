// Exercicio 5
// Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.

public class Ex05 {

    public static boolean isPal(String str){
        if (str.length() == 0 || str.length() == 1)
            return true;

        if (str.charAt(0) == str.charAt(str.length()-1)){
            if (str.length() >= 2)
                return isPal(str.substring(1,str.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        
        String str = "asa";
        
        System.out.println(isPal(str)); 
    }
}
