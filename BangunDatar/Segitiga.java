package BangunDatar;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float getLuas() {
        return (float) 0.5 * alas * tinggi;
    }
}
