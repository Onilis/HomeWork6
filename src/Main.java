public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();


        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();


        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();


        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        int age;
        for (age = 1904; age <= 2096; age += 4) {
            System.out.println(age);
        }
        System.out.println();


        int number;
        for (number = 7; number <= 98; number += 7) {
            System.out.println(number);
        }
        System.out.println();

        for (number = 1; number <= 512; number *= 2) {
            System.out.println(number);
        }
        System.out.println();


        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        int salary1 = 29000;
        int totalAmount = 0;
        double interestRate = 0.01;
        for (int i = 1; i <= 12; i++) {
            totalAmount += salary1;
            totalAmount += totalAmount * interestRate;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalAmount + " рублей");
        }
        System.out.println();

        int num = 2;
        int limit = 10;
        for (int i = 1; i <= limit; i++) {
            int result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}