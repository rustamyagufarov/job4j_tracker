package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active + "; " + status + "; " + message);

    }

    public static void main(String[] arg) {
        Error error = new Error();
        Error error404 = new Error(true, 404, "Страница не найдена");
        Error error500 = new Error(false, 500, "Сервер не отвечает");
        error.printInfo();
        error404.printInfo();
        error500.printInfo();
    }
}
