public class Cycle1 {
    public static void main(String[] args) {
        int counter;

        for (counter = 0; counter <= 20; counter++) {
            System.out.println(counter);
        }

        counter = 6;
        while (counter >=-6 && counter <= 6) {
            System.out.println(counter);
            counter -= 2;
        }

        counter = 10; 
        int sum = 0;
        do {
            if (counter % 2 != 0) {
                sum += counter;
            }
            counter++;
        } while (counter >= 10 && counter <= 20);
        System.out.println(sum);
    }
}