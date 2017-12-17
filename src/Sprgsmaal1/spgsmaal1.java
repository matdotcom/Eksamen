package Sprgsmaal1;

public class spgsmaal1{


    public static void main(String[] args) {
        // eksempel på lokal variabel.
        // her initialiseres den ved
        int i;
        i = 0;
        System.out.println("i is = "+ i);

        // eksempel på typecasting.
        double d = 100.04;
        int l = (int)d;
        System.out.println("Double værdien er : " + d);
        System.out.println("Int værdien er : " +l);

    }

    static class IronMan{
        // disse er instance variabler.
        // Instans variabler delklareres i en klasse, men uden for en metode.
        public String realName;
        public int age;

        public String getRealName() {
            return realName;
        }

        public int getAge() {
            return age;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    class Avengers{
        public  void main(String[] args) {
            // instans variablerne initialiseres ved at lave et objekt.
            // hvor vi så der definerer hvad variablerne er for det objekt
            IronMan ironman = new IronMan();
            ironman.realName = "Tony Stark";
            ironman.setAge(30);
            System.out.println(ironman.getRealName()+ironman.getAge());
        }
    }



}
