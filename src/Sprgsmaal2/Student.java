package Sprgsmaal2;

public class Student {
    String name;
    int id;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void main(String[] args) {
        Student s1 = new Student("tejs", 3); // Her laver vi et nyt objekt ved navn s1. har sat variabler fra constructor ind i fordi det tvang java mig til.
        Student s2 = new Student();
        s2.id = 3;
        s2.name = "frank";

        // denne måde bruger vi reference variabler til at initialisere vores objekt.
        s1.setName("Tejs"); // vi bruger vores metode først refererer vi til hvilket objekt vi benytter. Og så anvender metoden på det objekt.
        s1.getName();
        s1.setId(3);
        s1.getId();
        System.out.println(s1.getName() + s1.getId());
        System.out.println(s2.name + s2.id);
    }
    // Her laver vi en constructor som gør vi ikke behøver getters og setters.
    // Det er en anden måde at lave objekter på.
    Student(String name, int id) {
        this.name = name;
        this.id = id; }

}

