/**
 * Java 1. Homework 1
 * 
 * @autor Senchenko T.S.
 * @version 25.03.2022
 */
class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = 15;
        System.out.println("The sum is " + (a + b >= 0? "positive" : "negative"));
    }

    static void printColor() {
        int value = 58;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 15;
        int b = 25;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}