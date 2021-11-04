public class DivideTwoInteger {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(0, 1));
        System.out.println(divide(1, 1));

    }

    public static int divide(int dividend, int divisor) {
        boolean dividendIsNegative = dividend < 0;
        if (dividendIsNegative) dividend *= -1;

        boolean divisorIsNegative = divisor < 0;
        if (divisorIsNegative) divisor *= -1;

        int counter = 0;
        while (dividend > 0 && dividend >= divisor) {
            dividend = sub(dividend, divisor);
            counter++;
        }
        if (dividendIsNegative ^ divisorIsNegative) {
            counter *= -1;
        }
        return counter;
    }

    private static int sub(int minuend, int subtrahend) {
        int borrow = 0x00;
        while (subtrahend != 0x00) {
            borrow = ((~minuend) & subtrahend);
            minuend = minuend ^ subtrahend;
            subtrahend = (borrow << 1);
        }
        return minuend;
    }

    private static int add(int summand, int addend) {
        int carry = 0x00;
        while (addend != 0x00) {
            carry = (summand & addend);
            summand = summand ^ addend;
            addend = (carry << 1);
        }
        return summand;
    }

    private static int multiply(int mul1, int mul2) {
        int result = 0;
        while (mul2 != 0) {

            if ((mul2 & 1) == 1) {
                result = add(result, mul1);
            }

            mul1 <<= 1;
            mul2 >>>= 1;
        }
        return result;
    }
}
