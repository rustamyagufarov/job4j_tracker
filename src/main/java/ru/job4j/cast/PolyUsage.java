package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{airplane, bus, train};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}
