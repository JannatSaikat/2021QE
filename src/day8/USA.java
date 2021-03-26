package day8;

public class USA extends Europe {

    @Override
    void fishStorage() {
        System.out.println("Store fish for max of 150 days");
    }

    void europeLaw(){
        super.fishStorage();
    }

    public static void main(String[] args) {
      USA ref  = new USA();
      ref.fishStorage();
      ref.europeLaw();

    }
}
