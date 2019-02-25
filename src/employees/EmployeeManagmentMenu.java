package employees;

import java.util.Scanner;

public class EmployeeManagmentMenu {

    static Scanner sc = new Scanner(System.in);
    
    public static int choice1;
    

    public static void employeeManagmentMenu() {
        boolean loop1 = true;
        while (loop1) {
            System.out.println("1: Register new employee");
            System.out.println("2: Fire employee");
            System.out.println("3: Update name on employee");
            System.out.println("4: Update the birthday of employee (weird)");
            System.out.println("5: Update department of employee");
            System.out.println("6: Update salary of employee");
            System.out.println("7: Search employee by name");
            System.out.println("8: Search employee by id");
            System.out.println("9: Search employee by department");
            System.out.println("10: Display all employees");
            System.out.println("0: Back to main menu");
            int choice1 = sc.nextInt();
            sc.nextLine();

            switch (choice1) {
                case 0:
                    loop1 = false;
                    break;
                case 1:
                    EmployeeManagment.registerEmployee();
                    break;
                case 2:
                    EmployeeManagment.deleteEmployee();
                    break;
                case 3:
                    EmployeeManagment.updateName();
                    break;
                case 4:
                    EmployeeManagment.updateBirth();
                    break;
                case 5:
                    EmployeeManagment.updateDepartment();
                    break;
                case 6:
                    EmployeeManagment.updateSalary();
                    break;
                case 7:
                    try{
                    EmployeeManagment.searchName();
                    }catch(IllegalArgumentException e){ 
                        System.out.println("Please fill in the full name of the person.");
                    EmployeeManagment.searchName();
                            
                    }
                    
                    break;
                case 8:
                    EmployeeManagment.searchId();
                    break;
                case 9:
                    EmployeeManagment.searchByDepartment();
                    break;
                case 10:
                    EmployeeManagment.printEmployees();
                    break;
            }

        }
    }
}
