public class PalindromeCheckerApp {

    static boolean palindrome(String word){

        String rev_word = "";
        for(int i = word.length() - 1; i >= 0; i--){
            rev_word += word.charAt(i);
        }

        if (word.equals(rev_word)){
            System.out.println("Palindrome");
            return true;
        }

        else{
            System.out.println("not");
            return false;
        }
    }

    public static void main(String[] args){

        double version = 1.0;
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : " + version);
        System.out.println("System initialized successfully.");
        palindrome("helo");

    }

}
