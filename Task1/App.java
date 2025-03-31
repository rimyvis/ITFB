import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        newArray();
        sumArray();
        minArray();
        maxArray();
    }

    static int array[];

    static void newArray() {
        Random random = new Random();
        array = new int[random.nextInt(5) + 6];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(array));
    }

    static void sumArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("SumArray = " + sum);
    }

    static void minArray() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);
    }

    static void maxArray() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);
    }
}