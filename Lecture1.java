// Example 1
public class JavaOrnekleri{
    public static void main(String[] args){
        System.out.println("==Degisken Tipleri");
        byte byteVar = 127;
        short shortVar = 32767;
        
        System.out.println("Byte Degeri: " + byteVar);
        System.out.println("Short Degeri: " + shortVar);
    }
}

public class JavaOrnekleri {
    public static void main(String[] args) {
        // ÖRNEK 1: Değişken Tipleri ve Değer Aralıkları
        System.out.println("=== Değişken Tipleri ve Değer Aralıkları ===");
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println("Byte Değeri: " + byteVar);
        System.out.println("Short Değeri: " + shortVar);
        System.out.println("Integer Değeri: " + intVar);
        System.out.println("Long Değeri: " + longVar);
        System.out.println("Float Değeri: " + floatVar);
        System.out.println("Double Değeri: " + doubleVar);
        System.out.println("Char Değeri: " + charVar);
        System.out.println("Boolean Değeri: " + booleanVar);

        // ÖRNEK 2: Tür Dönüşümleri
        System.out.println("\n=== Tür Dönüşümleri ===");
        int numInt = 100;
        double numDouble = numInt; // Otomatik dönüşüm
        System.out.println("Int -> Double: " + numDouble);

        double piSayisi = 3.14159;
        int piTamSayi = (int) piSayisi; // Manuel dönüşüm
        System.out.println("Double -> Int: " + piTamSayi);

        // ÖRNEK 3: Aritmetik Operatörler ve Hesaplama
        System.out.println("\n=== Aritmetik İşlemler ===");
        int sayi1 = 20;
        int sayi2 = 8;

        System.out.println("Toplama: " + (sayi1 + sayi2));
        System.out.println("Çıkarma: " + (sayi1 - sayi2));
        System.out.println("Çarpma: " + (sayi1 * sayi2));
        System.out.println("Bölme: " + (sayi1 / sayi2));
        System.out.println("Mod: " + (sayi1 % sayi2));

        // ÖRNEK 4: Artırma ve Azaltma Operatörleri
        System.out.println("\n=== Artırma ve Azaltma ===");
        int sayac = 5;
        System.out.println("Sayaç: " + sayac);
        System.out.println("Sayaç++: " + sayac++); // Önce kullan sonra artır
        System.out.println("Yeni Sayaç: " + sayac);
        System.out.println("++Sayaç: " + ++sayac); // Önce artır sonra kullan
        System.out.println("Sayaç--: " + sayac--); // Önce kullan sonra azalt
        System.out.println("--Sayaç: " + --sayac); // Önce azalt sonra kullan

        // ÖRNEK 5: Karşılaştırma Operatörleri
        System.out.println("\n=== Karşılaştırma İşlemleri ===");
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        // ÖRNEK 6: Mantıksal Operatörler
        System.out.println("\n=== Mantıksal İşlemler ===");
        boolean kosul1 = true;
        boolean kosul2 = false;
        System.out.println("kosul1 && kosul2: " + (kosul1 && kosul2));
        System.out.println("kosul1 || kosul2: " + (kosul1 || kosul2));
        System.out.println("!kosul1: " + (!kosul1));

        // ÖRNEK 7: Kısaltılmış Atama Operatörleri
        System.out.println("\n=== Kısaltılmış Atama İşlemleri ===");
        int n = 10;
        System.out.println("Başlangıç değeri: " + n);
        n += 5;  // n = n + 5
        System.out.println("n += 5: " + n);
        n -= 3;  // n = n - 3
        System.out.println("n -= 3: " + n);
        n *= 2;  // n = n * 2
        System.out.println("n *= 2: " + n);
        n /= 4;  // n = n / 4
        System.out.println("n /= 4: " + n);
        n %= 3;  // n = n % 3
        System.out.println("n %= 3: " + n);

        // ÖRNEK 8: String İşlemleri
        System.out.println("\n=== String İşlemleri ===");
        String isim = "Ahmet";
        String soyisim = "Yılmaz";
        int yas = 25;
        double boy = 1.78;

        // String Birleştirme
        String tamIsim = isim + " " + soyisim;
        System.out.println("Tam İsim: " + tamIsim);
        
        // String Formatlama
        String bilgiler = String.format("%s %s, %d yaşında ve %.2f metre boyunda.", 
            isim, soyisim, yas, boy);
        System.out.println("Bilgiler: " + bilgiler);

        // ÖRNEK 9: Pratik Uygulama - Basit Not Hesaplama
        System.out.println("\n=== Not Hesaplama ===");
        int vize = 70;
        int final_notu = 80;
        double ortalama = (vize * 0.4) + (final_notu * 0.6);
        boolean gectiMi = ortalama >= 60;
        
        System.out.println("Vize: " + vize);
        System.out.println("Final: " + final_notu);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Geçti mi? " + gectiMi);
    }
}



public class Ogrenci {
    // Instance fields (nesne degiskenleri)
    private String ad;
    private String soyad;
    private int numara;
    
    // Static field (sinif degiskeni)
    private static int ogrenciSayisi = 0;
    
    // Final field (sabit)
    private final String OKUL = "Coding Universitesi";
    
    // Constructor (Yapici method)
    public Ogrenci(String ad, String soyad, int numara) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        ogrenciSayisi++;
    }
    
    // Getter ve Setter methodlar
    public String getAd() {
        return ad;
    }
    
    public void setAd(String ad) {
        this.ad = ad;
    }
    
    // Static method
    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }
    
    // Instance method
    public void bilgileriGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Numara: " + numara);
        System.out.println("Okul: " + OKUL);
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Yilmaz", 123);
        ogrenci1.bilgileriGoster();
        
        Ogrenci ogrenci2 = new Ogrenci("Buse", "Kara", 456);
        ogrenci2.bilgileriGoster();
        
        System.out.println("Toplam Ogrenci Sayisi: " + Ogrenci.getOgrenciSayisi());
    }
}











public class Ogrenci {
    // Instance fields (nesne degiskenleri)
    private String ad;
    private String soyad;
    private int numara;
    
    // Static field (sinif degiskeni)
    private static int ogrenciSayisi = 0;
    
    // Final field (sabit)
    private final String OKUL = "Coding Universitesi";
    
    // Constructor (Yapici method)
    public Ogrenci(String ad, String soyad, int numara) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        ogrenciSayisi++;
    }
    
    // Getter ve Setter methodlar
    public String getAd() {
        return ad;
    }
    
    public void setAd(String ad) {
        this.ad = "Sude " + ad; // Adin basina "Sude" ekleniyor
    }
    
    // Static method
    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }
    
    // Instance method
    public void bilgileriGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Numara: " + numara);
        System.out.println("Okul: " + OKUL);
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Yilmaz", 123);
        System.out.println("Set metodundan once:");
        ogrenci1.bilgileriGoster();
        
        // setAd metodunu kullanarak ismi degistiriyoruz
        ogrenci1.setAd("Ali");
        System.out.println("\nSet metodundan sonra:");
        ogrenci1.bilgileriGoster();
    }
}







// Daha karmasik bir sinif ornegi
class Kurs {
    // Instance fields
    private String kursAdi;
    private String egitmen;
    private int kapasite;
    private Ogrenci[] ogrenciler;
    private int mevcutOgrenciSayisi;
    
    // Static fields
    private static int toplamKursSayisi = 0;
    
    // Constructor
    public Kurs(String kursAdi, String egitmen, int kapasite) {
        this.kursAdi = kursAdi;
        this.egitmen = egitmen;
        this.kapasite = kapasite;
        this.ogrenciler = new Ogrenci[kapasite];
        this.mevcutOgrenciSayisi = 0;
        toplamKursSayisi++;
    }
    
    // Ogrenci ekleme methodu
    public boolean ogrenciEkle(Ogrenci ogrenci) {
        if (mevcutOgrenciSayisi < kapasite) {
            ogrenciler[mevcutOgrenciSayisi] = ogrenci;
            mevcutOgrenciSayisi++;
            return true;
        }
        return false;
    }
    
    // Kurs bilgilerini gosteren method
    public void kursBilgileriGoster() {
        System.out.println("\nKurs Bilgileri:");
        System.out.println("Kurs Adi: " + kursAdi);
        System.out.println("Egitmen: " + egitmen);
        System.out.println("Kapasite: " + kapasite);
        System.out.println("Mevcut Ogrenci Sayisi: " + mevcutOgrenciSayisi);
        
        System.out.println("\nKayitli Ogrenciler:");
        for (int i = 0; i < mevcutOgrenciSayisi; i++) {
            System.out.println((i+1) + ". Ogrenci: " + 
                ogrenciler[i].getAd());
        }
    }
}




// Inner class (ic sinif) ornegi
class Fakulte {
    private String fakulteAdi;
    
    public Fakulte(String fakulteAdi) {
        this.fakulteAdi = fakulteAdi;
    }
    
    // Inner class
    class Bolum {
        private String bolumAdi;
        private int ogrenciKapasitesi;
        
        public Bolum(String bolumAdi, int ogrenciKapasitesi) {
            this.bolumAdi = bolumAdi;
            this.ogrenciKapasitesi = ogrenciKapasitesi;
        }
        
        public void bolumBilgileriGoster() {
            System.out.println("\nBolum Bilgileri:");
            System.out.println("Fakulte: " + fakulteAdi);
            System.out.println("Bolum: " + bolumAdi);
            System.out.println("Kapasite: " + ogrenciKapasitesi);
        }
    }
}



// Ana test sinifi
public class OOPTest {
    public static void main(String[] args) {
        // 1. Ogrenci ornekleri olusturma
        System.out.println("=== Ogrenci Ornekleri ===");
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Yilmaz", 101);
        Ogrenci ogrenci2 = new Ogrenci("Ayse", "Demir", 102);
        Ogrenci ogrenci3 = new Ogrenci("Mehmet", "Kaya", 103);
        
        ogrenci1.bilgileriGoster();
        System.out.println("\nToplam Ogrenci Sayisi: " + 
            Ogrenci.getOgrenciSayisi());
        
        // 2. Kurs ornegi
        System.out.println("\n=== Kurs Ornegi ===");
        Kurs javaKursu = new Kurs("Java Programlama", "Ahmet Hoca", 3);
        
        // Kursa ogrenci ekleme
        javaKursu.ogrenciEkle(ogrenci1);
        javaKursu.ogrenciEkle(ogrenci2);
        javaKursu.ogrenciEkle(ogrenci3);
        
        // Kurs bilgilerini gosterme
        javaKursu.kursBilgileriGoster();
        
        // 3. Fakulte ve Bolum ornegi (Inner class kullanimi)
        System.out.println("\n=== Fakulte ve Bolum Ornegi ===");
        Fakulte muhendislik = new Fakulte("Muhendislik Fakultesi");
        Fakulte.Bolum bilgisayar = muhendislik.new Bolum("Bilgisayar Muhendisligi", 60);
        bilgisayar.bolumBilgileriGoster();
        
        // 4. Static ve Instance farki
        System.out.println("\n=== Static ve Instance Farki ===");
        Ogrenci ogrenci4 = new Ogrenci("Zeynep", "Ozturk", 104);
        System.out.println("Son Ogrenci Sayisi: " + Ogrenci.getOgrenciSayisi());
        
        // 5. Dizi ile nesne olusturma
        System.out.println("\n=== Ogrenci Dizisi Ornegi ===");
        Ogrenci[] ogrenciler = new Ogrenci[3];
        ogrenciler[0] = new Ogrenci("Can", "Yilmaz", 201);
        ogrenciler[1] = new Ogrenci("Deniz", "Kara", 202);
        ogrenciler[2] = new Ogrenci("Elif", "Ak", 203);
        
        System.out.println("Ogrenci Listesi:");
        for (Ogrenci ogr : ogrenciler) {
            ogr.bilgileriGoster();
            System.out.println();
        }
    }
}
