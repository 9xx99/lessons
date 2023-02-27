import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        int b = input.nextInt();
        char[] shifr = str1.toCharArray();
        for (int i = 0; i <= shifr.length-1; i++){
          shifr[i] = (char)(shifr[i] - b);
        }
        String str2 = new String(shifr);
        System.out.println(String.format("Исходное сообщение:" + str1 + ", зашифрованное сообщение:" + str2 + ", шифр:" + b));

    }
}