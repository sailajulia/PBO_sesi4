public class SegitigasamaSisi extends Segitiga {
    public SegitigasamaSisi(String nama, double sisi) {
        super(nama, sisi, sisi, sisi);
    }

    public void hitungPerimeter() {
        perimeter = sisi1 + sisi2 + sisi3;
    }

    public void hitungArea() {
        area = 0.5 * sisi1 * sisi2;
    }

public static void main(String[] args) {
    SegitigasamaSisi SegitigasamaSisi = new SegitigasamaSisi("Segitiga Sama Sisi", 3.0);
    SegitigasamaSisi.hitungArea();
    SegitigasamaSisi.hitungPerimeter();
    SegitigasamaSisi.getInfo();
}
}