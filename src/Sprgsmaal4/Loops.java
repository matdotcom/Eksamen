package Sprgsmaal4;

public class Loops {
    public static void main(String[] args) {

        int a = 2;
        // If statement. Måden de fungrer på. Hvis boolean statementet er true i if blokken.
        // Kører koden fra if blokken. 1 gang.
        if(a==2){
            System.out.println("Ja 2 er lig med 2");
        }
        // Hvis boolean konditionen ikke er sand. Kører else statementet.
        else {
            System.out.println(" Har du ændret på a? ");
        }
        // Måden while loops fungerer på dog, er lidt anderledes fra if statements.
        // Dette loop kører så længe boolean expressionen i parantesen er true.
        // Basicly en if statement som gentager sig selv indtil Booleanen er false.
        while(a<20){
            System.out.println(" Ja " + a + " er mindre end 20.");
            a++;
        }
    }
}
