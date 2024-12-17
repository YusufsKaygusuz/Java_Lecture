// polymorphism-guide
public class Main {
    // Üst sınıf - Hayvan
    public static class Animal {
        protected String name;
        protected int age;
        
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public void makeSound() {
            System.out.println("Hayvan ses çıkarıyor");
        }
        
        public void eat() {
            System.out.println(name + " yemek yiyor");
        }
        
        public void displayInfo() {
            System.out.println("\nIsim: " + name);
            System.out.println("Yas: " + age);
        }
    }
    
    // Alt sınıf - Kedi
    public static class Cat extends Animal {
        private String breed;
        
        public Cat(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }
        
        @Override
        public void makeSound() {
            System.out.println(name + " miyavliyor!");
        }
        
        public void scratch() {
            System.out.println(name + " tirmaliyor!");
        }
        
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Irk: " + breed);
            System.out.println("Tur: Kedi");
        }
    }
    
    // Alt sınıf - Köpek
    public static class Dog extends Animal {
        private boolean isTrained;
        
        public Dog(String name, int age, boolean isTrained) {
            super(name, age);
            this.isTrained = isTrained;
        }
        
        @Override
        public void makeSound() {
            System.out.println(name + " havliyor!");
        }
        
        public void fetch() {
            System.out.println(name + " topu getiriyor!");
        }
        
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Egitimli mi: " + (isTrained ? "Evet" : "Hayir"));
            System.out.println("Tur: Kopek");
        }
    }
    
    // Test sınıfı
    public static void processAnimal(Animal animal) {
        System.out.println("\n=== Hayvan Isleniyor ===");
        animal.displayInfo();
        animal.makeSound();
        animal.eat();
        
        // instanceof kullanımı
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // Downcasting
            cat.scratch();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.fetch();
        }
    }
    
    public static void main(String[] args) {
        // Farklı hayvan nesneleri oluşturma
        Cat cat = new Cat("Pamuk", 3, "Tekir");
        Dog dog = new Dog("Karabas", 5, true);
        
        // Polimorfik referanslar kullanma
        Animal animal1 = cat;  // Upcasting
        Animal animal2 = dog;  // Upcasting
        
        // Hayvanları işleme
        processAnimal(animal1);
        processAnimal(animal2);
        
        // Polimorfik dizi kullanımı
        System.out.println("\n=== Tum Hayvanlarin Sesleri ===");
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
