import com.workintech.StackAndQueue.Palindrome;

public class Main {
    public static void main(String[] args) {

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
    }
}