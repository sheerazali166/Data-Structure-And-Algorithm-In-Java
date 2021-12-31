public class Generic_Metod {

   static <T> void genericPrint(T t){

       System.out.println(t);

    }


    public static void main(String[] args) {

       genericPrint(65);

       genericPrint(22.2);

       genericPrint("Hello World");
    }

}


