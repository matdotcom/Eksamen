package Sprgsmaal8;

// Først har vi vores ene klasse som har nogle metoder.
public class Nedarvning {
    int z;
    public void addition(int x, int y){
        z = x + y;
        System.out.println("Summen af numrene er. " +z);
    }
    public void minus(int x, int y){
        z = x - y;
        System.out.println("Foreskellen imellem de to numre er. "+z);
    }
}
// Her har vi vores klasse som nedarver vores første klasses metoder.
// Det gør vi ved at når vi laver klassen skriver vi extends og den tidligere klasses navn
// Så nedarves alle metoder til den nye klasse.
class minUdregning extends Nedarvning{

    // overriding eksempel.
    // For at metoden overrides, skal den have samme navn som metoden i superklassen.
    public void addition(int x, int y){
        System.out.println(" Her er metoden overridet ");
    }
public void multiplikation(int x, int y){
    z=x*y;
    System.out.println("Produktet af de to tal er: "+z);

}

    public static void main(String[] args) {
        int a = 20, b = 10;
        // Her laver vi vores demo objekt for at teste om metoderne fra første klasse er her.
        minUdregning demo = new minUdregning();
        // Og her kan vi se at metoderne nedarves.
        demo.addition(a,b);
        demo.minus(a,b);
        demo.multiplikation(a,b);
    }
}