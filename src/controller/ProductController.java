package controller;

import model.Product;

import view.SalesView;


// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        String productName = model.getName();
        // 2) вызов методов расчетов доходов и налога;
        double income = model.calculateIncome();
        double tax = model.calculateTax(income);
        double netIncome = model.calculateNetIncome(income, tax);
        // 3) округление расчетных значений;
        // 3. Округление расчетных значений
        String roundedIncome = Rounder.round(income);
        String roundedTax = Rounder.round(tax);
        String roundedNetIncome = Rounder.round(netIncome);

        // 4. Вывод расчетов по заданному формату
        String output = "Наименование товара: " + productName + "\n" +
                "Общий доход (грн.): " + roundedIncome + "\n" +
                "Сумма налога (грн.): " + roundedTax + "\n" +
                "Чистый доход (грн.): " + roundedNetIncome;

        view.getOutput(output);
    }
}
