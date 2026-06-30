package Pillers_java.Inheritance;

public class UniversityDriver {
        public static void main(String[] args) {
                Department department = new Department(
                                "SPPU",
                                "Dr. Kulkarni",
                                250,
                                "Pune",
                                "UNI101",
                                "Dr. Patil",
                                "COL501",
                                "A++",
                                12,
                                50,
                                "Computer Science",
                                35,
                                800);

                department.displayDepartment();
        }
}
