package day1;

public class VaccineSchedule {

    public static void main(String [] args) {
        String worker = "Ron";
        int age = 37;
        String workerType = "non-essential";

        // Print if eligible for medication or not
        System.out.print( age > 60 || workerType == "essential");
    }
}
