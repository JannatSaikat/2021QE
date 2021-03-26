package day8;

public class Tesla implements Car {

    @Override
    public void moves() {
        System.out.println("Moves upto 250m/h");
    }

    @Override
    public void wheel() {
        System.out.println("Aero dynamic wheels");
    }

    @Override
    public void engine(){

    }

    void camera(){
        System.out.println("Cameras around the car");
    }

    void display(){
        System.out.println("Touch display to control your car");
    }
}
