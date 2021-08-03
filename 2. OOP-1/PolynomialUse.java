public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(); // coeff of everything is 0
        p1.setCoefficient(0, 3); // x to the power zero has coeff 3
        p1.setCoefficient(2, 2); // x to the power two has coeff 2
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(0, 3); // x to the power zero has coeff 3
        p2.setCoefficient(2, 2); // x to the power two has coeff 2
        p2.setCoefficient(1, 4); // x to the power one has coeff 4
        p2.setCoefficient(2, 5); // x^2 coeff now changes to 5
        p2.print();

        p1.add(p2); // p1 = p1 + p2
        p1.print();
        p2.print();

        p2.multiply(p1);
        p1.print();
        p2.print();

        Polynomial p3 = Polynomial.add(p1, p2);
        p3.print();
        p1.print();
        p2.print();

        int ans = p2.evaluate(10);
        System.out.println(ans);
    }
}
