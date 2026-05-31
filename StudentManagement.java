import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int age;
}

public class StudentManagement {

    static void addStudent(Scanner sc, ArrayList<Student> students) {

        Student s = new Student();

        System.out.print("Enter Name: ");
        sc.nextLine();
        s.name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        s.rollno = sc.nextInt();

        System.out.print("Enter Age: ");
        s.age = sc.nextInt();

        students.add(s);

        System.out.println("Student Added Successfully!");
    }

    static void displayStudents(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nStudent Details:");

        for (Student st : students) {
            System.out.println("----------------------");
            System.out.println("Name: " + st.name);
            System.out.println("Roll No: " + st.rollno);
            System.out.println("Age: " + st.age);
        }
    }

    static void searchStudent(Scanner sc, ArrayList<Student> students) {

        System.out.print("Enter Roll Number to Search: ");
        int searchRollNo = sc.nextInt();

        boolean found = false;

        for (Student st : students) {

            if (st.rollno == searchRollNo) {

                System.out.println("Student Found:");
                System.out.println("Name: " + st.name);
                System.out.println("Roll No: " + st.rollno);
                System.out.println("Age: " + st.age);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void updateStudent(Scanner sc, ArrayList<Student> students) {

        System.out.print("Enter Roll Number to Update: ");
        int updateRollNo = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Student st : students) {

            if (st.rollno == updateRollNo) {

                System.out.print("Enter New Name: ");
                st.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                st.age = sc.nextInt();

                System.out.println("Student Updated Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent(Scanner sc, ArrayList<Student> students) {

        System.out.print("Enter Roll Number to Delete: ");
        int deleteRollNo = sc.nextInt();

        Student studentToDelete = null;

        for (Student st : students) {

            if (st.rollno == deleteRollNo) {
                studentToDelete = st;
                break;
            }
        }

        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc, students);
                    break;

                case 2:
                    displayStudents(students);
                    break;

                case 3:
                    searchStudent(sc, students);
                    break;

                case 4:
                    updateStudent(sc, students);
                    break;

                case 5:
                    deleteStudent(sc, students);
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}