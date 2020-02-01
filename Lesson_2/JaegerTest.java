public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);

        System.out.println("Робот " + gipsyDanger.getModelName() + " серии " + gipsyDanger.getMark() + " производства "
            + gipsyDanger.getOrigin() + " высотой " + gipsyDanger.getHeight() + " метров, весом " + gipsyDanger.getWeight() +
            " тонн имеет скорость передвижения " + gipsyDanger.getSpeed() + " силу " + gipsyDanger.getStrenght() +
            " и броню " + gipsyDanger.getArmor());
        gipsyDanger.drift();
        gipsyDanger.useVortexCannon();

        Jaeger chernoAlfa = new Jaeger("Cherno Alfa", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);

        System.out.println("Робот " + chernoAlfa.getModelName() + " серии " + chernoAlfa.getMark() + " производства "
            + chernoAlfa.getOrigin() + " высотой " + chernoAlfa.getHeight() + " метров, весом " + chernoAlfa.getWeight() +
            " тонн имеет скорость передвижения " + chernoAlfa.getSpeed() + " силу " + chernoAlfa.getStrenght() +
            " и броню " + chernoAlfa.getArmor());
        gipsyDanger.move();
        System.out.println("В пределах сканирования врага " + gipsyDanger.scanKaiju());
    }
}