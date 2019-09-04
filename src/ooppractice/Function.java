package ooppractice;


public class Function {
    public static void main(String[] args) {

        Function obj = new Function();

        obj.test();
        int l = obj.Pqr();

    }

    private int Pqr() {
    }

    public void test(){
        System.out.println("test method");
    }

 
         // obj.test();



    //  }

    public int pqr() {
        System.out.println("PQR method");

        int a = 10;
        int b = 20;
        int c = a + b;

        return c;
    }

    public String qa() {
        System.out.println("qa method");
        String s = "Selenium";

        return s;

    }

    public int division(int x, int y) {
        System.out.println("division method");
        int d =x/y;
        return d;
    }


}

// private void test() {


