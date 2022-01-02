package kinza_one;

public class VarArgsMethodUsingElipsis {

    static void varArgsMethod(int ...v){

        System.out.println("Numbers of Elements: " + v.length);

        for (int x: v){
            System.out.println(x + " ");
        System.out.println();
        }

    }

    public static void main(String[] args) {

        varArgsMethod(9);

        varArgsMethod(1, -9, 7, -5);

        varArgsMethod();
    }
}
