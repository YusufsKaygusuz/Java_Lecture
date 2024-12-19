public class Main {
    // Savaş yeteneklerini tanımlayan interface
    public static interface Fightable {
        void attack();
        void defend();
        int calculateDamage();
        void usePotion();
    }
    
    // Savaşçı sınıfı
    public static class Warrior implements Fightable {
        private String name;
        private String weapon;
        private int strength;
        private int health;
        
        public Warrior(String name, String weapon, int strength, int health) {
            this.name = name;
            this.weapon = weapon;
            this.strength = strength;
            this.health = health;
        }
        
        @Override
        public void attack() {
            System.out.println(name + " " + weapon + " ile saldiriyor!");
        }
        
        @Override
        public void defend() {
            System.out.println(name + " kalkaniyla savunma yapiyor!");
        }
        
        @Override
        public int calculateDamage() {
            return strength * 2;
        }
        
        @Override
        public void usePotion() {
            System.out.println(name + " can iksiri iciyor!");
            health += 20;
            System.out.println("Yeni saglik: " + health);
        }
        
        public void displayInfo() {
            System.out.println("\n=== Savasci Bilgileri ===");
            System.out.println("Isim: " + name);
            System.out.println("Silah: " + weapon);
            System.out.println("Guç: " + strength);
            System.out.println("Saglik: " + health);
        }
    }
    
    // Büyücü sınıfı
    public static class Mage implements Fightable {
        private String name;
        private String magicType;
        private int mana;
        private int health;
        
        public Mage(String name, String magicType, int mana, int health) {
            this.name = name;
            this.magicType = magicType;
            this.mana = mana;
            this.health = health;
        }
        
        @Override
        public void attack() {
            System.out.println(name + " " + magicType + " buyusu yapiyor!");
            mana -= 10;
        }
        
        @Override
        public void defend() {
            System.out.println(name + " buyu kalkani olusturuyor!");
            mana -= 5;
        }
        
        @Override
        public int calculateDamage() {
            return mana / 10;
        }
        
        @Override
        public void usePotion() {
            System.out.println(name + " mana iksiri iciyor!");
            mana += 30;
            System.out.println("Yeni mana: " + mana);
        }
        
        public void displayInfo() {
            System.out.println("\n=== Buyucu Bilgileri ===");
            System.out.println("Isim: " + name);
            System.out.println("Buyu Turu: " + magicType);
            System.out.println("Mana: " + mana);
            System.out.println("Saglik: " + health);
        }
    }
    
    // Ana metod - Test işlemleri
    public static void main(String[] args) {
        System.out.println("=== Interface Ornegi ===\n");
        
        // Karakterleri oluştur
        Warrior warrior = new Warrior("Aragorn", "Kilic", 15, 100);
        Mage mage = new Mage("Gandalf", "Ates", 100, 80);
        
        // Savaşçı testleri
        System.out.println("--- Savasci Testleri ---");
        warrior.displayInfo();
        warrior.attack();
        warrior.defend();
        System.out.println("Savasci hasari: " + warrior.calculateDamage());
        warrior.usePotion();
        
        // Büyücü testleri
        System.out.println("\n--- Buyucu Testleri ---");
        mage.displayInfo();
        mage.attack();
        mage.defend();
        System.out.println("Buyucu hasari: " + mage.calculateDamage());
        mage.usePotion();
        
        // Interface ile polimorfizm örneği
        System.out.println("\n--- Interface Polimorfizm Ornegi ---");
        Fightable[] fighters = {warrior, mage};
        for (Fightable fighter : fighters) {
            fighter.attack();
            fighter.defend();
            System.out.println("Hasar: " + fighter.calculateDamage());
        }
    }
}
