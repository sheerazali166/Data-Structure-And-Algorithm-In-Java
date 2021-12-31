public class Swap_Generic_Class_Method {

   public static <T> void swap(T x, T y){

       System.out.println("Before Swap:");

       System.out.println("x is: " + x + " y is: " + y);

        T temp;

        temp = x;

        x = y;

        y = temp;

       System.out.println("After Swap:");

       System.out.println("x is: " + x + " y is: " + y);

    }


    public static void main(String[] args) {


        Integer x  = new Integer(22);

        Integer y = new Integer(33);




        swap(x, y);




    }


}
