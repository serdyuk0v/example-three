public class Main {
    public static void main(String[] args) {
        int age = 19;
        int salary = 58_000;
        if (age >= 23 && salary >= 50_000) {
            double credit = (salary * 3) * 1.2;
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (int) credit + " рублей!");
        } else if (age >= 23 && salary >= 80_000) {
            double credit = (salary * 3) * 1.5;
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (int) credit + " рублей!");
        } else if (age < 23 && salary >= 50_000) {
            double credit = (salary * 2) * 1.2;
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (int) credit + " рублей!");
        } else if (age < 23 && salary >= 80_000) {
            double credit = (salary * 3) * 1.5;
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (int) credit + " рублей!");
        } else {
            System.out.println("Извините, вам отказано в кредите");
        }

    }
}