public class Variable {	
    public static void main(String[] args) {
        byte a = 2;
        short b = 2100;
        int c = 1;
        long d = 1580140443;
        float pi = 3.141592f;
        double piBig = 3.141592653589;
        char ch = 'W';
        boolean bol = true;

        System.out.println("На компьютере установлен " + a + "-ядерный процессор с тактовой частотой " + b + " Мегагерц");
        System.out.println("Компьютер у меня " + c);
        System.out.println("Время начала выполнения задания " + d + " (UNIX время)");
        System.out.println("Число пи равно " + pi + " а точнее " + piBig);
        System.out.println("Я задумал букву " + ch + " и это " + bol);
    }
}