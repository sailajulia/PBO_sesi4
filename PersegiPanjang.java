public class PersegiPanjang extends Bentuk {
    protected double sisi1;
    protected double sisi2;

    public PersegiPanjang(String nama, double sisi1, double sisi2) {
        super(nama);
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public void hitungPerimeter() {
        perimeter = 2 * (sisi1 + sisi2);
    }

    public void hitungArea() {
        area = sisi1 * sisi2;
    }

    public static void main(String[] args) {
        PersegiPanjang PersegiPanjang = new PersegiPanjang("Persegi Panjang", 3, 4);
        PersegiPanjang.hitungArea();
        PersegiPanjang.hitungPerimeter();
        PersegiPanjang.getInfo();
    }
}