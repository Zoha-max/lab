package assignment;

public class CalculatorSimulator {
    public static void main(String[] args) {
        String empName = null;
        try {
            empName = "Ron";
            double taxAmount = TaxCalculator.calculateTax(empName, false, 34000);
            System.out.println(empName + ": Tax amount for " + empName + " is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(empName + ": " + e.getMessage());
        }

        empName = "Tim";
        try {
            double taxAmount = TaxCalculator.calculateTax(empName, true, 1000);
            System.out.println(empName + ": Tax amount for " + empName + " is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(empName + ": " + e.getMessage());
        }

        empName = "Jack";
        try {
            double taxAmount = TaxCalculator.calculateTax(empName, true, 55000);
            System.out.println(empName + ": Tax amount for " + empName + " is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(empName + ": " + e.getMessage());
        }

        empName = "";
        try {
            double taxAmount = TaxCalculator.calculateTax(empName, true, 30000);
            System.out.println(empName + ": Tax amount for " + empName + " is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(empName + ": " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(empName + ": " + e.getMessage());
        }
    }
}
