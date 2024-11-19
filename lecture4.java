class Main {
   // Ana sınıf - Hesap
   static class Hesap {
       protected double bakiye;
       protected String hesapNo;

       public Hesap(String hesapNo, double baslangicBakiye) {
           this.hesapNo = hesapNo;
           this.bakiye = baslangicBakiye;
       }

       public void paraYatir(double miktar) {
           if (miktar > 0) {
               bakiye += miktar;
               System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
           }
       }

       public void paraCek(double miktar) {
           if (miktar <= bakiye) {
               bakiye -= miktar;
               System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye);
           } else {
               System.out.println("Yetersiz bakiye!");
           }
       }
   }

   // Alt sınıf - VadesizHesap
   static class VadesizHesap extends Hesap {
       private double gunlukLimit;

       public VadesizHesap(String hesapNo, double baslangicBakiye, double gunlukLimit) {
           super(hesapNo, baslangicBakiye);
           this.gunlukLimit = gunlukLimit;
       }

       @Override
       public void paraCek(double miktar) {
           if (miktar > gunlukLimit) {
               System.out.println("Günlük limit aşıldı!");
           } else {
               super.paraCek(miktar);
           }
       }
   }

   // Alt sınıf - VadeliHesap
   static class VadeliHesap extends Hesap {
       private int vadeGunu;
       private double faizOrani;

       public VadeliHesap(String hesapNo, double baslangicBakiye, int vadeGunu, double faizOrani) {
           super(hesapNo, baslangicBakiye);
           this.vadeGunu = vadeGunu;
           this.faizOrani = faizOrani;
       }

       public void faizHesapla() {
           double faizTutari = bakiye * faizOrani / 100;
           bakiye += faizTutari;
           System.out.println("Faiz eklendi. Yeni bakiye: " + bakiye);
       }

       @Override
       public void paraCek(double miktar) {
           System.out.println("Vadeli hesaptan para çekilemez!");
       }
   }

   // Ana metod
   public static void main(String[] args) {
       VadesizHesap vadesiz = new VadesizHesap("123", 1000, 500);
       VadeliHesap vadeli = new VadeliHesap("456", 5000, 30, 15);

       vadesiz.paraYatir(300);
       vadesiz.paraCek(400);
       
       vadeli.paraYatir(1000);
       vadeli.paraCek(500);
       vadeli.faizHesapla();
   }
}




// Example 2 
class Main {
   // Öğrenci sınıfı
   static class Ogrenci {
       // private değişkenler - sadece sınıf içinden erişilebilir
       private String ad;
       private String soyad;
       private int numara;
       private double notOrtalamasi;
       
       // public constructor - dışarıdan erişilebilir
       public Ogrenci(String ad, String soyad, int numara) {
           this.ad = ad;
           this.soyad = soyad;
           this.numara = numara;
           this.notOrtalamasi = 0.0;
       }
       
       // public metodlar - dışarıdan erişilebilir
       public void notEkle(double not) {
           if(not >= 0 && not <= 100) {
               notOrtalamasi = not;
               System.out.println("Not başarıyla eklendi.");
           } else {
               System.out.println("Geçersiz not!");
           }
       }
       
       public String getAd() {
           return ad;
       }
       
       public void setAd(String ad) {
           if(ad != null && !ad.trim().isEmpty()) {
               this.ad = ad;
           }
       }
       
       public double getNotOrtalamasi() {
           return notOrtalamasi;
       }
       
       // private metod - sadece sınıf içinden erişilebilir
       private boolean notGecerliMi(double not) {
           return not >= 0 && not <= 100;
       }
   }
   
   // Okul sınıfı
   static class Okul {
       private String okulAdi;
       private Ogrenci[] ogrenciler;
       private int ogrenciSayisi;
       
       public Okul(String okulAdi, int kapasite) {
           this.okulAdi = okulAdi;
           this.ogrenciler = new Ogrenci[kapasite];
           this.ogrenciSayisi = 0;
       }
       
       public void ogrenciEkle(Ogrenci ogrenci) {
           if(ogrenciSayisi < ogrenciler.length) {
               ogrenciler[ogrenciSayisi] = ogrenci;
               ogrenciSayisi++;
               System.out.println(ogrenci.getAd() + " okula eklendi.");
           } else {
               System.out.println("Okul kapasitesi dolu!");
           }
       }
       
       // protected metod - sadece aynı paket ve alt sınıflardan erişilebilir
       protected void okulBilgileriniGoster() {
           System.out.println("Okul Adı: " + okulAdi);
           System.out.println("Öğrenci Sayısı: " + ogrenciSayisi);
       }
   }
   
   public static void main(String[] args) {
       // Öğrenci oluşturma
       Ogrenci ogrenci1 = new Ogrenci("Ali", "Yılmaz", 101);
       
       // private değişkenlere doğrudan erişim denemesi - HATA
       // ogrenci1.ad = "Mehmet"; // Bu satır hata verir
       
       // public metodlar ile erişim
       ogrenci1.setAd("Mehmet"); // Doğru kullanım
       ogrenci1.notEkle(85.5);
       
       System.out.println("Öğrenci Adı: " + ogrenci1.getAd());
       System.out.println("Not Ortalaması: " + ogrenci1.getNotOrtalamasi());
       
       // private metoda erişim denemesi - HATA
       // ogrenci1.notGecerliMi(85.5); // Bu satır hata verir
       
       // Okul oluşturma
       Okul okul = new Okul("Atatürk İlkokulu", 100);
       okul.ogrenciEkle(ogrenci1);
       okul.okulBilgileriniGoster();
   }
}

/*
private üyeler: Sadece sınıf içinden erişilebilir
public üyeler: Her yerden erişilebilir
protected üyeler: Aynı paket ve alt sınıflardan erişilebilir
Getter/Setter metodları: private değişkenlere kontrollü erişim sağlar
*/
 

