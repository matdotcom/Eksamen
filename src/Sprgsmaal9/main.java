package Sprgsmaal9;

public class main {
    public static void main(String[] args) {
        Maskine mask1 = new Maskine();
        mask1.start();
        mask1.showInfo();

        Person person1  = new Person("Bob");
        person1.Hej();
        person1.showInfo();
    }
}
