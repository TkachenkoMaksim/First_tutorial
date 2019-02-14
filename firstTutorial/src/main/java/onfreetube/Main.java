package main.java.onfreetube;

public class Main {
    public static void main(String[] args) {
        new Main().runTheApp();
    }
        private void runTheApp() {
            Fraction f1 = new Fraction(1, 2);
            Fraction f2 = new Fraction(2, 3);

            Fraction f3 = f1.add(f2);// сложение
            Fraction f4 = f1.multiply(f2);// умножение
            int f5 = f1.compareTo(f2);
            System.out.println(f3.toString());
            System.out.println(f4.toString());
            System.out.println(f5);
        }

}

