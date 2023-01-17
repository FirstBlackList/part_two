public class Main {
    public static void main(String[] args) {

        int initialBalance = 400;
        int depositAmount = 2844;
        int bonus = 0;
        if (depositAmount > 1000) {
            bonus = (initialBalance + depositAmount) / 100;
            System.out.println("Размер бонуса: " + bonus);
        }
        int totalAmount = initialBalance + depositAmount + bonus;
        System.out.println("Ваш баланс с учётом начисленных бонусов: " + totalAmount);
        // variant 2
        //int bonus = (depositAmount > 1000) ? (initialBalance + depositAmount) / 100 : 0;
    }
}