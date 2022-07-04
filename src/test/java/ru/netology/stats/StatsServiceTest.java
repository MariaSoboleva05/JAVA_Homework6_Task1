package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldCountSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumOfSales(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.averageSales(sales);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldFindMinSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldCountSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;
        int actualCount = service.monthsWithSalesBelowAverage(sales);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void shouldCountSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;
        int actualCount = service.monthsWithSalesAboveAverage(sales);

        assertEquals(expectedCount, actualCount);

    }
}
