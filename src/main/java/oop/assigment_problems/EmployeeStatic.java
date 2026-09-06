class EmployeeStatic {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeStatic(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        new EmployeeStatic("Aarav", 50000);
        new EmployeeStatic("Diya", 60000);
        new EmployeeStatic("Rohan", 55000);
        EmployeeStatic.printCompanyInfo();
    }
}
