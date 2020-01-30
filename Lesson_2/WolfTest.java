public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfPolkan = new Wolf();
        wolfPolkan.setName("Белка");
        wolfPolkan.setAge(5);
        wolfPolkan.setWeight(15.6f);
        wolfPolkan.setColor("бурого");
        wolfPolkan.setMale(false);

        if(wolfPolkan.isMale()) {
            System.out.println("Волк мужского пола.");
            System.out.println("Волк " + wolfPolkan.getName() + " " + wolfPolkan.getColor() + " окраса.");
            System.out.println("Его возраст " + wolfPolkan.getAge() + " лет, вес " + wolfPolkan.getWeight() + " кг.");
        } else {
            System.out.println("Волк оказался женского пола.");
            System.out.println("Волчица " + wolfPolkan.getName() + " " + wolfPolkan.getColor() + " окраса.");
            System.out.println("Её возраст " + wolfPolkan.getAge() + " лет, вес " + wolfPolkan.getWeight() + " кг.");
        }

    }
}