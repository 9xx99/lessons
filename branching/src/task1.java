public class task1 {
    public static void main(String[] args) {
        int res = 99;

        if (res >= 1 && res < 26) {
            System.out.println("Плохо");
        } else if (res >= 26 && res < 50) {
            System.out.println("Ниже среднего");
        } else if (res >= 50 && res < 76) {
            System.out.println("Выше среднего");
        } else if (res >= 76 && res <=100) {
            System.out.println("Отлично");
        } else if (res < 1 && res > 100) {
            System.out.println("Ошибка");
        }
    }
}
