package day10;

import java.util.ArrayList;

public class DataStructures {

    public static void main(String[] args) {

        int a[] = {4, 5, 7};

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pineapple");

        //print Array
        //way 1
        for(int b = 0; b < a.length ; b++) {
            System.out.println(a[b]);
            System.out.println(fruits.get(b));
        }
        //way 2
        for (int e: a) {
            System.out.print(e);
        }

        //Print ArrayList
        //way 1
        System.out.println(fruits);
        //way 2
        for(int c = 0; c < fruits.size(); c++) {
            System.out.println(fruits.get(c));
        }
        //way3
        for (String d: fruits) {
            System.out.print(d);
        }

    }
}
