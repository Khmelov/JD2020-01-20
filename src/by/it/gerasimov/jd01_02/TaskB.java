package by.it.gerasimov.jd01_02;

import java.util.Scanner;

class TaskB {

    static void step1() {
        int n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }

    static void step3(double a, double b, double c) {
        double d = b*b - 4*a*c;
        if (d < 0) {
            System.out.println("корней нет");
        }
        else {
            double x1 = (- b + Math.sqrt(d)) / (2*a);
            double x2 = (- b - Math.sqrt(d)) / (2*a);
            System.out.print(x1);
            if (x1 != x2) {
                System.out.println(" " + x2);
            }
        }
    }

    public static void main(String[] args) {
        step1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        step2(n);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        step3(a, b, c);
    }
}
