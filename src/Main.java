import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int clientOS = -1;
        if (clientOS <= 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
        if(clientOS >=1)
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание №2");
        int clientOS2 = 1;
        int classClient = 2020;
        if (clientOS2 == 1) {
            if (classClient < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (classClient < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задание №3");
        int year = 2020;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if(deliveryDistance > 20) {
            deliveryDay++;
        }
        if(deliveryDistance > 60) {
            deliveryDay++;
            System.out.println(deliveryDay + " дня потребуется");
        }
        System.out.println("Задача №5");
        int monthNumber = 14;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Весна");
                break;
            default:
                System.out.println("Некорректный месяц " + monthNumber);
                        }
    }
}