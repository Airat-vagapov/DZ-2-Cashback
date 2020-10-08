public class Main {
    public static void main(String[] args) {

//      Задаем расходы по каждой категории
        int expensesRegular = 15_145_32;
        int expensesIncreased = 3_213_53;
        int expensesSpecialOffer = 253_02;

//      Задаем процены кэшбека по каждой категории
        int cashbackPercentRegular = 1;
        int cashbackPercentIncreased = 5;
        int cashbackPercentSpecialOffer = 30;

//      Расчет суммы кешбека по каждой категории
        int cashbackRegular = expensesRegular * cashbackPercentRegular / 100;
        int cashbackIncreased = expensesIncreased * cashbackPercentIncreased / 100;
        int cashbackSpecialOffer = expensesSpecialOffer * cashbackPercentSpecialOffer /100;

//      Вывод суммы кэшебка по каждой категории
//        System.out.println(cashbackRegular);
//        System.out.println(cashbackIncreased);
//        System.out.println(cashbackSpecialOffer);

//      Расчет общей суммы кэшбека
        int cashbackSum = cashbackRegular + cashbackIncreased + cashbackSpecialOffer;

//      Условие по ограничению суммы кэшбека
        int limit = 3_000_00;
        if (cashbackSum > limit) {
            cashbackSum = limit;
        }

//      Вывод суммы кэшбека
        System.out.println(cashbackSum);

    }
}
