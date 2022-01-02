package kinza_one;

public class VarArgsMethodUsingObject {

    public static void varArgsMethod(Object ...objects){

        for(Object object: objects){
            System.out.println(" " + object);
        System.out.println();

        }
    }

    public static void main(String[] args) {

        varArgsMethod(7, "Kinza", true, null);

        varArgsMethod();

        varArgsMethod(2, 3, 4.8, 2, 7);

        varArgsMethod(2, 3, 4, 5, 6, 7, 8, 9);
    }
}
