package day7;

import day6.IPhone;

public class PlanB extends PlanA {

    void savings401k(){
        System.out.println("Investing on bonds and foreign market");
    }

    void housingInvestment(){
        System.out.println("You invested on realstate fund from Child");

    }

    void investmentPortfolio( ) {

        super.housingInvestment();
        housingInvestment();
    }

    public static void main(String[] args) {
        PlanB a = new PlanB();
//        a.investmentPortfolio();

        a.studentName("SK", "AFM");

    }
}
