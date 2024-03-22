public class PalindromeChecker {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("\\s+", "").toLowerCase();
        
        int inicio = 0;
        int fim = s.length() - 1;
        

        while (inicio < fim) {

            if (s.charAt(inicio) != s.charAt(fim)) {
                return false;
            }

            inicio++;
            fim--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String palavra = "level";
        System.out.println(checker.isPalindrome(palavra));
    }
}
