public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long sum = 1100;
        long bonus;
        if (sum > 100) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        long total = balance + sum + bonus;
        System.out.println("Общая сумма: " + total);
    }
}
