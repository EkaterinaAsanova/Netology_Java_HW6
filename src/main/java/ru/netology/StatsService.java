package ru.netology;

public class StatsService {
    public long getSumAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double getAverageValue(long[] sales) {
        long sum = 0;
        sum = getSumAmount(sales);

        return sum / (sales.length);
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с максимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsBelowAverage(long[] sales) {
     double Avg = 0;
      int count = 0;
      Avg = getAverageValue(sales);
     for (int i = 0; i < sales.length; i++) {
          if (sales[i] < Avg) {
             count++;
         }
     }
     return count;
   }

    public int getMonthsAboveAverage(long[] sales) {
        double Avg = 0;
        int count = 0;
        Avg = getAverageValue(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > Avg) {
                count++;
            }
        }
        return count;
    }
}