public class SegitigaKanan extends segitiga {
    public SegitigaKanan(String nama, double alas, double tinggi) {
        super(nama, alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
    }

    public void hitungPerimeter() {
        perimeter = sisi1 + sisi2 + sisi3;
    }

    public void hitungArea() {
        area = 0.5 * sisi1 * sisi2;
    }

public static void main(String[] args) {
    SegitigaKanan SegitigaSikusiku = new SegitigaKanan("Segitiga Siku-siku", 6.0, 8.0);
    SegitigaSikusiku.hitungArea();
    SegitigaSikusiku.hitungPerimeter();
    SegitigaSikusiku.getInfo();
}
}