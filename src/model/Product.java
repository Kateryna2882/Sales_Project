package model;

import base.Income;
import base.Fiscal;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    private static final double TAX_RATE = 0.05;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateIncome(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double calculateNetIncome(double income, double tax) {
        return income - tax;
    }

    @Override
    public double calculateTax(double income) {
        return income * TAX_RATE;
    }
}
