// Реализовать простой калькулятор.

package homework1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Выберите действие (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            int result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка! неправильное действие.");
                    return;
            }

            System.out.println("Ответ =  " + result);
        }
    }
}
