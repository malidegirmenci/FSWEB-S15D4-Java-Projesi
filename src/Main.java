import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* STACK AND QUEUE CHALLENGE TESTS -> ALL PASSED
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome(null));

    }

    public static boolean checkForPalindrome(String text) {
        if (text != null) {
            Palindrome sentence = new Palindrome(text);
            sentence.makeCheckable();
            //return sentence.compareLetterWithQueue();
            return sentence.compareLetterWithStack();
        }else {
            System.out.println("You must not enter null" );
            return false;
        }
     */

        assembler(13);
    }
    public static void assembler(int num){
        System.out.println("Base 10: " + num);
        Stack<Integer> digits = new Stack<>();
        while (0 < num) {
            digits.push(num % 2);
            num /= 2;
        }
        System.out.print("Base 2: ");
        while(!digits.isEmpty()){
            System.out.print(digits.pop());
        }
    }

}