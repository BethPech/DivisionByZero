package org.example;

import java.util.Scanner;

public class Calculator {
    CalculatorLogic resultOperation;

    public Calculator(CalculatorLogic resultOperation) {
        this.resultOperation = resultOperation;
    }

    public void exec() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число и нажмите Enter");
            double num1 = scanner.nextDouble();
            System.out.println("Выберите операцию: +, -, *, / и нажмите Enter");
            char operation = scanner.next().trim().charAt(0);
            System.out.println("Введите второе число и нажмите Enter");
            double num2 = scanner.nextDouble();
            Operations op = resultOperation.getOper(operation);
            if (op != null) System.out.println("Ответ: " + op.exec(num1, num2));
            else System.out.println("Error: Не верная операция!");
        } catch (Exception e) {
            System.out.println("Ошибка: Не верное значение!");
        }
    }
}
