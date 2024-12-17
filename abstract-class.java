public class Main {
    // Temel karakter özellikleri için abstract sınıf
    public static abstract class GameCharacter {
        protected String name;
        protected int health;
        protected int level;
        
        // Constructor
        public GameCharacter(String name, int health, int level) {
            this.name = name;
            this.health = health;
            this.level = level;
        }
        
        // Abstract metodlar - alt sınıflar implement etmek zorunda
        public abstract void specialMove();
        public abstract void displayStats();
        
        // Normal metod - tüm alt sınıflar kullanabilir
        public void levelUp() {
            level++;
            System.out.println(name + " seviye atladi! Yeni seviye: " + level);
            health += 10;
        }
        
        // Getter ve Setter metodları
        public String getName() {
            return name;
        }
        
        public int getHealth() {
            return health;
        }
        
        public void setHealth(int health) {
            this.health = health;
        }
    }
    
    // Savaşçı sınıfı
    public static class Warrior extends GameCharacter {
        private String weapon;
        private int strength;
        
        public Warrior(String name, int health, int level, String weapon, int strength) {
            super(name, health, level);
            this.weapon = weapon;
            this.strength = strength;
        }
        
        @Override
        public void specialMove() {
            System.out.println(getName() + " guclu bir saldiri yapiyor!");
            strength += 5;
        }
        
        @Override
        public void displayStats() {
            System.out.println("\n=== Savasci Bilgileri ===");
            System.out.println("Isim: " + getName());
            System.out.println("Saglik: " + getHealth());
            System.out.println("Seviye: " + level);
            System.out.println("Silah: " + weapon);
            System.out.println("Guc: " + strength);
        }
    }
    
    // Okçu sınıfı
    public static class Archer extends GameCharacter {
        private int arrowCount;
        private int accuracy;
        
        public Archer(String name, int health, int level, int arrowCount, int accuracy) {
            super(name, health, level);
            this.arrowCount = arrowCount;
            this.accuracy = accuracy;
        }
        
        @Override
        public void specialMove() {
            System.out.println(getName() + " çoklu ok atışı yapıyor!");
            arrowCount -= 3;
        }
        
        @Override
        public void displayStats() {
            System.out.println("\n=== Okçu Bilgileri ===");
            System.out.println("Isim: " + getName());
            System.out.println("Saglık: " + getHealth());
            System.out.println("Seviye: " + level);
            System.out.println("Ok Sayisi: " + arrowCount);
            System.out.println("İsabet: " + accuracy);
        }
    }
    
    // Ana metod - Test işlemleri
    public static void main(String[] args) {
        System.out.println("=== Abstract Sinif Ornegi ===\n");
        
        // Karakterleri oluştur
        Warrior warrior = new Warrior("Aragorn", 100, 1, "Kilic", 15);
        Archer archer = new Archer("Legolas", 80, 1, 30, 90);
        
        // Savaşçı testleri
        System.out.println("--- Savasci Testleri ---");
        warrior.displayStats();
        warrior.specialMove();
        warrior.levelUp();
        
        // Okçu testleri
        System.out.println("\n--- Okcu Testleri ---");
        archer.displayStats();
        archer.specialMove();
        archer.levelUp();
        
        // Polimorfizm örneği
        System.out.println("\n--- Polimorfizm Örneği ---");
        GameCharacter[] characters = {warrior, archer};
        for (GameCharacter character : characters) {
            character.displayStats();
            character.specialMove();
        }
    }
}
