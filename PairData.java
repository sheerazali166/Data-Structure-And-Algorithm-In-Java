package kinza_one;

public class PairData <T, V>{

    T t;

    V v;

    public PairData(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getTValue(){

        return this.t;
    }

    public V getVValue(){

        return this.v;
    }

    public void printData(){

        System.out.println(getTValue() + "," + getVValue());
    }
}

class Demo{

    public static void main(String[] args) {

        PairData<String, String> data = new PairData<>("Kinza", "Amjad");
        data.printData();

        PairData<Integer, String> data1 = new PairData<>(2, "kinza");
        data1.printData();

        PairData<String, Integer> data2 = new PairData<>("rabia", 5);
        data2.printData();

        PairData<Integer, Double> data3 = new PairData<>(23, 78.623);
        data3.printData();
    }
}