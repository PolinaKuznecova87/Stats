package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {


    public int getSalesAmount(int[] sales) {


        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];


        }
        return sum;
    }


    public int getAvarageSalesAmount(int[] avarage) {


        int avarageSales = getSalesAmount(avarage);
        return avarageSales;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;


        }
        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int getMinSalesAvarage(int[] sales) {

        int conter = 0;

        int averageSale = getSalesAmount(sales) / 12;
        for (int sale : sales) {


            if (sale < averageSale) {
                conter++;
            }

        }
        return conter;
    }

    public int getMaxSalesAvarage(int[] sales) {

        int conter = 0;

        int averageSale = getSalesAmount(sales) / 12;
        for (int sale : sales) {


            if (sale > averageSale) {
                conter++;
            }

        }
        return conter;
    }

}






