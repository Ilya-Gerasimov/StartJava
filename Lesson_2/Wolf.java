public class Wolf {
    String name = "Polkan";
    String color = "broun";
    boolean isMale = true;
    float weight = 40.5f;
    int age = 7;

    void move() {
        System.out.println("Волк идет");
    }

    void run() {
        System.out.println("Волк бежит");
    }

    boolean sit() {
        System.out.println("Волк сидит");
        return true;
    }

    void howls() {
        System.out.println("Волк воет");
    }

    void hunts() {
        System.out.println("Волк охотится");
    }
}