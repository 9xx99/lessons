import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
            array[i] = input.nextInt();
        for(int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(String.format("Число %d - четное", array[i]));
            } else {
                System.out.println(String.format("Число %d - нечетное", array[i]));
            }
        }
    }
}
