// Inheritance-guide
public class Main {
    // Ana araç sınıfı
    public static class Vehicle {
        protected String brand;
        protected String model;
        protected int year;
        protected double dailyRate;
        protected boolean isAvailable;

        public Vehicle(String brand, String model, int year, double dailyRate) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.dailyRate = dailyRate;
            this.isAvailable = true;
        }

        public double calculateRentalCost(int days) {
            return dailyRate * days;
        }

        public void displayInfo() {
            System.out.println("Marka: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Yil: " + year);
            System.out.println("Gunluk Ucret: " + dailyRate + " TL");
            System.out.println("Durum: " + (isAvailable ? "Musait" : "Kirada"));
        }
    }

    // Binek araç sınıfı
    public static class Car extends Vehicle {
        private int numberOfDoors;
        private String transmissionType;
        private boolean hasAirConditioner;

        public Car(String brand, String model, int year, double dailyRate,
                  int numberOfDoors, String transmissionType, boolean hasAirConditioner) {
            super(brand, model, year, dailyRate);
            this.numberOfDoors = numberOfDoors;
            this.transmissionType = transmissionType;
            this.hasAirConditioner = hasAirConditioner;
        }

        @Override
        public double calculateRentalCost(int days) {
            double baseCost = super.calculateRentalCost(days);
            // Klimalı araçlar için ek ücret
            return hasAirConditioner ? baseCost + (50 * days) : baseCost;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Kapi Sayisi: " + numberOfDoors);
            System.out.println("Vites Tipi: " + transmissionType);
            System.out.println("Klima: " + (hasAirConditioner ? "Var" : "Yok"));
        }
    }

    // Motosiklet sınıfı
    public static class Motorcycle extends Vehicle {
        private int engineVolume;
        private boolean hasABS;

        public Motorcycle(String brand, String model, int year, double dailyRate,
                         int engineVolume, boolean hasABS) {
            super(brand, model, year, dailyRate);
            this.engineVolume = engineVolume;
            this.hasABS = hasABS;
        }

        @Override
        public double calculateRentalCost(int days) {
            double baseCost = super.calculateRentalCost(days);
            // ABS'li motosikletler için ek ücret
            return hasABS ? baseCost + (30 * days) : baseCost;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Motor Hacmi: " + engineVolume + "cc");
            System.out.println("ABS: " + (hasABS ? "Var" : "Yok"));
        }
    }

    // Ana metod - Test işlemleri
    public static void main(String[] args) {
        System.out.println("=== ARAC KIRALAMA SISTEMI TESTİ ===");
        
        // Araba oluşturma ve test
        Car car = new Car("Toyota", "Corolla", 2022, 500, 4, "Otomatik", true);
        System.out.println("--- Arac Bilgileri ---");
        car.displayInfo();
        System.out.println("\n5 gunluk kiralama bedeli: " + car.calculateRentalCost(5) + " TL");

        // Motosiklet oluşturma ve test
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2023, 300, 600, true);
        System.out.println("\n--- Motosiklet Bilgileri ---");
        motorcycle.displayInfo();
        System.out.println("\n3 gunluk kiralama bedeli: " + motorcycle.calculateRentalCost(3) + " TL");
    }
}
