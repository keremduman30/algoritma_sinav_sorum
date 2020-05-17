
public class calisan_kriterleri {
private String ad;
private String soyad;
private String tc;

    public calisan_kriterleri(String ad, String soyad, String tc) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        String menü="ad : "+getAd()+"\n"
                +"soyad : "+getSoyad()+"\n"
                +"tc  :"+getTc()+"\n";
        return menü;
    }
    

}
