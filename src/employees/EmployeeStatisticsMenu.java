
package employees;

import java.util.Scanner;


public class EmployeeStatisticsMenu {
    static Scanner sc = new Scanner(System.in);
    
    public static int choice2;
    
    public static void employeeStatisticsMenu(){
         boolean loop2 = true;
        while(loop2){
           
            System.out.println("1: Average wage at the company");
            System.out.println("2: Highest salary at the company");
            System.out.println("3: Lowest salary at the company");
            System.out.println("4: Total bonus");
            System.out.println("5: Women in percentage in the company");
            System.out.println("6: Men percentage of the various work role categories");
            System.out.println("0: Back to main menu");
            int choice1 = sc.nextInt();
            sc.nextLine();
            
            switch (choice1) {
                case 0: 
                    loop2 = false;
                    break;
                case 1:
                    EmployeeStatistics.averageWage();
                    break;
                case 2:
                    EmployeeStatistics.maxSalary();
                    break;
                case 3:
                    EmployeeStatistics.minSalary();
                    break;
                case 4:
                    EmployeeStatistics.bonus();
                    EmployeeStatistics.bonusByEmploee();
                    
                    break;
                case 5:
                    EmployeeStatistics.perecentageWomen();
                    break;
                case 6:
                    EmployeeStatistics.menByDepartment();
                    break;
            }
            
    
        }
    }
}
