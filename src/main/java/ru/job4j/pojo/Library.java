package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Граф Монте Кристо", 350);
        books[1] = new Book("Война и мир", 600);
        books[2] = new Book("Мастер и Маргарита", 556);
        books[3] = new Book("Clean code", 237);
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCountPages());
        }
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCountPages());
            }
        }
    }
}
