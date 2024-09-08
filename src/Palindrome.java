public class Palindrome {

    public static void main(String[] args) { 
        for (int i = 0; i < args.length; i++) { 
            String s = args[i]; 
            if (isPalindrome(s)) {
                System.out.println("Строка " + s + " является палиндромом");
            }
            else {
                System.out.println("Строка " + s + " не является палиндромом");
            }
        }
    }

    public static String reverseString(String s) {
        String s1 = "";
        for (int n = s.length() - 1; n >= 0; n--) {
            s1 += s.charAt(n);
        }
        return s1;
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            return true;
        }
        return false;
    }
}