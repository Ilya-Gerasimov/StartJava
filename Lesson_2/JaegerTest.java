public class JaegerTest {

    public static void main(String[] args) {
        String modelName;
        String mark;
        String origin;
        float height;
        float weight;
        int speed;
        int strenght;
        int armor;

        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1.980f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrenght(8);
        gipsyDanger.setArmor(6);

        System.out.println("Робот " + gipsyDanger.getModelName() + " серии " + gipsyDanger.getMark() + " производства "
            + gipsyDanger.getOrigin() + " высотой " + gipsyDanger.getHeight() + " метров, весом " + gipsyDanger.getWeight() +
            " тонн имеет скорость передвижения " + gipsyDanger.getSpeed() + " силу " + gipsyDanger.getStrenght() +
            " и броню " + gipsyDanger.getArmor());
        gipsyDanger.drift();
        gipsyDanger.useVortexCannon();

        Jaeger chernoAlfa = new Jaeger();
        chernoAlfa.setModelName("Cherno Alfa");
        chernoAlfa.setMark("Mark-1");
        chernoAlfa.setOrigin("Russia");
        chernoAlfa.setHeight(85.34f);
        chernoAlfa.setWeight(2.412f);
        chernoAlfa.setSpeed(3);
        chernoAlfa.setStrenght(10);
        chernoAlfa.setArmor(10);

        System.out.println("Робот " + chernoAlfa.getModelName() + " серии " + chernoAlfa.getMark() + " производства "
            + chernoAlfa.getOrigin() + " высотой " + chernoAlfa.getHeight() + " метров, весом " + chernoAlfa.getWeight() +
            " тонн имеет скорость передвижения " + chernoAlfa.getSpeed() + " силу " + chernoAlfa.getStrenght() +
            " и броню " + chernoAlfa.getArmor());
        gipsyDanger.move();
        System.out.println("В пределах сканирования врага " + gipsyDanger.scanKaiju());
    }
}