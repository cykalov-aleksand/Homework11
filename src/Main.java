import java.time.LocalDate;

class Main {
    public static void checkYear(short year) {
        if (year < 1584) {
            System.out.println("Ошибка ввода года, повторите ввод!!!");
        } else if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void determeneApplicationVersion(short clientDeviceYear, byte clientOs) {
        int currentYear = LocalDate.now().getYear();
        System.out.println("clientOs = " + clientOs + "; clientDeviceYears =" + clientDeviceYear);
        switch (clientOs) {
            case 0:
                if (clientDeviceYear >= 2015 && clientDeviceYear < (short) currentYear) {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015 && clientDeviceYear < (short) currentYear) {
                    System.out.println("Установите версию приложения для ANDROID по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
                }
                break;
        }
    }

    public static String calculateTheDeliveryTime(short deliveryDistance) {
        String message;
        System.out.println("Если расстояние равно " + deliveryDistance + " км.");
        if (deliveryDistance <= 20) {
            byte deliveryDays = 1;
            message = "потребуется дней на доставку: " + deliveryDays;
            return message;
        } else if (deliveryDistance <= 60) {
            byte deliveryDays = 2;
            message = "Потребуется дней на доставку: " + deliveryDays;
            return message;
        } else if (deliveryDistance <= 100) {
            byte deliveryDays = 3;
            message = "Потребуется дней на достаку: " + deliveryDays;
            return message;
        } else {
            message = "Доставки нет";
            return message;
        }
    }

    public static String calculateTheDeliveryTime2(short deliveryDistance) {
        System.out.println("Если расстояние равно " + deliveryDistance + " км.");
        byte deliveryDays = 0;
        String information;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        switch (deliveryDays) {
            case 1:
                information = "потребуется дней на доставку: 1";
                return information;
            case 2:
                information = "потребуется дней на доставку: 2";
                return information;
            case 3:
                information = "потребуется дней на доставку: 3";
                return information;
            default:
                information = "Доставки нет";
                return information;
        }
    }

    public static void main(String[] args) {
        System.out.println("------------------Задание 1---------------------");
        short inputYear = 2021;
        checkYear(inputYear);
        System.out.println("------------------Задание 2---------------------");
        short inputYearRelease = 2023;
        System.out.println("\n---------------------" + inputYearRelease + "г.-----------------");
        byte inputSystem = 1;
        determeneApplicationVersion(inputYearRelease, inputSystem);
        inputSystem = 0;
        determeneApplicationVersion(inputYearRelease, inputSystem);
        inputYearRelease = 2014;
        System.out.println("\n---------------------" + inputYearRelease + "г.-----------------");
        inputSystem = 1;
        determeneApplicationVersion(inputYearRelease, inputSystem);
        inputSystem = 0;
        determeneApplicationVersion(inputYearRelease, inputSystem);
        inputYearRelease = 2024;
        System.out.println("\n---------------------" + inputYearRelease + "г.-----------------");
        inputSystem = 1;
        determeneApplicationVersion(inputYearRelease, inputSystem);
        inputSystem = 0;
        determeneApplicationVersion(inputYearRelease, inputSystem);
        System.out.println("\n------------------Задание 3---------------------");
        System.out.println("Вариант решения без условия switch:");
        short distance = 60;
        System.out.println(calculateTheDeliveryTime(distance));
        System.out.println("\nВариант решения c условием switch:");
        distance = 110;
        System.out.println(calculateTheDeliveryTime2(distance));
    }
}
