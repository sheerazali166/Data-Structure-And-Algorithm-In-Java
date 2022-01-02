package kinza_one;

public class Generic_Class <T>{

    T x;

    public Generic_Class(T x) {
        this.x = x;
    }

    public void printData(){

        System.out.println(x);
    }

}

class Generic_Class_Two {

    public static void main(String[] args) {

        Generic_Class<String> genericClass = new Generic_Class<String>("Kinza Amjad");

        genericClass.printData();

        Generic_Class<Integer> genericClass1 = new Generic_Class<Integer>(99);

        genericClass1.printData();

        Generic_Class<Double> genericClass2 = new Generic_Class<Double>(22.879);

        genericClass2.printData();


    }
}



