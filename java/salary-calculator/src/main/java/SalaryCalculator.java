public class SalaryCalculator {

    private static final int BASE_SALARY = 1000;
    private static final int MAX_SALARY = 2000;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (BASE_SALARY * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
        return salary > MAX_SALARY ? MAX_SALARY : salary;
    } 
}
