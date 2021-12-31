public class Generic_Method_Two {

    public static void main(String[] args) {

        printGeneric(101); // Calling generic method with integer argument

        printGeneric("JAVA is great"); // Calling generic method with String argument

        printGeneric(3.6267276); // Calling generic method with double argument
    }

    // Defining a static generic method to print any data type
    static <T> void printGeneric(T t){


        //The following statement print which type parameter T this method is handling
        System.out.println(t.getClass().getName() + ":" + t);
    }
}
