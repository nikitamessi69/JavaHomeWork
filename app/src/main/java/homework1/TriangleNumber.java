//Вычислить n-ое треугольного число (сумма чисел от 1 до n).

package homework1;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int triangleNumber = calculateTriangleNumber(n);
            System.out.println("n-ое треугольное число: " + triangleNumber);
        }
    }

    public static int calculateTriangleNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
