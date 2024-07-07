import model.Product;
import view.SalesView;
import controller.ProductController;

public class App {

    public static void main(String[] args) {

        Product product = new Product("", 0, 0.0);
        SalesView view = new SalesView(product);
        ProductController controller = new ProductController(product, view);

        controller.runApp();
    }
}
