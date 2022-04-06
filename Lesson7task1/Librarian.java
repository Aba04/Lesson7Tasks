package Lesson7task1;

public class Librarian extends User implements ALibrarian, AAdministrator{
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Библиотекарь нашел книгу");
    }

    @Override
    public void overdueNotification(User user) {
        System.out.println("Библиотекарь уведомил пользователя - " + getName());
    }

    @Override
    public void ordersBooks() {
        System.out.println("Библиотекарь заказал книгу");
    }
}
