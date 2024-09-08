public class Primes {
    public static void main(String[] args) {
        // Перебираем числа от 2 до 100
        for (int i = 2; i <= 100; i++) {
            // Если число простое, выводим его
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int n) {
        // Перебираем числа от 2 до n-1
        for (int i = 2; i < n; i++) {
            // Если число делится на i без остатка, оно не простое
            if (n % i == 0) {
                return false;
            }
        }
        // Если ни одно число не делится без остатка, число простое
        return true;
    }
}