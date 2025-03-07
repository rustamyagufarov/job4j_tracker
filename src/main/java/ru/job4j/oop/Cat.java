package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Имя котика - " + this.name);
        System.out.println("Он ел - " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("cutlet");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Черныш");
        black.eat("fish");
        black.show();
    }
}