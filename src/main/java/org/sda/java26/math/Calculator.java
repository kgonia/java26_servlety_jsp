package org.sda.java26.math;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<String> operations;

    public Calculator() {
        this.operations = new ArrayList<>();
    }

    public long add(int num1, int num2) {
        long result = num1 + num2;
        addOperationInternal("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public long multiply(int num1, int num2) {
        long result = num1 * num2;
        addOperationInternal("multiplied " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public long subtract(int num1, int num2) {
        long result = num1 - num2;
        addOperationInternal("subtracted " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public double divide(int num1, int num2) {
        double result = (double) num1 / (double) num2;
        addOperationInternal("divided " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    protected void addOperationInternal(String toAdd) {
        this.operations.add(toAdd);
    }

    public List<String> getOperations() {
        return this.operations;
    }

    public void printOperations() {
        for (String s : this.operations) {
            System.out.println(s);
        }
    }

    public void clearOperations() {
        this.operations.clear();
    }
}
