package kinza_one;

public class GenericArray_Class<T> {

    T x[];

    public GenericArray_Class(T x[]) {

        this.x = x;
    }

    T getData(int i){

        return x[i];
    }

    void printData(T b[]){

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        System.out.println();
        }

    }

    void reveseArray(T b[]){

        int front = 0;

        int roar = b.length-1;

        T temp;

        while (front < roar){

             temp = b[roar];

             b[roar] = x[front];

             x[front] = temp;

             front++;

             roar--;

        }
    }
}

class Generic_Array_Class_Two {

    public static void main(String[] args) {

        System.out.println("========== Integer ============");

        Integer x[] = {10, 20, 30, 40, 50};

        GenericArray_Class<Integer> array_class = new GenericArray_Class<Integer>(x);

        array_class.printData(x);

        int index = array_class.getData(3);

        System.out.println("Get data of index 3: " + index);

        System.out.println("Reversed Data");

        array_class.reveseArray(x);

        array_class.printData(x);

        System.out.println("========== STRING ============");

        String y[] = {"k", "i", "n", "z", "a"};


        GenericArray_Class<String> genericArrayString = new GenericArray_Class<String>(y);

        genericArrayString.printData(y);

        String indexStringArray = genericArrayString.getData(3);

        System.out.println("Index 3 value is: " + indexStringArray);

        System.out.println("Reversed String Array");

        genericArrayString.reveseArray(y);

        genericArrayString.printData(y);

        System.out.println("========== Double ============");

        Double z[] = {22.3, 1.2, 67.456, 2.46, 9.6};

        GenericArray_Class<Double> genericArrayDouble = new GenericArray_Class<Double>(z);

        genericArrayDouble.printData(z);

        Double doubleArrayIndex = genericArrayDouble.getData(2);

        System.out.println("Index 2 data is: " + doubleArrayIndex);

        System.out.println("Reversed Double Array");

        genericArrayDouble.reveseArray(z);

        genericArrayDouble.printData(z);


    }

}
