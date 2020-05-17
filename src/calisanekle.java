
import java.util.ArrayList;
import java.util.Scanner;


public class calisanekle implements calısanKayıt{
    private Scanner a=new Scanner(System.in);
    private String  ad;
    private String soyad;
    private String tc;

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
     private boolean askerlik_durumu;
    private boolean sicil;
    private boolean diploma;  

    public calisanekle(String ad,String soyad, String tc) {
        System.out.println("aday calisanin askerlik yapmıs mı (evet / hayır) ");
        String askerlik_durumu=a.nextLine();
        if(askerlik_durumu.trim().equals("")){
            System.out.println("lütfen bos bırakmayın");
        }
        else{
        if(askerlik_durumu.equals("evet")){
        this.askerlik_durumu=true;
        }
        else this.askerlik_durumu=false;
        }
        
        System.out.println("sicili var mı(evet / hayir)");
        String sicil=a.nextLine();
        if(sicil.trim().equals("")){
          System.out.println("lütfen bos bırakmayın");
        }
        else{
        if(sicil.equals("evet")){
        this.sicil=true;
        
        }
        else this.sicil=false;
        }
        System.out.println("diploması varmı (evet/ hayir)");
        String diploma_durumu=a.nextLine();
         if(diploma_durumu.trim().equals("")){
          System.out.println("lütfen bos bırakmayın");
        }
         else{
    if(diploma_durumu.equals("evet")){
    this.diploma=true;
    }
    else diploma=false;
         }
    }

    
    @Override
    public boolean askerlikDurumu() {
        if(askerlik_durumu==true){
                        System.out.println("askerlik  işlemi tamam");

        return true;
        }
        else return false;
    }

    @Override
    public boolean diploma() {
        if(diploma==true){
            System.out.println("diploma işlemi tamam");
        return true;
        }
        else return false;
    }

    @Override
    public boolean sicil() {
            if(sicil==true){
                return true;
                
            }
            else
       System.out.println("sicil  işlemi tamam");
                return false;
            
            
    }
   
}
