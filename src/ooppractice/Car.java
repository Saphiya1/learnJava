package ooppractice;

public class Car{

         int mod;
         String name;
         int wheel;

    public static void main(String[] args) {

        Car a = new Car();
        Car b  = new Car();
        Car c = new Car();

          a.mod = 2005;
           a.wheel = 4;
           a.name = "bmw";


           b.mod = 2014;
           b.wheel = 4;

            c.mod =2019;
            c.wheel = 4;


        System.out.println(a.mod);
        System.out.println(a.wheel);
        System.out.println(a.name);
        System.out.println(b.mod);
        System.out.println(b.wheel);

        System.out.println(c.mod);
        System.out.println(c.wheel);


    }

}
