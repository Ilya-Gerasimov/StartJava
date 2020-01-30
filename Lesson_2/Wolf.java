public class Wolf {
    private String name = "Полкан";
    private String color = "серого";
    private boolean isMale = true;
    private float weight = 40.5f;
    private int age = 7;

    public String getName() {
        return name;
    }

    void setName(String name) {
        if(name == "") {
            System.out.println("Пустая строка!");
        } else {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        if(color == "") {
            System.out.println("Пустая строка!");
        } else {
            this.color = color;
        }
    }

    public boolean isMale() {
        return isMale;
    }

    //Вот со следующим я долго думал. Если по умолчанию значение true то при вызове всегда будет true
    //и только при смене на false (при задании наших параметров) надо изменять переменную (чтобы получить
    //результат). Правильно? Мы же в объект не можем внести постоянные изменения.
    void setMale(boolean isMale) {
        if(!isMale) {
            this.isMale = false;
        }
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        if(weight <= 0) {
            System.out.println("Вес волка не может быть отрицательным!");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст!");
        } else {
            this.age = age;
        }
    }

    public void move() {
        System.out.println("Волк идет");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public boolean sit() {
        System.out.println("Волк сидит");
        return true;
    }

    public void howls() {
        System.out.println("Волк воет");
    }

    public void hunts() {
        System.out.println("Волк охотится");
    }
}