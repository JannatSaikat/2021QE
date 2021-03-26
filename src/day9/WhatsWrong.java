package day9;

public class WhatsWrong {

    public static void main(String[] args) {
        printthings();
    }

    static void printthings(){

        int a[] = {2, 5, 4};
        try {
            System.out.println(a[89]);
        } catch (Exception e) {
            System.out.println( " message exception: " + e);
        }



    }
}
