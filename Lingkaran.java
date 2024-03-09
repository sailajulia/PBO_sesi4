public class Lingkaran extends Bentuk {
    protected double radius;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

    public void hitungPerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    public void hitungArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Lingkaran Lingkaran = new Lingkaran("Lingkaran", 14.0);
        Lingkaran.hitungArea();
        Lingkaran.hitungPerimeter();
        Lingkaran.getInfo();
    }
}