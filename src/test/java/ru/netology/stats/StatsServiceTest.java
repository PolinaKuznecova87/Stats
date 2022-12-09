package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;


        int actualSales = service.getSalesAmount(sales);
        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void shouldAvarageSalesAmount() {
        StatsService service = new StatsService();
        int[] avarage = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int number = 12;

        int expectedAvarage = 15;


        int actualAvarage = service.getSalesAmount(avarage) / number;
        Assertions.assertEquals(expectedAvarage, actualAvarage);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        long actualMonth = service.getMaxSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        long actualMonth = service.getMinSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test
    public void shouldFinMinQuantityMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonth = 5;
        int actualQuantityMonth = service.getMinSalesAvarage(sales);
        Assertions.assertEquals(expectedQuantityMonth, actualQuantityMonth);

    }

    @Test
    public void shouldFinMaxQuantityMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonth = 5;
        int actualQuantityMonth = service.getMaxSalesAvarage(sales);
        Assertions.assertEquals(expectedQuantityMonth, actualQuantityMonth);
    }
}

