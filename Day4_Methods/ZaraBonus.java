// ZaraBonus.java

public class ZaraBonus {
    static double[][] employeeData = new double[10][2];
    static double[][] updatedData = new double[10][3];

    public static void main(String[] args) {
        generateEmployeeData();
        calculateBonusAndNewSalary();
        displaySalarySummary();
    }

    static void generateEmployeeData() {
        for (int i = 0; i < 10; i++) {
            double salary = 10000 + Math.random() * 90000;
            int years = (int) (Math.random() * 11);
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }
    }

    static void calculateBonusAndNewSalary() {
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
    }

    static void displaySalarySummary() {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "ID", "Old Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < 10; i++) {
            double oldSal = updatedData[i][0];
            double bonus = updatedData[i][1];
            double newSal = updatedData[i][2];
            int years = (int) employeeData[i][1];
            System.out.printf("%-5d %-10.2f %-10d %-10.2f %-10.2f\n", i+1, oldSal, years, bonus, newSal);
            totalOld += oldSal;
            totalNew += newSal;
            totalBonus += bonus;
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus Paid: %.2f\n",
                totalOld, totalNew, totalBonus);
    }
}
