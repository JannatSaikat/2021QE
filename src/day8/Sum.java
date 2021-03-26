package day8;

public class Sum {

    void sumNumber(int a, int b){
        int x = a + b;
        System.out.println(x);
    }

    void sumNumber(int a, int b, int c) {
        int x = a + b + c;
        System.out.println(x);
    }

    void sumNumber(int a, int b, int c, int d) {
        int x = a + b + c +d;
        System.out.println(x);
    }

    void sumNumber(String a, int b) {
        String x = a + b;
        System.out.println(x);
    }

    void sumNumber(String c, int b, String a) {
        String x = c + b + a;
        System.out.println(x);
    }

    void decide(boolean a , boolean  b) {
        System.out.println(a && b);
    }
}
