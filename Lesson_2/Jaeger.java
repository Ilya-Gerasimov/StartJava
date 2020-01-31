public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        if(modelName == "") {
            System.out.println("Пустая строка!");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        if(mark == "") {
            System.out.println("Пустая строка!");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        if(origin == "") {
            System.out.println("Пустая строка!");
        } else {
            this.origin = origin;
        }
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        if(height <= 0) {
            System.out.println("Рост робота не может быть отрицательным!");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        if(weight <= 0) {
            System.out.println("Вес робота не может быть отрицательным!");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        if(speed < 0) {
            System.out.println("Скорость не может быть отрицательной!");
        } else {
            this.speed = speed;
        }
    }

    public int getStrenght() {
        return strenght;
    }

    void setStrenght(int strenght) {
        if(strenght < 0) {
            System.out.println("Сила не может быть отрицательной!");
        } else {
            this.strenght = strenght;
        }
    }

    public int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        if(armor < 0) {
            System.out.println("Показатель брони не может быть отрицательным!");
        } else {
            this.armor = armor;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы сделали нескольо шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
        System.out.println("Вы активировали вооружение");
    }
}