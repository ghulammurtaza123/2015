
package employees;


import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;


public class EmployeeStatistics {
   
    public static void averageWage() {
        int wage = 0;
        int nEmployees = 0;
         for (Employee employee : EmployeeManagment.employeeList) {
            wage = wage + employee.getSalary(); 
            nEmployees ++; 
        }
         int averageWage = wage / nEmployees; 
         System.out.println("The average wage at the company is " + averageWage);
    }
    public static void maxSalary() {
        int wage = 0;
        for (Employee employee : EmployeeManagment.employeeList) {
           if(wage < employee.getSalary()) {
            wage = employee.getSalary();
           } 
        }
        System.out.println("The highest salary in the company is " + wage);
    }
    public static void minSalary() {
//       Skriv en for i loop som kollar varje del i ArrayListen
       Iterator<Employee> employee = EmployeeManagment.employeeList.iterator();
       int wage = employee.next().getSalary();
        for (Employee employee2 : EmployeeManagment.employeeList) {
            if(wage > employee2.getSalary()){
                wage = employee2.getSalary();
            }
        }
        System.out.println("The lowest salary is " + wage);
    }
    public static void bonus() {
        double totalBonus, mBonus=0 ,sBonus = 0, tBonus = 0, pBonus = 0;
        DecimalFormat df = new DecimalFormat("#.00");
    
        for (Employee employee : EmployeeManagment.employeeList) {
            if(employee instanceof Manager) {
                int salary = employee.getSalary();
                mBonus = mBonus+ Manager.managerBonusCalculator(salary);
                
            }else if(employee instanceof Secretary) {
                int salary = employee.getSalary();
            sBonus = sBonus + Secretary.secretaryBonusCalculator(salary);
                 
            }else if(employee instanceof Programmer) {
                int salary = employee.getSalary();
                pBonus = pBonus + Programmer.programmerBonusCalculator(salary);
               
            }else if(employee instanceof Technician) {
                int salary = employee.getSalary();
                tBonus = tBonus + Technician.technicianBonusCalculator(salary);
            }
        } 
        String mgBonus = df.format(mBonus);
        String scBonus = df.format(sBonus);
        String prBonus = df.format(pBonus);
        String tcBonus = df.format(tBonus);
        totalBonus = mBonus + sBonus + pBonus + tBonus;
       System.out.println("The total bonus in the company is " + totalBonus);
        
        System.out.println(mgBonus +" "+scBonus +" "+tcBonus + " " + prBonus);
    }
    public static void bonusByEmploee(){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter Id of specific employee to get Bonus : ");
    int id=sc.nextInt();
    sc.nextLine();
    for (Employee employee : EmployeeManagment.employeeList) {
        if(employee.getId()==id)
            System.out.println("Bonus for " + employee.getName() + "is" + employee.getDepartment() );
        
        
     
    
    }
    
    
    
    }
    public static void perecentageWomen() {
        int womenPercent=0;
        float numberOfWomen=0;
        
        for (Employee employee : EmployeeManagment.employeeList) {
            if(employee.getGender().equalsIgnoreCase("Female")){
                 numberOfWomen++;}
           
           
                  
        
    }
       
    womenPercent= (int) ((numberOfWomen / (Employee.getNumberOfEmployees()))*100);
            System.out.println("Total percent of women in company is :" + womenPercent);
    
    }
    public static void menByDepartment() {
        
         int numberOfProgrammers=0, numberOfManagers=0,numberOfSecretries=0,numberOfTechnecians=0;
        
        
        for (Employee employee : EmployeeManagment.employeeList) {
           if(employee instanceof Manager && (employee.getGender().equalsIgnoreCase("Male"))) {
                numberOfManagers++;
                
            }else if(employee instanceof Secretary && (employee.getGender().equalsIgnoreCase("Male")) ) {
               numberOfSecretries++;
                 
            }else if(employee instanceof Programmer && (employee.getGender().equalsIgnoreCase("Male"))) {
             numberOfProgrammers++;
               
            }else if(employee instanceof Technician && (employee.getGender().equalsIgnoreCase("Male"))) {
                numberOfTechnecians++;
            }
           
           
                  
        
    }
        System.out.println("Number of men as Manager" + numberOfManagers);
        System.out.println("Number of men as Programmer" + numberOfProgrammers);
        System.out.println("Number of men as Secretry" + numberOfSecretries);
        System.out.println("Number of men as Technician" + numberOfTechnecians);
        
    }
    
}
