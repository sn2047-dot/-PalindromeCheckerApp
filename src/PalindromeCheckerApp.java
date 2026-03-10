import java.util.*;

public class UseCase13PalindromeCheckerApp {

    static boolean palindromeArray(String word){
        int start = 0;
        int end = word.length() - 1;

        while(start < end){
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

        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != stack.pop()){
                return false;
            }
        }

        return true;
    }

    static boolean palindromeDeque(String word){
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

    public static void main(String[] args){

        String word = "m a d a M";
        word = word.toLowerCase();
        word = word.replace(" ", "");

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean arrResult = palindromeArray(word);
        endTime = System.nanoTime();
        long arrayTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean stackResult = palindromeStack(word);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = palindromeDeque(word);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        System.out.println("Array Method: " + arrResult + " | Time: " + arrayTime + " ns");
        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
    }
}