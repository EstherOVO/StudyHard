package Class;

public class Book_Ex03 {
    public static void main(String[] args) {

        Book book1 = new Book("어린왕자(The Little Prince)", "생텍쥐페리(Antoine de Saint-Exupery)", "9783140464079", true);
        Book book2 = new Book("미 비포 유(Me Before You)", "조조 모예스(Jojo Moyes)", "9788952227829", false);

        book1.printInfo();
        book2.printInfo();

        book1.borrowBook();
        book2.borrowBook();

        book2.returnBook();

        book2.borrowBook();
    }
}
