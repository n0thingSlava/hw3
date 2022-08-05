import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int clientOS = 1; // 1=Andorid ; 0= iOS
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
            System.out.println("Задание №2");
            int clientAndorid = 1; //1= Да; 0=Нет
            int classClient = 2014;
            if (clientAndorid == 0 && classClient <= 2014) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if(clientAndorid == 0 && classClient >=2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientAndorid == 1 && classClient <= 2014) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    } else if(clientAndorid == 1 && classClient >= 2014) {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                System.out.println("Задание №3");
                int year = 2020;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является высокосным");
                } else {
                    System.out.println(year + " год не является высокосным");
                }
                System.out.println("Задание №4");
                int deliveryDistance = 100;
                int deliveryDay = 1;
                if(deliveryDistance <= 20){
                    System.out.println("Доставка займет 1 день");
                }
                if (deliveryDistance > 20 && deliveryDistance <60) {
                    System.out.println("Доставка займет 2 деня");
                }
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Доставка займет 3 день");
                }
                System.out.println("Задача №5");
                int monthNumber = 14;
                switch (monthNumber) {
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
