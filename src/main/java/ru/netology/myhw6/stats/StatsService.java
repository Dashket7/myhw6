package ru.netology.myhw6.stats;

import static com.sun.tools.doclint.Entity.sum;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int calculateSum = salesAmount(sales);

        return calculateSum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = sales [0];
        int month=0;
        for (int sale:sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month=month+1;
        }
            return maxMonth + 1;
        }
    }






