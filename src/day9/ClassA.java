package day9;

public class ClassA extends ClassB  {

    void methodFromChildClass(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodFromChildClass();
        a.methodFromFather();
        a.grandpa();

        ClassB b = new ClassB();
        b.methodFromFather();
        b.grandpa();

        ClassC c = new ClassC();
        c.grandpa();
    }
}
