public class StudentManagementApp {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmet Yilmaz", 20, "1234");
        Student student2 = new Student("Ayse Kaya", 21, "5678");

        student1.introduceYourself();
        student2.introduceYourself();
    }
}

class Student {
    private String name;
    private int age;
    private String studentID;

    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void introduceYourself() {
        System.out.println("Adim: " + name + ", yasim: " + age + ", ogrenci numaram: " + studentID);
    }
}




public class BankAccount {
    // Bank account properties (fields)
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor - Used to create a new bank account
    public BankAccount(String accountHolder, double initialDeposit, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.accountNumber = accountNumber;
    }

    // Getter and Setter methods - Provides access to attributes
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Other methods - Defines the behavior of the bank account
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Transaction failed.");
        }
    }

    // Main method - Entry point for testing the BankAccount class
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 500.0, "123456789");
        
        // Testing deposit and withdrawal
        account1.deposit(150.0);
        account1.withdraw(100.0);
        account1.withdraw(600.0); // This should show insufficient balance
    }
}


public class Book {
    // Book properties (fields)
    private String title;
    private String author;
    private int publicationYear;
    private int pageCount;

    // Constructor - Used to create a new book object
    public Book(String title, String author, int publicationYear, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
    }

    // Getter and Setter methods - Provides access to attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Other methods - Defines the behavior of the book object
    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Page Count: " + pageCount);
    }

    // Main method - Entry point for testing the Book class
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 218);
        
        // Display book information
        book1.displayBookInfo();
    }
}

