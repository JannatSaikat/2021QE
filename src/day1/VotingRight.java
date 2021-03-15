package day1;

public class VotingRight {

    private int i = 5;

    public static void main(String[] args) {
        String name = "Li";
        int age = 9;
        boolean citizenshipStatus = true;

        // print voter status of a person
        System.out.print( age > 17 && citizenshipStatus == true );
    }
}
