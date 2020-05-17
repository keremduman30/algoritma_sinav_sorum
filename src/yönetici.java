
import java.util.ArrayList;
import java.util.Scanner;


public class yönetici extends calısan{
    private int sorumlu_kisi_sayısı;
  
    private Scanner a=new Scanner(System.in);
    public yönetici(String ad, String soyd, int ID,int sorumlu_kisi_sayısı) {
        super(ad, soyd, ID);
        this.sorumlu_kisi_sayısı=sorumlu_kisi_sayısı;
       
    }

   
    

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster();
        System.out.println("yöneticinin sorumlu oldugu kişi sayısı : " +sorumlu_kisi_sayısı);
    }
    public void zam(int zam){
        
        System.out.println(getAd()+" çalısanlara "+ zam+" tl kadar zam yaptı.... ");   
    }
    
  
    

   


 
    
}
