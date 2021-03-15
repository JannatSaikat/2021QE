package day3;

public class ArrayPractice {

    public static void main(String[] args) {

        String names[] = {"Shahin", "ASM", "AFM", "Alimur", "Mursalin", "Milad"};
        char z[] = {'a', 's', 'd', 'f'};

        System.out.println(names.length);

        for(int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);

        }

        //foreach loop
        for (String b: names) {
            System.out.println(b);
        }



    }
}
