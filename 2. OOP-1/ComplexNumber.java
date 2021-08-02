public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int r) {
        real = r;
    }

    public void setImaginary(int img) {
        imaginary = img;
    }

    public void print() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    public void add(ComplexNumber c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public void multiply(ComplexNumber c2) {
        int copyReal = this.real;
        this.real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        this.imaginary = (copyReal * c2.imaginary) + (this.imaginary * c2.real);
    }

    public ComplexNumber conjugate() {
        int newImaginary = this.imaginary * -1;
        ComplexNumber c = new ComplexNumber(this.real, newImaginary);
        return c;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumber c = new ComplexNumber(newReal, newImaginary);
        return c;
    }

}
