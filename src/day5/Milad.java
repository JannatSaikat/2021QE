package day5;

import java.util.ArrayList;

public class Milad {


    public static void main(String[] args) {
        int  a[] ={233,3446,7485,768867,23,1213,234,121,947287,14542,409203808,25,9,-888888};
        int max = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];}
        }
        System.out.println(max);




    }
}
