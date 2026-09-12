class StudentPortal {
    static String collegeName;
    static int academicYear;
    String studentName;

    static {
        collegeName = "SRM Central College";
        academicYear = 2027;
        System.out.println("College info loaded");
    }

    StudentPortal(String studentName) {
        this.studentName = studentName;
    }

    void printRecord() {
        System.out.println("Student record created: " + studentName);
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        for (String name : names) {
            StudentPortal student = new StudentPortal(name);
            student.printRecord();
        }
    }
}
