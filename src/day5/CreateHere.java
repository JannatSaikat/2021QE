package day5;

public class CreateHere {

    private int studentId = 101;
    String studentName = "John";


    void printName(){
        System.out.println("This method prints name");
        System.out.println("Just to check it's the right method");
    }

    void methodForPrintingId(){
        System.out.println("This method prints ID");
    }

    public static void main(String[] args) {
        CreateHere refOfClass = new CreateHere(); //object creation

        System.out.println(refOfClass.studentId);
        System.out.println(refOfClass.studentName);
        refOfClass.methodForPrintingId();
    }


}
