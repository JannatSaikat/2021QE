package day3;

public class PracticeSwitchCase {

    public static void main(String[] args) {

       int day = 10;


//Conditionals


       if(day == 1) {
           System.out.println("It's Sun day");
       } else if(day == 2) {
           System.out.println("It's Mon day");
       } else if(day == 3) {
           System.out.println("It's Tue day");
       } else if(day == 4) {
           System.out.println("It's Wed day");
       } else if(day == 5) {
           System.out.println("It's Thu day");
       } else if(day == 6) {
           System.out.println("It's Fri day");
       } else if(day == 7) {
           System.out.println("It's sat day");
        } else {
           System.out.println("Wrong input");
       }

       switch(day) {
           case 1:
               System.out.println("It's Sun day");
               break;
           case 2:
               System.out.println("It's Mon day");
               break;
           case 3:
               System.out.println("It's Tue day");
               break;
           case 4:
               System.out.println("It's Wed day");
               break;
           case 5:
               System.out.println("It's Thu day");
               break;
           case 6:
               System.out.println("It's Fri day");
               break;
           case 7:
               System.out.println("It's Sat day");
               break;
           default:
               System.out.println("Wrong Input");
       }
    }
}
