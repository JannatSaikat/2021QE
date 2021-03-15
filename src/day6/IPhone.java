package day6;

public class IPhone {

    public static void main(String[] args) {
        //iPhone needs display, Camera, CPU, Battery
       PartsMarket parts = new PartsMarket();

       parts.displayModule();
       parts.cameraModule();

       IPhone rf = new IPhone();

       rf.cPU();
       parts.batteryPack();
       parts.networkSignal();
       rf.operatingSystem();
    }

    void cPU(){
        System.out.println("Apple Creates their own CPU");
    }

    void operatingSystem(){
        System.out.println("iOS made by Apple");
    }

    //public protected default private
    //Access modifier


    // public/protected/nothing=default/private - Access Modifier
    // public - all packages, all classes; protected/default - all cllass

    // static/nothing=non-static - Static/Non-Static
    // int/String/anyDataType/void - Return Type
    // methodName - Name
    //() - Param
    //{we write logic} - Body

}
