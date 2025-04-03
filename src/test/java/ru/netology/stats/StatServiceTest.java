package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatsService;


public class StatServiceTest {
    StatsService MonthSales = new StatsService();

    @Test

    public void getSumAmountMax() {

        long sales[] = {5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L,
                5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L, 5000000000L};
        long expected = 60_000_000_000L;
        long actual = MonthSales.getSumAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getAverageValueForZeroSales() {
        long sales[] = {0, 1000, 0, 5000, 0, 1000, 0, 10000, 0, 0, 0, 0};
        double expected = 1416.0;
        double actual = MonthSales.getAverageValue(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getMaxSalesWithSameSales() {
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 12;
        int actual = MonthSales.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getMinSalesWithSameSales() {
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 0;
        int actual = MonthSales.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMonthsBelowAverageWithSameSales() {
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 0;
        int actual = MonthSales.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMonthsAboreAverageWithSameSales() {
        long sales[] = {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
        int expected = 0;
        int actual = MonthSales.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
