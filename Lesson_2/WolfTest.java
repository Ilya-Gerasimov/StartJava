public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfPolkan = new Wolf();
        wolfPolkan.name = "Bobik";
        System.out.println("Кличка волка " + wolfPolkan.name);
        System.out.println("Возраст волка " + wolfPolkan.age +" лет."+ " Вес волка " + wolfPolkan.weight + " кг.");
        System.out.print("Сейчас ");
        wolfPolkan.run();
        wolfPolkan.hunts();
    }
}