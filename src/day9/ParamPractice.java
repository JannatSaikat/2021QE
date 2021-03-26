package day9;

import com.sun.java.browser.plugin2.DOM;

public class ParamPractice {

    public static void main(String[] args) {
        ParamPractice pr = new ParamPractice();
        pr.customer("Mursalin", "12/12/1212", 389573285);
        pr.customer("Shahid", "12/12/1212", 92834791);
    }

    void customer(String name, String DOB, int SSN){
        printName(name);
        printDOB(DOB);
        printsSN(SSN);
    }


    void printName(String name){
        System.out.println("Name is: " + name);
    }

    void printDOB(String dOB){
        System.out.println("DOB is: " + dOB);
    }

    void printsSN( int sSN) {
        System.out.println("SSN is: " + sSN);
    }
}
