public class Swap_Method {

    public static void main(String[] args) {

        swap(5, 6);

    }

   private static void swap(int x, int y){

       System.out.println("Before Swap: X is " + x);

       System.out.println("Before Swap: Y is " + y);

        int temp;

        temp = x;

        x = y;

        y = temp;

       System.out.println("After Swap: X is " + x);

       System.out.println("After Swap: Y is " + y);

    }
}
