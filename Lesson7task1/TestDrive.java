package Lesson7task1;

public class TestDrive {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Dr.Strange");
        librarian.overdueNotification(librarian);
        Supplier supplier = new Supplier("Tanos");
        supplier.returnBook();

        Administrator administrator = new Administrator("Stark");
        administrator.overdueNotification(administrator);

        Reader reader = new Reader("Abl");
        reader.findBook();
        reader.takeBook();

    }
}
