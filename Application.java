public class Application {

    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r3 = new RationalNumber(3, 4);
        RationalNumber r4 = new RationalNumber(2, 3);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        // Test compareTo method
        System.out.println("r1.compareTo(r2): " + r1.compareTo(r2));
        System.out.println("r2.compareTo(r3): " + r2.compareTo(r3));
        System.out.println("r3.compareTo(r4): " + r3.compareTo(r4));
        System.out.println("r1.compareTo(r4): " + r1.compareTo(r4));
    }
}
