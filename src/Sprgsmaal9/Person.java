package Sprgsmaal9;

public class Person implements Interface {

    private String name;
    public Person(String name) {
        this.name = name;
    }

    public void Hej(){
        System.out.println("Hello There. ");
    }

    // Da vi har implementeret interfacet i toppen skal denne metode være i vores klasse.
    public void showInfo() {
        System.out.println("Mit navn er " +name);
    }
}
