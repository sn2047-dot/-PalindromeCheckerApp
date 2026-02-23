import java.util.Stack;


public class PalindromeCheckerApp {

    static boolean palindrome(String word){

        String rev_word = "";
        for(int i = word.length() - 1; i >= 0; i--){
            rev_word += word.charAt(i);
        }

        if (word.equals(rev_word)){
            return true;
        }

        else{
            return false;
        }
    }

    static boolean palindromeArr(String word){

        int start = 0;
        int end = word.length() - 1;

        while(end >= start){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean palindromeStack(String word){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        double version = 2.0;
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : " + version);
        System.out.println("System initialized successfully.");
        boolean status = palindromeArr("madam");
        if (status){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("not");

        }
    }

}
