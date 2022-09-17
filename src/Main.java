public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
    int clientOS = 0;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите полную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS ==1) {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        }else{
            System.out.println(year + "год не является високосным");
        }
        System.out.println("Задание 4.");
        int deliveryDistance = 130;
        int oneDays = 1;
        int twoDays = 2;
        int threeDays = 3;
        int fourDays = 4;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + oneDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + twoDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + threeDays);
        } else {
            System.out.println("Потребуется дней " + fourDays + " или больше");
        }
        System.out.println("Задание 5.");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        }





    }
}