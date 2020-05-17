
public class calısan {
private String ad;
private String soyd;
private int ID;

    public calısan(String ad, String soyd, int ID) {
        this.ad = ad;
        this.soyd = soyd;
        this.ID = ID;
    }


    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyd
     */
    public String getSoyd() {
        return soyd;
    }

    /**
     * @param soyd the soyd to set
     */
    public void setSoyd(String soyd) {
        this.soyd = soyd;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
        public void bilgilerigöster(){
        System.out.println("****Çalısanların Bilgileri***");
        System.out.println("ad : " +getAd());
        System.out.println("soyad : " +getSoyd());
        System.out.println("çalısanın ID'si : " +getID());
        
    
    }

}
