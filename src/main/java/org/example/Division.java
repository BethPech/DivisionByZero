package org.example;

class Division implements Operations {
    public double exec(double first_value, double second_value) {
        if (second_value==0) {
            try {
                throw new DivisionByZero();
            } catch (DivisionByZero e) {
                throw new RuntimeException(e);
            }
        }
        return (first_value / second_value);
    }
}
