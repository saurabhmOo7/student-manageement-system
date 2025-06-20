import java.util.Scanner;

// Interface 1: Course
interface Course {
    default void showCourses() {
        System.out.println("Courses Available:");
        System.out.println("1. B.Tech CSE");
        System.out.println("2. B.Tech ECE");
        System.out.println("3. B.Tech ME");
    }
}

// Interface 2: Exam
interface Exam {
    void takeExam();
}

// Interface 3: Result
interface Result {
    void showResult();
}

// Student class implements all interfaces
class Student implements Course, Exam, Result {
    String name;
    int roll;
    int marks;

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        System.out.println("Student Registered Successfully.\n");
    }

    public void takeExam() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
        System.out.println("Exam Completed.\n");
    }

    public void showResult() {
        System.out.println("=== Result ===");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (marks >= 40 ? "Pass" : "Fail") + "\n");
    }
}

// Main class with main method
public class SMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Register Student");
            System.out.println("2. Show Courses");
            System.out.println("3. Take Exam");
            System.out.println("4. Show Result");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.register();
                    break;
                case 2:
                    s.showCourses();
                    break;
                case 3:
                    s.takeExam();
                    break;
                case 4:
                    s.showResult();
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}