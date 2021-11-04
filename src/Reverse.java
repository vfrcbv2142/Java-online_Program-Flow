public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(100123));
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(123000));
        System.out.println(reverse(0));
        System.out.println(reverse(2147483647));
    }

    public static int reverse(int x){
        if (x == 0) return 0;
        boolean isNegative = x < 0;
        if (isNegative) x*=-1;
        while (x%10 == 0){
            x/= 10;
        }
        try {
            Integer result = Integer.valueOf(new StringBuilder(((Integer) x).toString()).reverse().toString());
            if (isNegative) return result*-1;
            return result;
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
}
