import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}