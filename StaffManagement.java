
import java.util.ArrayList;
import java.util.Scanner;

class Staff {

    int staffID;
    String Department;
    String empName;
}

public class StaffManagement {

    static void addStaff(Scanner sc, ArrayList<Staff> staffs) {
        Staff s = new Staff();

        System.out.println("Enter Staff ID: ");
        s.staffID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name: ");
        s.empName = sc.nextLine();

        System.out.println("Department Name: ");
        s.Department = sc.nextLine();

        staffs.add(s);

        System.out.println("Successfully Added!!!");
    }

    static void displayStaff(ArrayList<Staff> staffs) {
        System.out.println("-----DETAILS-----");

        if (staffs.isEmpty()) {
            System.out.println("No Staff to Display");
            return;
        }

        for (Staff st : staffs) {
            System.out.println("----------");
            System.out.println("Staff ID : " + st.staffID);
            System.out.println("Employee Name : " + st.empName);
            System.out.println("Department : " + st.Department);
        }
    }

    static void searchStaff(Scanner sc, ArrayList<Staff> staffs) {
        System.out.println("Enter ID to Search: ");
        int SearchID = sc.nextInt();

        boolean found = false;

        for (Staff st : staffs) {
            if (SearchID == st.staffID) {
                System.out.println("Employee Found-----");
                System.out.println("Staff ID : " + st.staffID);
                System.out.println("Employee Name : " + st.empName);
                System.out.println("Department : " + st.Department);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Employee do not exist");
        }
    }

    public static void main(String[] args){
        ArrayList<Staff> staffs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do { 
            System.out.println("-----MENU-----");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Search");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    addStaff(sc, staffs);
                    break;
                case 2:
                    displayStaff(staffs);
                    break;
                case 3:
                    searchStaff(sc, staffs);
                    break;
                case 4:
                    break;
                default :
                    System.out.println("Enter valid choice!!!");
            }
        } while (choice != 4);
    }
}
