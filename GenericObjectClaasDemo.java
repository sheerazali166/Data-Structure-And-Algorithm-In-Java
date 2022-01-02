package kinza_one;

public class GenericObjectClaasDemo<T> {

    T obj;

    public GenericObjectClaasDemo(T obj) {
        this.obj = obj;
    }

    public void print(){

        System.out.println(this.obj);
    }
}

class Main{

    public static void main(String[] args) {

        GenericObjectClaasDemo<Integer> claasDemo = new GenericObjectClaasDemo<>(8);
     // GenericObjectClaasDemo<int> claasDemo = new GenericObjectClaasDemo<>(8); error only use object
        claasDemo.print();

        GenericObjectClaasDemo<String> claasDemo1 = new GenericObjectClaasDemo<>("Kinza");

        claasDemo1.print();

        GenericObjectClaasDemo<Double> claasDemo2 = new GenericObjectClaasDemo<>(8.7823);
     // GenericObjectClaasDemo<double> claasDemo2 = new GenericObjectClaasDemo<>(8.7823); error only use object
        claasDemo2.print();

    }
}
