public abstract class Segitiga extends Bentuk {
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    public Segitiga(String nama, double sisi1, double sisi2, double sisi3) {
        super(nama);
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
}