package kinza_one;

public class UserDefineGenericClass<T> {

    T obj;

    public UserDefineGenericClass(T obj) {
        this.obj = obj;
    }

    public T getObject(){

        return this.obj;
    }
}


class Student{

    private String name;

    private float marks;

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public void printStudent(){

        System.out.println(this.name);
        System.out.println(this.marks);
    }


}

class MainClass{

    public static void main(String[] args) {

        UserDefineGenericClass<Integer> userDefineGenericClass = new UserDefineGenericClass<Integer>(81);

        System.out.println(userDefineGenericClass.getObject());

        UserDefineGenericClass<String> userDefineGenericClass1 = new UserDefineGenericClass<String>("Kinza");

        System.out.println(userDefineGenericClass1.getObject());

        Student student = new Student("Rabia", 2.23728f);

        UserDefineGenericClass<Student> userDefineGenericClass2 = new UserDefineGenericClass<Student>(student);

        userDefineGenericClass2.getObject().printStudent();






    }
}
