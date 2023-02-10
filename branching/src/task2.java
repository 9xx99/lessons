public class task2 {

    public static void main(String[] args) {
        int moneyPerYear = 1488228;
        int nalog;
        String industry = "Health";
        switch (industry) {
            case  ("Bank"):
                if(moneyPerYear<250000){
                    nalog = moneyPerYear / 100 * 10;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 10 процентов");
                }
                if(moneyPerYear >= 250000 && moneyPerYear <= 499999){
                    nalog = moneyPerYear / 100 * 15;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 15 процентов");
                }
                if(moneyPerYear>=500000){
                    nalog = moneyPerYear / 100 * 18;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 18 процентов");
                }
                break;
            case  ("Health"):
                if(moneyPerYear<400000){
                    nalog = moneyPerYear / 100 * 7;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 7 процентов");
                }
                if(moneyPerYear >= 400000 && moneyPerYear <= 899999){
                    nalog = moneyPerYear / 100 * 12;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 12 процентов");
                }
                if(moneyPerYear>=900000){
                    nalog = moneyPerYear / 100 * 15;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 15 процентов");
                }
                break;
            case  ("Transport"):
                if(moneyPerYear<100000){
                    nalog = moneyPerYear / 100 * 9;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 9 процентов");
                }
                if(moneyPerYear >= 100000 && moneyPerYear < 299999){
                    nalog = moneyPerYear / 100 * 13;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 13 процентов");
                }
                if(moneyPerYear>=300000){
                    nalog = moneyPerYear / 100 * 17;
                    System.out.println("Налог на сумму " + moneyPerYear + " для отрасли " + industry + " составляет " + nalog + ". Это составляет 17 процентов");
                }
                break;
            default:
                System.out.println("Данной отрасли не существует");
                break;
        }
    }
}