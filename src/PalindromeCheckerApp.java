import java.util.*;

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

    static boolean palindromeQueueStack(String word){
        System.out.println("QueueStack");
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i=0; i < word.length(); i++){
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        for (int i=0; i < word.length(); i++){
            if(queue.remove() != stack.pop()){
                return false;
            }
        }
        return true;
    }

    static boolean palindromeDeque(String word){
        System.out.println("deque");
        Deque<Character> deque = new ArrayDeque<>();
        for(int i = 0; i < word.length(); i++){
            deque.addLast(word.charAt(i));
        }

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }
        return true;
    }

    static boolean palindromeLinkedList(String word){
        System.out.println("LinkedList");
        LinkedList<Character> linkedList = new LinkedList<>();
        for(int i = 0; i < word.length(); i++){
            linkedList.add(word.charAt(i));
        }

        while(linkedList.size() > 1){
            if(linkedList.removeFirst() != linkedList.removeLast()){
                return false;
            }
        }
        return true;
    }

    static boolean PalindromeRecur(String word, int start, int end ){
        System.out.println("recur");

        if (start >= end){
            return true;
        }

        if(word.charAt(start) != word.charAt(end)){
            return false;
        }

        return PalindromeRecur(word, start+1, end-1);
    }



    public static void main(String[] args){

        double version = 2.0;
        System.out.println("Welcome to the Palindrome Checker Management System ");
        System.out.println("Version : " + version);
        System.out.println("System initialized successfully.");
        String word = "m a d a M";
        word = word.toLowerCase();
        word = word.replace(" ", "");

        boolean status = PalindromeRecur(word, 0, word.length() - 1 );
        if (status){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("not");

        }
    }

}
