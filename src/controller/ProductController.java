package controller;

import model.Product;
import view.SalesView;
import utils.Rounder;

public class ProductController {

    private final Product model;
    private final SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getInputs();

        double income = model.calculateIncome(1, 4.7);
        double tax = model.calculateTax(income);
        double netIncome = model.calculateNetIncome(income, tax);

        String roundedIncome = Rounder.round(income);
        String roundedTax = Rounder.round(tax);
        String roundedNetIncome = Rounder.round(netIncome);

        String output = "Наименование товара: " + model.getName() + "\n" +
                "Общий доход (грн.): " + roundedIncome + "\n" +
                "Сумма налога (грн.): " + roundedTax + "\n" +
                "Чистый доход (грн.): " + roundedNetIncome;

        view.getOutput(output);
        int quantity = model.getQuantity();
        double price = model.getPrice();

        System.out.println("Количество товара: " + quantity);
        System.out.println("Цена товара: " + price);
    }
    }

