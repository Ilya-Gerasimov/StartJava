public class Person {
    String name = "Ilya";
    boolean isMale = true;
    float height = 170.2f, weight = 80.1f;
    int age = 49;

    void move() {
        System.out.println("Вы начали движение");
    }

    void run() {
        System.out.println("Вы побежали");
    }

    boolean sit() {
        System.out.println("Вы сидите");
        return true;
    }

    void speak() {
        System.out.println("Вы говорите");
    }

    void teachJava() {
        System.out.println("Вы начали изучать Java");
    }
}