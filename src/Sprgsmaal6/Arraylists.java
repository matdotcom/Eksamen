package Sprgsmaal6;
// Først importerer vi java util arraylist sådan så vi kan bruge Arraylist.
import java.util.ArrayList;
public class Arraylists {
    public static void main(String[] args) {

    // Nu har vi låst til at der kun kan være 4 værdier i arrayet.
    int simple_array[]= new int[4];

    // her er syntax til at lave en arraylist.
    // Først skriver man arraylist, efterfulgt af datatypen inde i <>.
    // Derefter skriver man navnet og så en initial værdi til ens arraylist.
    ArrayList<Integer> myList = new ArrayList<Integer>(5);

    myList.add(3);
    myList.add(4);
    myList.add(5);
        // her printer den størrelsen af ens arraylist. Du kan se den printer ikke initial size.
        // men derimod printer den størrelsen af hvor mange data du har i dit array.
        System.out.println(" Størrelsen af arraylisten er : "+myList.size());
        // Her er en simpel boolean metode som checker ens array om den indeholder 4.
        System.out.println(myList.contains(4));
        // Her er en simpel metode til at fjerne data fra arraylisten.
        myList.remove(1);
        // Her kan vi så se at arraylisten er 2 nu.
        System.out.println(myList.size());
}
}

