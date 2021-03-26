package day10;

public class EncapsulationPractice {

    private int sSN;
    private int bankAccount;


    public int getsSN() {
        return sSN;
    }

    public void setsSN(int sSN) {
        this.sSN = sSN;
        System.out.println(sSN);
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static void main(String[] args) {
        EncapsulationPractice ep = new EncapsulationPractice();

        ep.setsSN(234788);
    }
}
