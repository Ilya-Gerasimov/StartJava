public class Variable {
    public static void main(String[] args) {
        byte numberCores = 2;
        short frequency = 2100;
        int numberComp = 1;
        long time = 1580140443;
        float pi = 3.141592f;
        double piBig = 3.141592653589;
        char symbol = 'W';
        boolean isTrue = true;

        System.out.println("На компьютере установлен " + numberCores + "-ядерный процессор с тактовой частотой " + frequency + " Мегагерц");
        System.out.println("Компьютер у меня " + numberComp);
        System.out.println("Время начала выполнения задания " + time + " (UNIX время)");
        System.out.println("Число пи равно " + pi + " а точнее " + piBig);
        System.out.println("Я задумал букву " + symbol + " и это " + isTrue);
    }
}