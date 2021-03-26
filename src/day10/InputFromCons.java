package day10;

import java.util.Scanner;

public class InputFromCons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int telephoneNumber = scan.nextInt();
        String address = scan.next();

        System.out.println(  name + " " + telephoneNumber + " " + address);
    }
}
