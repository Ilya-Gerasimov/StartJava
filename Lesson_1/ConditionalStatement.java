public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 49;

        if (age > 20) {
            System.out.println("Вы уже можете посещать бар!");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Вы скорее всего мужчина!");
        }

        if (!isMale) {
            System.out.println("Вы скорее всего женщина!");
        }

        int height = 172;
        if (height < 180) {
            System.out.println("Вы ниже 180 см.");
        } else {
            System.out.println("Вы выше или равны 180 см.");
        }

        char firstLetterName = 'I';
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на букву М");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на букву I");
        } else {
            System.out.println("Ваше имя начинается на другую букву");
        }
    }
}