package Sprgsmaal3;

public class Vehicle {
    // data
    public int doors;
    public String Brand;

    // kode
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    void BilMetode(){
        System.out.println("Bilen har " + doors + " Døre\n Mærket på bilen er : "+Brand);
    }
    public static void main(String[] args) {

        // objekt
        Vehicle v1 = new Vehicle();
        v1.doors = 4;
        v1.Brand = " Audi ";
        v1.BilMetode();
    }
}
