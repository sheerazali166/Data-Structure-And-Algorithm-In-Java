package kinza_one;

class GenericBound {

    public static void main(String[] args) {

        Integer s1Marks[] = {45, 70, 90, 60, 50};

        Student1<Integer> student1 = new Student1<Integer>(s1Marks);

        System.out.println("Total Marks Student 1: " + student1.total());


        Integer s2Marks[] = {70, 65, 85, 78, 67};

        Student1<Integer> student2 = new Student1<Integer>(s2Marks);

        System.out.println("Total marks student 2: " + student2.total());


        if (student1.compareMarks(student2)){
            System.out.println("Same Marks");
        }
        else{
            System.out.println("Different Marks");
        }


    }

}

class Student1<T extends Number> {


    String name;

    T marks[];

    public Student1(T[] marks) {

        this.marks = marks;
    }

    double total(){

        double sum = 0.0;

        for (int i = 0; i < marks.length; i++) {

            sum += marks[i].doubleValue();


        }

        return sum;
    }

    boolean compareMarks(Student1<T> others){

        if (total() == others.total())
            return true;
        return false;
    }

}
