package ru.netology;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        long[] saleAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService MonthSales = new StatsService();
        System.out.println("1. Сумма продаж: " + MonthSales.getSumAmount(saleAmount));
        System.out.println("2. Среднее значение продаж: " + MonthSales.getAverageValue(saleAmount));
        System.out.println("3. Номер месяца в котором был пик продаж: " + MonthSales.getMaxSales(saleAmount));
        System.out.println("4. Номер месяца в котором был минимум продаж: " + MonthSales.getMinSales(saleAmount));
        System.out.println("5. Количество месяцев, в которых продажи были ниже среднего: " +
               MonthSales.getMonthsBelowAverage(saleAmount));
        System.out.println("6. Количество месяцев, в которых продажи были выше среднего: " +
                MonthSales.getMonthsAboveAverage(saleAmount));
    }
}