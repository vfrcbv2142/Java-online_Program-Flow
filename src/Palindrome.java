public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-111));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(-1111));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1111));
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(44444));
    }

    public static boolean isPalindrome(int x){
        if (x < 0) return false;
        if (x == 0) return true;
        String stringX = ((Integer)x).toString();
        if ((stringX.length() % 2) == 0){
            String StringPartOne = stringX.substring(0, stringX.length() /2);
            StringBuilder StringPartTwo = new StringBuilder(stringX.substring(stringX.length() /2));
            if (StringPartOne.equals(StringPartTwo.reverse().toString())){
                return true;
            }
            return  false;
        }
        else {
            String StringPartOne = stringX.substring(0, (stringX.length() /2)+1);
            StringBuilder StringPartTwo = new StringBuilder(stringX.substring(stringX.length() /2));

            if (StringPartOne.equals(StringPartTwo.reverse().toString())){
                return true;
            }
            return  false;
        }
    }
}
