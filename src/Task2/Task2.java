package Task2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int xc = 0, yc = 0, r = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        String fileName = "C:/Users/Евгений/Desktop/По java/input.txt";
        String fileName2 = "C:/Users/Евгений/Desktop/По java/input2.txt";
        File file = new File(fileName);
        File file2 = new File(fileName2);
        try {
            Scanner inputCentr = new Scanner(file);
            while (inputCentr.hasNextInt()) {
                xc = inputCentr.nextInt();
                yc = inputCentr.nextInt();
                r = inputCentr.nextInt();
            }

            Scanner inputPoint = new Scanner(file2);
            while (inputPoint.hasNextInt()) {
                x1 = inputPoint.nextInt();
                y1 = inputPoint.nextInt();
                x2 = inputPoint.nextInt();
                y2 = inputPoint.nextInt();
                x3 = inputPoint.nextInt();
                y3 = inputPoint.nextInt();
            }
            inputCentr.close();
            inputPoint.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла ");
        }
        double result1 =  Math.pow((xc - x1), 2) + Math.pow((yc - y1), 2);
        double result2 = Math.pow((xc - x2), 2) + Math.pow((yc - y2), 2);
        double result3 = Math.pow((xc - x3), 2) + Math.pow((yc - y3), 2);
        if (result1 < (r * r)){
            result1 = 1;
        }
        if (result1 > (r * r)){
            result1 = 2;
        }
        if (result1 == (r * r)){
            result1 = 0;
        }
        if (result2 < (r * r)){
            result2= 1;
        }
        if (result2 > (r * r)){
            result2 = 2;
        }
        if (result2 == (r * r)){
            result2 = 0;
        }
        if (result3 < (r * r)){
            result3 = 1;
        }
        if (result3 > (r * r)){
            result3 = 2;
        }
        if (result3 == (r * r)){
            result3 = 0;
        }
        System.out.println((int) result1);
        System.out.println((int)result2);
        System.out.println((int)result3);
    }
}