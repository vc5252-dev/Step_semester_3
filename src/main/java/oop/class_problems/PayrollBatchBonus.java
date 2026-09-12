class PayrollBatchBonus {
    String employeeId;
    double salary;

    PayrollBatchBonus(String employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary += salary;
    }

    void printSalary() {
        System.out.println(employeeId + " | Final Salary: Rs " + salary);
    }

    public static void main(String[] args) {
        String[] ids = {"E-101", "E-102", "E-103", "E-104"};
        double[] salaries = {40000, 55000, 62000, 48000};

        for (int i = 0; i < ids.length; i++) {
            PayrollBatchBonus employee = new PayrollBatchBonus(ids[i], salaries[i]);
            employee.raiseSalary(5000);
            employee.printSalary();
        }
    }
}
