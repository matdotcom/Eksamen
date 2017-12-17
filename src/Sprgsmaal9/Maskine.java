package Sprgsmaal9;

public class Maskine implements Interface {
    private int id = 7;
    public void start(){
        System.out.println("beep boop, Maskine startet. ");
    }


    public void showInfo() {
        System.out.println("Maskinens id er : " +id);
    }
}
