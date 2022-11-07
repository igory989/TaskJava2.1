public class Main {
    public static void main(String[] args) {
        float Price = 1000; // стоимость билета
        int milePrice = 20; // рублей для одной бонусной мили
        int milesEarned = (int) Price / milePrice;
        System.out.println((milesEarned) + " Заработанно миль");
    }

}