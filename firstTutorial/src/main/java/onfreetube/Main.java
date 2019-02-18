package main.java.onfreetube;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
        private void run() {
            Fraction f1 = new Fraction(3,4);
            Fraction f2 = new Fraction(3,4);
            System.out.println(f1.toString());
            System.out.println(f2.toString());
            Fraction f3 = f1.add(f2);
            System.out.println(f3.toString());

            Fraction f4 = f1.multiply(f2);
            int x = f1.compareTo(f2);
            //System.out.println(x);
            //System.out.println(f3.toString());
            //System.out.println(f4.toString());
            //System.out.println(f1.equals(f2));
            int z = f1.hashCode();
            System.out.println(z);

        }

}

