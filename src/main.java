public class Main {
    public static void Main(String[] args) {
        int amountMoney = 1; //кол-во денег на счету
        int elementaryScore = 100; //начальный счет
        int amountPayment = 1100; //сумма пополнения
        boolean bonus = amountPayment >= 1000;

        int amountBonus; //кол-во бонусов
        if (bonus) {
            amountBonus = amountPayment / 100;
        } else {
            amountBonus = 0;
        }
        int finalScore = elementaryScore + amountPayment + amountBonus; //итоговый счет
        System.out.println(finalScore);
    }
}
