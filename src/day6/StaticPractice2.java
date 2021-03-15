package day6;

public class StaticPractice2 {

    static int a = 20;
    static int b = 30;
    int c = 40;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        StaticPractice2 st = new StaticPractice2();
        System.out.println(st.c);
    }

}
