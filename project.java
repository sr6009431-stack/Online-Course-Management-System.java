
import java.util.Scanner;
class Course {
    private String courseName;
    private String courseId;
    private int duration;

    private Student[] enrolledStudents = new Student[50];
    private int studentCount = 0;

    public Course(String courseName, String courseId, int duration) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.duration = duration;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseId() {
        return courseId;
    }
    public int getDuration() {
        return duration;
    }
    public void addStudent(Student s) {
        enrolledStudents[studentCount] = s;
        studentCount++;
    }
    public void displayStudents() {

        System.out.println("\nCourse: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Duration: " + duration + " Months");
        System.out.println("Enrolled Students:");
        if (studentCount == 0) {
            System.out.println("No students enrolled");
        }
        else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println(
                        (i + 1) + ". "
                                + enrolledStudents[i].getStudentName()
                                + " - Progress: "
                                + enrolledStudents[i].getProgress()
                                + "%");
     }
        }
    }
}
class Student {
    private String studentName;
    private String studentId;
    private int progress;
    private Course enrolledCourse;
    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        progress = 0;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentId() {
        return studentId;
    }
    public int getProgress() {
        return progress;
    }
    public void enroll(Course c) {
        enrolledCourse = c;
        c.addStudent(this);
        System.out.println(
                studentName + " enrolled in "
                        + c.getCourseName());
    }
    public void updateProgress(int percent) {

        if (percent >= 0 && percent <= 100) {
            progress = percent;
        }
        else {
            System.out.println("Invalid progress value");
        }
    }
}
public class project{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course c1 =
                new Course(
                        "Java Programming",
                        "C101",
                        6);
        Course c2 =
                new Course(
                        "Data Structures",
                        "C102",
                        4);
        Course c3 =
                new Course(
                        "Database Management",
                        "C103",
                        5);
        Student[] students = new Student[50];
        int studentCount = 0;
        int choice;
        do {
            System.out.println(
                    "\n===== ONLINE COURSE MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Student");
            System.out.println("2. Enroll Student");
            System.out.println("3. Update Progress");
            System.out.println("4. Display Courses");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    students[studentCount] =
                            new Student(sname, sid);
                    studentCount++;

                    System.out.println(
                            "Student registered successfully");
                    break;
                case 2:

                    if (studentCount == 0) {

                        System.out.println(
                                "No students available");
                        break;
                    }
                    System.out.println("\nStudents:");

                    for (int i = 0; i < studentCount; i++) {

                        System.out.println(
                                (i + 1)
                                        + ". "
                                        + students[i].getStudentName());
                    }

                    System.out.print("Select Student: ");
                    int stuChoice = sc.nextInt();
                    System.out.println("\nCourses:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Data Structures");
                    System.out.println("3. Database Management");
                    System.out.print("Select Course: ");
                    int courseChoice = sc.nextInt();
                    if (courseChoice == 1) {
                        students[stuChoice - 1].enroll(c1);
                    }
                    else if (courseChoice == 2) {
                        students[stuChoice - 1].enroll(c2);
                    }
                    else if (courseChoice == 3) {
                        students[stuChoice - 1].enroll(c3);
                    }
                    else {
                        System.out.println("Invalid course");
                    }
                    break;
                case 3:
                    if (studentCount == 0) {

                        System.out.println(
                                "No students available");
                        break;
                    }
                    System.out.println("\nStudents:");

                    for (int i = 0; i < studentCount; i++) {

                        System.out.println(
                                (i + 1)
                                        + ". "
                                        + students[i].getStudentName());
                    }
                    System.out.print("Select Student: ");

                    int pchoice = sc.nextInt();

                    System.out.print("Enter Progress: ");

                    int progress = sc.nextInt();

                    students[pchoice - 1]
                            .updateProgress(progress);

                    System.out.println(
                            "Progress updated successfully");

                    break;
                case 4:

                    c1.displayStudents();
                    c2.displayStudents();
                    c3.displayStudents();

                    break;

                case 5:
                    System.out.println("Program closed");
                    break;
                default:

                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
   }
}

