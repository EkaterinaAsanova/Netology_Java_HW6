package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatsService;


public class StatServiceTest {

    @Test
    public void getSumAmountMax() {
        StatsService MonthSales = new StatsService();
        long sales[] = {5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L,
                5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L};
        long expected = 60_000_000_000L;
        long actual = MonthSales.getSumAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAverageValueForZeroSales() {
        StatsService MonthSales = new StatsService();
        long sales[] = {0, 1000, 0, 5000, 0, 1000, 0, 10000, 0, 0, 0, 0};
        double expected = 1416.0;
        double actual = MonthSales.getAverageValue(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSalesWithSameSales() {
        StatsService MonthSales = new StatsService();
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 12;
        int actual = MonthSales.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinSalesWithSameSales() {
        StatsService MonthSales = new StatsService();
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 12;
        int actual = MonthSales.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMonthsBelowAverageWithZeroSales() {
        StatsService MonthSales = new StatsService();
        long sales[] = {100, 50, 0, 1000, 4000, 5000, 50, 500, 5000, 0, 40, 5};
        int expected = 9;
        int actual = MonthSales.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMonthsAboveAverageWithSameSales() {
        StatsService MonthSales = new StatsService();
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 0;
        int actual = MonthSales.getMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
