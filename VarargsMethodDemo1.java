package kinza_one;

public class VarargsMethodDemo1 {

    public static void varArgsMethod1(int[] v){

        System.out.println("Numbers of args: " + v.length + " Elements: ");

        for (int x: v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int x[] = {1, 3, 5, 7};

        int y[] = {2, 4};

        int z[] = {};

        varArgsMethod1(x);

        varArgsMethod1(y);

        varArgsMethod1(z);
    }
}
