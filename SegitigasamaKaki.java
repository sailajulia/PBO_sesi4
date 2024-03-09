public class SegitigasamaKaki extends Segitiga {
    public SegitigasamaKaki(String nama, double alas, double tinggi) {
        super(nama, alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
    }

    public void hitungPerimeter() {
        perimeter = sisi1 + sisi2 + sisi3;
    }

    public void hitungArea() {
        area = 0.5 * sisi1 * sisi2;
    }
public static void main(String[] args) {
    SegitigasamaKaki SegitigasamaKaki = new SegitigasamaKaki("Segitiga Sama Kaki", 3,4);
    SegitigasamaKaki.hitungArea();
    SegitigasamaKaki.hitungPerimeter();
    SegitigasamaKaki.getInfo();
}
}