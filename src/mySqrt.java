public class mySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrtMethod(4));
        System.out.println(mySqrtMethod(8));
        System.out.println(mySqrtMethod(12));
        System.out.println(mySqrtMethod(16));
        System.out.println(mySqrtMethod(24));
        System.out.println(mySqrtMethod(25));
        System.out.println(mySqrtMethod(26));
        System.out.println(mySqrtMethod(31));
        System.out.println(mySqrtMethod(32));
        System.out.println(mySqrtMethod(33));
        System.out.println(mySqrtMethod(36));
    }

    public static int mySqrtMethod(int x){
        int counter = 2;
        while(counter*counter <= x){
            counter++;
        }
        return --counter;
    }
}
