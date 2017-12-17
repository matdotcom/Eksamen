package Sprgsmaal8;

public class Subclass extends Superclass {
    private int a;
    private int b;

    // Her laver vi en constructor som har variablerne a og b.
    // Disse to variabler bliver først noget når vi laver objektet.
    // Superklassens constructor bliver ALTID kaldt først.
    // Måden vi kalder superklassens constructor er ved at skrive super()
    // så når vi laver et objekt i vores subklasse med en constructor, bliver superklassens constructor kaldt først.
    // Vores objekt nedarver så variablerne fra superklassen.
    public Subclass (int x, int y){
        super(3,4);
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        // Her laver vi et nyt objekt, som nedarver variablerne fra superklassen.
        // Samt opretter vi nogle nye variabler med vores constructor vi har lavet.
        Subclass testSuper = new Subclass(1,2);
        System.out.println(testSuper.a);
        System.out.println(testSuper.b);
        System.out.println(testSuper.c);
        System.out.println(testSuper.d);
    }
}
