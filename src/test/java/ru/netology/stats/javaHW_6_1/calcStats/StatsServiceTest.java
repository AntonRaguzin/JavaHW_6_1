package ru.netology.stats.javaHW_6_1.calcStats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 6;
        int actualMonth = service.getMaxSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAllMonthSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllMonthAmount = 180;
        int actualAllMonthAmount = service.getAllMonthSalesAmount(sales);

        Assertions.assertEquals(expectedAllMonthAmount, actualAllMonthAmount);
    }

    @Test
    public void shouldFindAverageMonthlySalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageMonthlyAmount = 15;
        int actualAverageMonthlyAmount = service.getAverageMonthlySalesAmount(sales);

        Assertions.assertEquals(expectedAverageMonthlyAmount, actualAverageMonthlyAmount);
    }

    @Test
    public void shouldFindMonthQuantitySalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthQuantity = 5;
        int actualMonthQuantity = service.getQuantityMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonthQuantity, actualMonthQuantity);
    }

    @Test
    public void shouldFindMonthQuantitySalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthQuantity = 5;
        int actualMonthQuantity = service.getQuantityMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonthQuantity, actualMonthQuantity);
    }
}
