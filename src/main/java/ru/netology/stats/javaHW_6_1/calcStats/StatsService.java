package ru.netology.stats.javaHW_6_1.calcStats;

public class StatsService {

    public int getMaxSalesMonth(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
//    public int getMinSalesMonth(int[] sales) {
//        int minMonth = 0;
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] < sales[minMonth]) {
//                minMonth = i;
//            }
//        }
//        return minMonth;
//    }

    public int getAllMonthSalesAmount(int[] sales) {

        int monthSalesAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            monthSalesAmount = monthSalesAmount + sales[i];
        }
        return monthSalesAmount;
    }

    public int getAverageMonthlySalesAmount(int[] sales) {

        int monthSalesAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            monthSalesAmount = monthSalesAmount + sales[i];
        }
        return monthSalesAmount / sales.length;
    }

    public int getQuantityMonthSalesBelowAverage(int[] sales) {
        int montQuantity = 0;
        int averageMonthSales = getAverageMonthlySalesAmount(sales);
        for (int salesAmount : sales) {
            if (salesAmount < averageMonthSales) {
                montQuantity = montQuantity + 1;
            }
        }
        return montQuantity;
    }

    public int getQuantityMonthSalesAboveAverage(int[] sales) {
        int montQuantity = 0;
        int averageMonthSales = getAverageMonthlySalesAmount(sales);
        for (int salesAmount : sales) {
            if (salesAmount > averageMonthSales) {
                montQuantity = montQuantity + 1;
            }
        }
        return montQuantity;
    }
}