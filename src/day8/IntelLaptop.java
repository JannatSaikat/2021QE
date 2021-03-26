package day8;

public abstract class IntelLaptop implements Laptop {
    @Override
    public void computation() {
        System.out.println("It can compute");
    }

    @Override
    public void portable() {
        System.out.println("portable");
    }

    @Override
    public void display() {
        System.out.println("Display things on screen");
    }

    void camera(){
        System.out.println("Added webcam");
    }

    abstract void brandName();
}
