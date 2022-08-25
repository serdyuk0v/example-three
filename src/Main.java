public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки");
        } else {
            System.out.println("Потребуется помощь специалиста логистики");
        }
    }
}