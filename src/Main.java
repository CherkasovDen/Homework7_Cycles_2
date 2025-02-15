//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Задача 1");
        int total = 0;
        int money = 15000;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }


        //Task2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();
        //Task3
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int birthPeople = 17;
        int deadPeople = 8;
        int year = 1;
        while (year <= 10) {
            totalPeople = totalPeople + (totalPeople / 1000) * (birthPeople - deadPeople);
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
            year++;
        }
        //Task4
        System.out.println("Задача 4");
        int totalMoney = 15000;
        int month1 = 1;
        while (totalMoney <= 12_000_000) {
            totalMoney = totalMoney + totalMoney / 100 * 7;
            System.out.println("Месяц " + month1 + " накоплено " + totalMoney);
            month1++;
        }
        //Task5
        System.out.println("Задача 5");
        int totalMoney2 = 15000;
        int month3 = 1;
        while (totalMoney2 <= 12_000_000) {
            totalMoney2 = totalMoney2 + totalMoney2 / 100 * 7;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " накоплено " + totalMoney2);
            }
            month3++;
        }
        //Task6
        System.out.println("Задача 6");
        int totalMoney6 = 15000;
        int month6 = 1;
        int halfOfYear = 1;
        do {
            totalMoney6 = totalMoney6 + totalMoney6 / 100 * 7;
            if (month6 % 6 == 0) {
                System.out.println(halfOfYear + " полугодие накоплено " + totalMoney6);
                halfOfYear++;
            }
            month6++;
        } while (month6 <= 54);
        //Task7
        System.out.println("Задача 7");
        int day = 7;
        for (; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        //Task8
        System.out.println("Залдача 8");
        int nowYear = 2025;
        int beforeYear = nowYear - 200;
        int afterYear = nowYear + 100;
        for (int y = 0; y <= afterYear; y = y + 79) {
            if (y % 79 == 0 && y >= beforeYear) {
                System.out.println(y);
            }

        }
    }
}