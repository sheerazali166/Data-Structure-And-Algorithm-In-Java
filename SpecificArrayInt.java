package kinza_one;

public class SpecificArrayInt {

    int a[];

    public SpecificArrayInt(int a[]) {
        this.a = a;
    }

    void printInt(){

        for(int x: a){

            System.out.println(x);
        }
    }

    public void reveseInt(){

        int j = a.length;

        for (int i = 0; i < j; i++) {

            int temp;

            temp = a[i];

            a[i] = a[j];

            a[j] = temp;

            j--;



        }
    }

}


