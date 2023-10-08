package org.example;
class CalculatorLogic implements Operations {
    char resOperation;
    public Operations operation;
    public Operations getOper(char op) {
        this.resOperation = op;
        switch (resOperation) {
            case '+': {
                operation = new Addition();
                break;
            }
            case '-': {
                operation = new Subtraction();
                break;
            }
            case '*': {
                operation = new Multiply();
                break;
            }
            case '/': {
                operation = new Division();
                break;
            }
            default:
        }
        return operation;
    }

    @Override
    public double exec(double first_value, double second_value) {
        return 0;
    }
}

