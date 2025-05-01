package Task4;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception{
        int i = 0;
        int[] array = new int[4];
        File file = new File("C:/Users/Евгений/Desktop/По java/input.txt");
        Scanner input  = new Scanner(file);
        while (input.hasNextInt()){
              array[i] = input.nextInt();
              i++;
        }

        int mid = Arrays.stream(array).sum() / array.length;
        int res = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] < mid) res += mid - array[j];
            if (array[j] > mid) res += array[j] - mid;
        }
        System.out.println(res);

    }
}