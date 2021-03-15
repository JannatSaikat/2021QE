package day2;

public class IfElseIfElse {

    public static void main(String[] args) {

        int householdIncome = 158000;

        if(householdIncome <= 25000 && householdIncome >0) {
            System.out.println("Lower Income");
        } else if (householdIncome >= 25001 && householdIncome <= 78000) {
            System.out.println("Lower Middle Income");
        } else if (householdIncome >= 78001 && householdIncome <= 187000) {
            System.out.println("Upper Middle Income");
        } else if (householdIncome >= 187001) {
            System.out.println("Higher Income");
        } else {
            System.out.println("Wrong Input");
        }
    }
}
