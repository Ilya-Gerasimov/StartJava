import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Кофе-машина");

       // int moneyAmount = 10;

        Scanner in = new Scanner(System.in);
        System.out.print("Сколько у Вас денег?: ");
        int moneyAmount = in.nextInt();


        int[] drinkPrices = {150, 80, 20};
        String[] drinkNames = {"капучино", "эспрессо", "воду"};
        boolean canBuyAnything = false;
        for(int i = 0; i < 3; i++)
        {
            if(drinkPrices[i] <= moneyAmount)
            {

                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;

            }

        }

        if(canBuyAnything == false) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много :)");
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        System.out.println(formatter.format(date));

//        BufferedImage image = null;
//        System.out.println(image.getWidth() + "x" + image.getHeight());



    }

}
