public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(String nama, double sisi1, double sisi2, double sisi3) {
        super(nama, sisi1, sisi2, sisi3);
    }

    public void hitungPerimeter() {
        perimeter = sisi1 + sisi2 + sisi3;
    }

    public void hitungArea() {
        double s = 0.5 * perimeter;
        area = Math.abs(Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3)));
    }

    public static void main(String[] args) {
        SegitigaSembarang SegitigaSembarang = new SegitigaSembarang("Segitiga Sembarang", 6.0, 4.0, 4.0);
        SegitigaSembarang.hitungPerimeter();
        SegitigaSembarang.hitungArea();
        SegitigaSembarang.getInfo();
    }    
}