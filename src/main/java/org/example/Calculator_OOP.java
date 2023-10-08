package org.example;

public class Calculator_OOP {
        public static void main(String[] args) {
        CalculatorLogic calclogic = new CalculatorLogic();
        Calculator calc = new Calculator(calclogic);
        calc.exec();
    }
}
