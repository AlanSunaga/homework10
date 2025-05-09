//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void determiningLeapYear(int numberYear) {
        if (numberYear % 4 == 0 && numberYear % 100 != 0 || numberYear % 400 == 0) {
            System.out.println(numberYear + " год — високосный год.");
        } else {
            System.out.println(numberYear + " год — невисокосный год.");
        }
        System.out.println();
    }

    public static void determiningOS(int numberClientOS, int numberClientDeviceYear) {
        if (numberClientOS == 0 && numberClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (numberClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (numberClientOS == 1 && numberClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void determiningDayDelivery(int numberDeliveryDistance) {
        int day;
        if (numberDeliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется дней: " + day);
        } else if (numberDeliveryDistance <= 60) {
            day = 2;
            System.out.println("Потребуется дней: " + day);
        } else if (numberDeliveryDistance <= 100) {
            day = 3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //Задача 1
        //Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        //
        //Эту проверку вы уже реализовывали в задании по условным операторам.
        //Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        //
        //Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение: «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
        //
        //Было
        //
        //System.out.println("Задача 3.");
        //        minYear = 1584;
        //        int year = (int) (Math.random() * (maxYear - minYear + 1) + minYear);
        //
        //        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        //            System.out.println(year + " год является високосным.");
        //        } else {
        //            System.out.println(year + " год не является високосным.");
        //        }
        //        System.out.println();

        System.out.println("Задача 1");
        int minYear = 1584;
        int maxYear = 2025;
        int year = (int) (Math.random() * (maxYear - minYear + 1) + minYear);
        determiningLeapYear(year);
        System.out.println();

        //Задача 2
        //Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
        //Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        //
        //Если устройство старше текущего года, предложите ему установить облегченную версию.
        //
        //Текущий год можно получить таким способом:
        //
        //int currentYear = LocalDate.now().getYear();
        //Или самим задать значение вручную — ввести в переменную числовое значение.
        //
        //В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
        //
        //Было
        //
        //System.out.println("Задача 1.");
        //        int clientOS = (int) (Math.random() * 2);
        //        if (clientOS == 0) {
        //            System.out.println("Установите версию приложения для iOS по ссылке.");
        //        } else {
        //            System.out.println("Установите версию приложения для Android по ссылке.");
        //        }
        //        System.out.println();
        //
        //System.out.println("Задача 2.");
        //
        //        int minYear = 2010;
        //        int maxYear = 2025;
        //
        //        int clientDeviceYear = (int) (Math.random() * (maxYear - minYear + 1) + minYear);
        //
        //        if (clientOS == 0 && clientDeviceYear < 2015) {
        //            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        //        } else if (clientOS == 0) {
        //            System.out.println("Установите версию приложения для iOS по ссылке.");
        //        } else if (clientOS == 1 && clientDeviceYear < 2015) {
        //            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        //        } else {
        //            System.out.println("Установите версию приложения для Android по ссылке.");
        //        }

        System.out.println("Задача 2");

        minYear = 2010;
        int clientOS = (int) (Math.random() * 2);
        int clientDeviceYear = (int) (Math.random() * (maxYear - minYear + 1) + minYear);
        determiningOS(clientOS, clientDeviceYear);
        System.out.println();

        //Задача 3
        //Возвращаемся к задаче на расчет дней доставки банковской карты.
        //Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        //
        //Было
        //
        //System.out.println("Задача 4.");
        //
        //        int deliveryDistance = (int) (Math.random() * 110);
        //        int day;
        //        if (deliveryDistance <= 20) {
        //            day = 1;
        //            System.out.println("Потребуется дней: " + day);
        //        } else if (deliveryDistance <= 60) {
        //            day = 2;
        //            System.out.println("Потребуется дней: " + day);
        //        } else if (deliveryDistance <= 100) {
        //            day = 3;
        //            System.out.println("Потребуется дней: " + day);
        //        } else {
        //            System.out.println("Свыше 100 км доставки нет");
        //        }
        //        System.out.println();

        System.out.println("Задача 3");

        int deliveryDistance = (int) (Math.random() * 110);
        determiningDayDelivery(deliveryDistance);
        System.out.println();
    }
}