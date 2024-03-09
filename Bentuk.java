public class Bentuk {
    protected double area;
    protected double perimeter;
    protected String nama;
    protected double sisi1;
    protected double sisi2;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void getInfo() {
        System.out.println("Name: " + nama);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}