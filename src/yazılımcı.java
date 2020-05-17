
public class yazılımcı extends calısan{
    private String diller;
    
    public yazılımcı(String ad,String soyad,int ID,String diller){
    super(ad, soyad, ID);
    this.diller=diller;
    
    }

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster();
         System.out.println("yazılımcının bildiği diller : " +diller);
    }
    
   
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+" " +isletim_sistemi+" işletim sistemini   yüklüyecek...");
    }
    
}
