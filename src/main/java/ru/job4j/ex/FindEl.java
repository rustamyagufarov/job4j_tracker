package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found.");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = new String[] {"test1", "test2", "test3"};
        try {
            int index = indexOf(array, "test");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}