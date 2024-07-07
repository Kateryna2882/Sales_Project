package view;

import model.Product;
import utils.Validator;

import java.util.Scanner;

public class SalesView {

    private final Product product;

    public SalesView(Product product) {
        this.product = product;
    }

    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        System.out.println("Введите наименование товара:");
        product.setName(validator.validateName(scanner));

        System.out.println("Введите количество товара:");
        product.setQuantity(validator.validateQuantityInput(scanner));

        System.out.println("Введите цену товара:");
        product.setPrice(validator.validatePriceInput(scanner));
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
