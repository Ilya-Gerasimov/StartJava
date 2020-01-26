import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int inFirst = -1, inSecond = -1, res = 1;;
        String inZnak = "p";

        System.out.println("Калькулятор целых положительных чисел");

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);

        //Пока не введем положительное число будем повторять ввод (проверку на то, что число целое так и не сделал)
        while(inFirst<=0){
            System.out.print("Введите первое число: ");
            inFirst = in.nextInt();
        }

        //Пока не введем нужный знак... намучился с сравнением строк...
        while(!inZnak.equals("+") && !inZnak.equals("-") && !inZnak.equals("*")
                && !inZnak.equals("/") && !inZnak.equals("%") && !inZnak.equals("^")){
            System.out.print("Введите знак + - * / % или ^: ");
            inZnak = ch.nextLine();
        }

        while (inSecond <= 0) {
            System.out.print("Введите второе число: ");
            inSecond = in2.nextInt();
        }


        if (inZnak.equals("+")) {
            res = inFirst + inSecond;
        } else if (inZnak.equals("-")) {
            res = inFirst - inSecond;
        } else if (inZnak.equals("*")) {
            res = inFirst * inSecond;
        } else if (inZnak.equals("/")) {
            res = inFirst / inSecond;
        } else if (inZnak.equals("%")) {
            res = inFirst / inSecond;
        } else {
            for (int i = 1; i <= inSecond; i++) {
                res = res * inFirst;
            }
        }

        System.out.println("Result: " + res);//почему-то при компиляции меня отругали за кириллицу именно в этом месте
    }
}
//в итоге компиляция прошла, но программа так и не запустилась в cmd, пишет Could not find or load main class main