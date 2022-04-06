package Lesson7task1;

public class Supplier extends User implements ASupplier, AReader{
    public Supplier(String name){
        super(name);
    }
    @Override
    public void takeBook() {
        System.out.println("Поставщик взял книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Поставщик сделал возврат книги");
    }

    @Override
    public void bringsBooks() {
        System.out.println("Поставщик попросил книги в библиотеку");
    }
}
