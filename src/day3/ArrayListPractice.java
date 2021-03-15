package day3;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[]args) {
        ArrayList<String> names = new ArrayList<>();
        //ArrayList<DataType> variableName = new ArrayList<>();

        names.add("Shahin");
        names.add("AFM");
        names.add("ASM");
        names.add("Alimur");
        names.add("SK");
        names.add("Shahid");
        names.add("Rezaul");
        names.add("Mursalin");
        names.remove(2);

        System.out.println(names.indexOf("SK"));


        for ( String a: names) {
            System.out.println(a);
        }

    }
}
