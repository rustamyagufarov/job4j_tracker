package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Ягуфаров Рустам Рашидович");
        student.setGroup("МБФ-102");
        student.setEntered(new Date(109, 8, 1));
        System.out.println(student.getFullname());
        System.out.println(student.getGroup());
        System.out.println(student.getEntered());
    }
}
