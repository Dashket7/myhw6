package ru.netology.myhw6.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test

    public void shouldFinedAmountSales () {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesAmount(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldFinedAverageSalesAmount () {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }
   @Test
    public void shouldFindMinMonthSales () {
       StatsService service = new StatsService();
       long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       long expected = 9;
       long actual = service.minSales(sales);
       Assertions.assertEquals(expected,actual);
   }
@Test
    public void shouldFindMaxMonthSales () {
    StatsService service = new StatsService();
    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 8;
    int actual = service.maxSales(sales);
    Assertions.assertEquals(expected,actual);
}
}
