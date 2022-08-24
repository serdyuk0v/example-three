public class Main {
    public static void main(String[] args) {
        byte clientOs = 0;
        short clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложение для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }
}