package kinza_one;

public class Two_Paarameter_Generic_Class<T, V> {

    T t;

    V v;

    public Two_Paarameter_Generic_Class(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void print(){

        System.out.println(this.t);

        System.out.println(this.v);
    }
}

class MyClass{

    public static void main(String[] args) {

        Two_Paarameter_Generic_Class<String, Integer> aClass = new Two_Paarameter_Generic_Class<>("Kinza", 20);

        aClass.print();

        Two_Paarameter_Generic_Class<Integer, Double> bClass = new Two_Paarameter_Generic_Class<>(9, 32.273);

        bClass.print();
    }

}
