import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int first, second, res = 1;
        char sign;

        Scanner in = new Scanner(System.in); 
        
        do{
            System.out.print("enter the first figure: ");
            first = in.nextInt();
        }while(first <=0 );

        do{
            System.out.print("enter a sign + - * / % or ^: ");
            String b = in.next();
            sign = b.charAt(0);

        }while(sign != '+' && sign != '-' && sign != '*'
                && sign != '/' && sign != '%' && sign != '^');

        do{
            System.out.print("enter the second figure: ");
            second = in.nextInt();
        }while (second <= 0);

        if (sign == '+') {
            res = first + second;
        } else if (sign == '-') {
            res = first - second;
        } else if (sign == '*') {
            res = first * second;
        } else if (sign == '/') {
            res = first / second;
        } else if (sign == '%') {
            res = first % second;
        } else {
            for (int i = 1; i <= second; i++) {
                res *= first;
            }
        }
        System.out.println("Result: " + res);
    }
}