package day6;

public class StaticPractice {

    static int a = 5;
    static int b = 10;

    public static void main(String[] args) {
     sum();
    }

    static void sum() {

        int c = a + b;
        System.out.println("Sum is: " + c);
    }

     void multiply() {
        int c = a * b;
        System.out.println("Multiplication is: " + c);
    }

    void division() {
        int c = b/a;
        System.out.println("Division is: " + c);


    }
}
