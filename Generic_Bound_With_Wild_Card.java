package kinza_one;

public class Generic_Bound_With_Wild_Card {

    public static void main(String[] args) {

        Integer s1Marks[] = {45, 70, 90, 60, 50};

        Student2<Integer> student1 = new Student2<Integer>(s1Marks);

        System.out.println("Total Marks Student 1: " + student1.total());


        Double s2Marks[] = {70.2738, 65.2389, 85.27834, 78.248, 67.4823};

        Student2<Double> student2 = new Student2<Double>(s2Marks);

        System.out.println("Total marks student 2: " + student2.total());


        if (student1.compareMarks(student2)){
            System.out.println("Same Marks");
        }
        else{
            System.out.println("Different Marks");
        }


    }
}

class Student2<T extends Number> {


    String name;

    T marks[];

    public Student2(T[] marks) {

        this.marks = marks;
    }

    double total(){

        double sum = 0.0;

        for (int i = 0; i < marks.length; i++) {

            sum += marks[i].doubleValue();


        }

        return sum;
    }

    boolean compareMarks(Student2<?> others){

        if (total() == others.total())
            return true;
        return false;
    }

}

