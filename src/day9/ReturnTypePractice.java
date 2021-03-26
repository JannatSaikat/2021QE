package day9;

public class ReturnTypePractice {
    public static void main(String[] args) {
        ReturnTypePractice rtp = new ReturnTypePractice();

        System.out.println(rtp.enterName());
        String a  = rtp.enterName();


    }

    void name(){
        String name = "ASM from Name";
        System.out.println(name);
    }
    String enterName(){
        String name = "ASM";
        String name2 = "Milad";
        return name2;
    }

    static int sumCalculation(){
        int a = 5;
        int b = 10;
        int sum = a + b;
        return 8;
    }

    static boolean decision(){
        boolean a = true;
        boolean b   = false;
        return b;
    }





}
