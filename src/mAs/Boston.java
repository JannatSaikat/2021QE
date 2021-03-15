package mAs;

public class Boston {

    public static void main(String[] args) {
        Boston boston = new Boston();
        boston.subwayMA();
    }

    protected void subwayMA(){
        System.out.println("Only visible within same package");
    }

    public void subway1(){
        System.out.println("Visible from anywhere");
    }

    private void subway2(){
        System.out.println("Only visible in class ");
    }

    void subway3(){
        System.out.println("Only visible within same package");
    }

}
