// Example 3.1 Metod Ornekleri Sınıfı
public class Main {
    // Parametre almayan basit bir metod
    void selamVer() {
        System.out.println("Merhaba!");
    }
    
    // Parametre alan bir metod
    void kisiSelamla(String isim) {
        System.out.println("Merhaba " + isim);
    }
    
    // Değer döndüren bir metod
    int topla(int a, int b) {
        return a + b;
    }
    
    // Overloading (Aşırı yükleme) örneği
    double topla(double a, double b) {
        return a + b;
    }

    // Main metodu
    public static void main(String[] args) {
        Main metod = new Main();
        metod.selamVer();
        metod.kisiSelamla("Ahmet");
        System.out.println("Toplam (int): " + metod.topla(5, 3));
        System.out.println("Toplam (double): " + metod.topla(5.5, 3.3));
    }
}

// Example 3.2 - Kalıtım Örneği - Hayvan ve Kopek Sınıfları
public class Main {
    // Ana sınıf içinde Hayvan sınıfını tanımlayalım
    static class Hayvan {
        void sesCikar() {
            System.out.println("Hayvan ses çıkarıyor");
        }
    }

    // Ana sınıf içinde Kopek sınıfını tanımlayalım
    static class Kopek extends Hayvan {
        @Override
        void sesCikar() {
            System.out.println("Hav hav!");
        }
    }

    // Main metodu
    public static void main(String[] args) {
        // Kopek nesnesi oluştur
        Kopek kopek = new Kopek();
        // sesCikar metodunu çağır
        kopek.sesCikar();
        
        // Ekstra olarak polymorphism örneği
        Hayvan hayvan = new Kopek(); // Hayvan referansı ile Kopek nesnesi
        hayvan.sesCikar(); // "Hav hav!" yazacak
    }
}


// Example 3.3 - Araba Sınıfı
public class Main {
    String marka;
    String model;
    int yil;
    
    public Main(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    
    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
    
    public static void main(String[] args) {
        Main araba = new Main("Toyota", "Corolla", 2020);
        araba.bilgileriGoster();
    }
}



// Example 3.4 - OgrenciSistemi Sınıfı
public class Main {
    String[] ogrenciler;
    
    public Main(int kapasite) {
        ogrenciler = new String[kapasite];
    }
    
    void ogrenciEkle(String isim, int index) {
        if (index < ogrenciler.length) {
            ogrenciler[index] = isim;
        }
    }
    
    void ogrencileriListele() {
        for (int i = 0; i < ogrenciler.length; i++) {
            if (ogrenciler[i] != null) {
                System.out.println((i+1) + ". Öğrenci: " + ogrenciler[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Main sistem = new Main(3);
        sistem.ogrenciEkle("Ali", 0);
        sistem.ogrenciEkle("Veli", 1);
        sistem.ogrencileriListele();
    }
}


// Example 3.5 - OgrenciSistemi Sınıfı

class Calisan {
    String ad;
    double maas;
    
    public Calisan(String ad, double maas) {
        this.ad = ad;
        this.maas = maas;
    }
    
    void bilgiGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Maaş: " + maas);
    }
}

public class Main extends Calisan {
    String departman;
    
    public Main(String ad, double maas, String departman) {
        super(ad, maas);
        this.departman = departman;
    }
    
    @Override
    void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Departman: " + departman);
    }
    
    public static void main(String[] args) {
        Main mudur = new Main("Mehmet", 10000, "IT");
        mudur.bilgiGoster();
    }
}


// Example 3.6 - OgrenciSistemi Sınıfı
public class Main {
    // Ana sınıf içinde Ogrenci sınıfını tanımlayalım
    static class Ogrenci {
        private String ad;
        private int yas;
        
        public String getAd() {
            return ad;
        }
        
        public int getYas() {
            return yas;
        }
        
        public void setAd(String ad) {
            this.ad = ad;
        }
        
        public void setYas(int yas) {
            if (yas > 0) {
                this.yas = yas;
            }
        }
    }

    // Main metodu
    public static void main(String[] args) {
        // Ogrenci nesnesi oluştur
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd("Ayşe");
        ogrenci.setYas(20);

        // Ogrenci bilgilerini yazdır
        System.out.println("Öğrenci adı: " + ogrenci.getAd());
        System.out.println("Öğrenci yaşı: " + ogrenci.getYas());
    }
}
