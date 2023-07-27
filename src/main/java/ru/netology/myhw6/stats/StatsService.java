package ru.netology.myhw6.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int sum = salesAmount(sales);

        return sum / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int counterBelowMonths = 0; //количество месяцев с минимальными породажами
        int salesAmount = averageSalesAmount(sales); //средние продажи
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < salesAmount) {
                counterBelowMonths++;
            }
        }
        return counterBelowMonths;
    }

    public int salesAboveAverage(int[] sales) {
        int counterAboveMonths = 0;
        for (int month = 0; month < sales.length; month++) {
            int salesAmount = averageSalesAmount(sales);
            if (sales[month] > salesAmount) {
                counterAboveMonths++;

            }
        }
        return counterAboveMonths;
    }
}












