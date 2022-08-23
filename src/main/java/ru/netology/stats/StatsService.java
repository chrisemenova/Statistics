package ru.netology.stats;

public class StatsService {

    public long minSales(long[] sales) { // 4 задание (пример)
        int minMonth = 0;
        int month = 0;               // переменная для индекса(расчета?) рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;   // если выше прибавили 1, то зачем еще и здесь прибавлять??
    }

    public long sumSales(long[] sales) {     // 1
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSalesPerMonth(long[] sales) {    // 2
        long average = sumSales(sales) / sales.length;
        return average;
    }


    public int maxSales(long[] sales) {            // 3
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {       // sales[maxMonth] - продажи в месяце maxMonth
                maxMonth = month;               // sale - продажи в рассматриваемом месяце

            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {          // 5
        int amount = 0;
        for (long sale : sales) {                          //заметка д.себя!Лучше не писать расчеты в циклах,
            if (sale < averageSalesPerMonth(sales)) {       // т.к. это нагрузит прогу
                amount++;                                 // а объявить как переменную (чтоб считал 1 раз, а не трильон)
            }

        }
        return amount;
    }

    public int aboveAverageSales(long[] sales) {        // 6
        int amount = 0;
        long aver = averageSalesPerMonth(sales);
        for (long sale : sales) {
            if (sale > aver) {
                amount++;
            }
        }
        return amount;
    }

}
