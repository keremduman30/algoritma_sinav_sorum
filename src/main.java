
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    private static Scanner a=new Scanner(System.in);
    private static   ArrayList<calisan_kriterleri> arrayekle=new ArrayList<calisan_kriterleri>();
    public static void main(String[] args) throws InterruptedException {
 
       
        String menü="Çalıslar Programına Hosgeldiniz\n"
                + "****************************************************\n"
                + "1-yazılım işleri\n"
                +"2-yonetici işleri\n"
                +"3-cıkıs\n";
        while(true){
            System.out.println(menü);
            System.out.println("lütfen işlem numarasını seciniz");
            int islem=a.nextInt();
            
            if(islem==1){
                yazılımcı yazilim=new yazılımcı("kerem", "duman", 190542013, "java");
                while(true){
                 String yazilim_menüsü="**********************yazilim menüsü*************************\n"
                         + "1-format at\n"
                        +"2-bilgileri göster\n"
                        +"3-cıkıs\n";
                System.out.println(yazilim_menüsü);
                System.out.println(" lütfen yazılım menüsünden işlem numarasını seçin");
                int islem_numara=a.nextInt();
                a.nextLine();
                if(islem_numara==1){
                    System.out.println("hangi işletim sistemini yukluyeceksiiniz");
                    String isletim_sistemi=a.nextLine();
                    yazilim.formatAt(isletim_sistemi);
                }
                else if(islem_numara==2){
                yazilim.bilgilerigöster();
                }
                else if(islem_numara==3){
                    System.out.println("yazlım menüsünden cıkısnız yapılmıstır");
                    break;
                }
                }
               
            }
            else if(islem==2){
                yönetici yönetici=new yönetici("kerem", "duman", 190542013, 20);
                while(true){
                     String yönetici_menüsü="*************yönetici menüsüne hos geldiniz*************\n"
                        + "1-calisan ekle\n"
                        +"2-calisan görüntüle\n"
                         +"3-calisana zam yap\n"
                        + "4-yonetici menüsünden cıkıs yap\n";
                     System.out.println(yönetici_menüsü);
                     System.out.println("lütfen işlem numarasını seçiniz");
                     int islem_no=a.nextInt();
                     a.nextLine();
                     if(islem_no==1){
                        
                         System.out.println("adayın adı : ");
                         String ad=a.nextLine();
                         System.out.println("adayın soyadı : ");
                         String soyad=a.nextLine();
                         System.out.println("adayın TC'si : ");
                         String tc=a.nextLine();
                         calisanekle eklenecek=new calisanekle(ad, soyad, tc);
                         System.out.println("askerlik kontrol ediliyor....");
                         Thread.sleep(2000);
                         if(eklenecek.askerlikDurumu()==false){
                             System.out.println("askerlik yapmadıgı için aday cıkarıldı");
                             continue;
                         }
                         System.out.println("diploma kontrol ediliyor");
                         Thread.sleep(2000);
                         if(eklenecek.diploma()==false){
                             System.out.println("diploma yok aday cıkarıldı");
                             continue;
                         }
                         System.out.println("sicil kontrol ediliyor");
                         Thread.sleep(2000);                         
                         if(eklenecek.sicil()==true){
                             System.out.println("sicili oldugundan dolayı adaylıktan cıkarıldı");
                             continue;
                         }
                            arrayekle.add(new calisan_kriterleri(ad, soyad, tc));
                         System.out.println("tüm işlemler tamam calisan  aday eklendi  ");
                         
                     }
                     else if(islem_no==2){
                         if(arrayekle.size()==0){
                             System.out.println("calisanlarınız bos lütfen önce calisan  ekleyin");
                         }
                                for(calisan_kriterleri eklenenler:arrayekle){
                                    System.out.println(eklenenler);
                                
                                }
                     }
                     else if(islem_no==3){
                         System.out.println("ne kadar zam yapıyorsunuz");
                         int zam=a.nextInt();
                         yönetici.zam(zam);
                     
                     }
                 
                     
                     else if(islem_no==4){
                         System.out.println("yönetici menüsnen cıkıs yapılmıstır");
                         break;
                     }
                }
            
            }
            else if(islem==3){
                System.out.println("programdan cıkılıyor...");
                break;
            }
        }
    }
    
}
