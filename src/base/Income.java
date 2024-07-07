package base;

public interface Income {
    double calculateIncome(int quantity, double price);

    double calculateNetIncome(double income, double tax);
}
