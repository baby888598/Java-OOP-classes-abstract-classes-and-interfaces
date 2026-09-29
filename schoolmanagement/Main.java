package schoolmanagement;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Fadilat");
        student.setAge(17);
        String studentId = "23/03CMP017";
        System.out.println("==== STUDENT ====");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("StudentId: " + studentId);
        System.out.println("Course: Not assigned");

        System.out.println("Student is ready to write the exam.");

        Teacher teacher = new Teacher();

        teacher.setName("Mr.Michael");
        // Qualification is not set because Teacher does not define setQualification(String).
        teacher.setSubject("Java programming");

        System.out.println("\n===== TEACHER =====");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: Not assigned");
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Experience: Not assigned");

        

        Course course = new Course();

        course.setCourseName("Java Programming");
        course.setCreditUnit(3);

        System.out.println("\n===== COURSE =====");
        System.out.println("Unit Code: Not assigned");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Credit Unit: " + course.getCreditUnit());

    

        Department department = new Department();

        department.setDepartmentName("Computer Science");
        department.setHeadOfDepartment("Dr. Ahmed");

        System.out.println("\n===== DEPARTMENT =====");
        System.out.println("Department: Computer Science");
        System.out.println("Head: " + department.getHeadOfDepartment());

        School school = new School();

        school.setSchoolName("Al-Hikmah University");
        school.setLocation("Ilorin");

        System.out.println("\n===== SCHOOL =====");

        System.out.println("School Name: Al-Hikmah University");
        System.out.println("Location: Ilorin");

    }
}