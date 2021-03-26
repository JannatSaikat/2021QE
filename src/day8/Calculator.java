package day8;

import day7.ExecutionClass;

public class Calculator {

    public static void main(String[] args)  {
        Sum sum = new Sum();
//        ClassName referenceName(can be anything) = new Constructor();
        sum.sumNumber(7, 8);
        sum.sumNumber(3,5,7);
        sum.sumNumber(4,5, 6);
        sum.sumNumber(2,4,6, 3);
        sum.sumNumber("Shahin" , 8);
        sum.sumNumber(8, 4, 6);
    }


}
