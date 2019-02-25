
package employees;


import java.util.Scanner;


public class EmployeeManagmentSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fakeDataBase();
                boolean loop = true;

        while(loop) {
            System.out.println("Welcome to EmployeeManagmentSystem (Proffs edition).");
            System.out.println("What do you want to do?");
            System.out.println("1: Employee managment");
            System.out.println("2: Employee statistics");
            System.out.println("0: Exit program.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    EmployeeManagmentMenu.employeeManagmentMenu();
                    break;
                case 2:
                    EmployeeStatisticsMenu.employeeStatisticsMenu();
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
                    break;
            }
        }
        if(loop == false) {
            System.out.println("Thank you for using EmployeeManagmentSystem (Proffs edition).");
        }
    }

    private static void fakeDataBase() {
        Manager m = new Manager("Kalle", "Kula", 18000, "Male", "83-05-28", "Managment");
        Manager m2 = new Manager("Mattias", "Beer", 15000, "Female", "82-06-06", "Managment");
        Programmer p = new Programmer("Cheryl", "Stål", 39000, "male", "78-03-11", "Development");
        Technician t = new Technician("Karin", "Kantakoski", 29000, "Female", "91-09-29", "Development");
        Secretary s = new Secretary("Lisa", "Svensson", 20000, "female", "91-10-19", "Managment");
       
        EmployeeManagment.employeeList.add(m);
        EmployeeManagment.employeeList.add(m2);
        EmployeeManagment.employeeList.add(s);
        EmployeeManagment.employeeList.add(p);
        EmployeeManagment.employeeList.add(t);
        
    }
 
}
