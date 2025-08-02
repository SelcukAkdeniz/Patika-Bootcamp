package Week3;

public class Film {
    private String ad;
    private int yayinYili;
    private String tur;
    private double imdbPuani;

    public Film(String ad, int yayinYili, String tur, double imdbPuani) {
        this.ad = ad;
        this.yayinYili = yayinYili;
        this.tur = tur;
        this.imdbPuani = imdbPuani;
    }

    public String getAd() {
        return ad;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getTur() {
        return tur;
    }

    public double getImdbPuani() {
        return imdbPuani;
    }

    @Override
    public String toString() {
        return ad + " | " + yayinYili + " | " + tur + " | IMDb: " + imdbPuani;
    }
}
