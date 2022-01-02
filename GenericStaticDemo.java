package kinza_one;

public class GenericStaticDemo<T> {

   void genericPrint(T t){

       System.out.println(t);

       // System.out.println(t);
    }

    public static void main(String[] args) {

        GenericStaticDemo<String> s = new GenericStaticDemo<>();
        s.genericPrint("Kinza");

        GenericStaticDemo<Integer> i = new GenericStaticDemo<>();
        i.genericPrint(8);

   }


}
