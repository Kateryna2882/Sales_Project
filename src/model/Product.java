package model;

import base.Income;
import base.Fiscal;

public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;

    // Налоговая ставка объявлена в виде константы
    private static final double TAX_RATE = 0.05;

    // Конструктор класса
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Обеспечьте доступ к полям модели через getters и setters
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

    // Переопределите методы реализуемых интерфейсов

    // Расчёт дохода от продаж, до уплаты налога.
    @Override
    public double calculateIncome(int quantity, double price) {
        return quantity * price;
    }

    // Перегруженный метод для расчёта дохода без параметров
    public double calculateIncome() {
        return calculateIncome(this.quantity, this.price);
    }

    // Расчёт суммы налога с продаж.
    @Override
    public double calculateTax(double income) {
        return income * TAX_RATE;
    }

    // Расчёт чистого дохода, после уплаты налога.
    @Override
    public double calculateNetIncome(double income, double tax) {
        return income - tax;
    }
}
