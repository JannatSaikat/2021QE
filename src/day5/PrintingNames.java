package day5;

public class PrintingNames {

    public static void main(String[] args) {
        PrintingNames c = new PrintingNames();
        c.printShahin();
        c.printCardInfo();
    }

    void printShahin(){
        System.out.println("Shahin");
    }

    void printAlimur(){
        System.out.println("Alimur");
    }

    public void printShahid(){
        System.out.println("Shahid");
    }

    private void printCardInfo(){
        System.out.println("Card number is 094347 98394");
        System.out.println("Card CVV is 985");
    }

    //public, protected, default/nothing, private
    //Access Modifier
}
