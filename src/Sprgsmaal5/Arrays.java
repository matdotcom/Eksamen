package Sprgsmaal5;

public class Arrays {
    public static void main(String[] args) {
        // Her opretter vi et array af datatypen integer.
        // Måden java ser det er et array på er ved at den genkender []
        // tallet vi indsætter i klemmerne til sidst er det som definerer hvor mange værdier der er i arrayet
        int bucky[] = new int[10];
        // Her indsætter vi data i vores arrays.
        bucky[0]=1;
        bucky[1]=2;
        bucky[2]=3;
        bucky[3]=4;

        System.out.println(bucky[3]);

        // der er dog en smartere måde at gøre dette på.
        int buckynew[]={2,4,5,6,7,8};
        System.out.println(buckynew[3]);
    }
}
