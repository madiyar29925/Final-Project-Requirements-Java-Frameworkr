
package assn_4;

public class EmployeeCalc {

    public static void main(String[] args)
    {
        ASSN_4 employee1 = new ASSN_4("Jav", "Dov", 4000, 1000);
        ASSN_4 employee2 = new ASSN_4("Js", "Sma", 5000, 1200);
        
        System.out.printf("%s %s%n",
        employee1.getfirstName(), employee1.getlastName());
        
        System.out.printf("MonthlySalary: %s%n",
        employee1.getmonthSalary());
        
        System.out.printf("Bonus: %s%n",
        employee1.getsalesBonus());
        
        System.out.printf("YearlySalary: %s%n",
        employee1.getyearlySalary());
        
        
        double preraise1 = employee1.getmonthSalary();
        employee1.setmonthSalary(preraise1 += 100);
        
        
        
        System.out.printf("%s %s%n",
        employee2.getfirstName(), employee1.getlastName());
        
        System.out.printf("MonthlySalary: %s%n",
        employee2.getmonthSalary());
        
        System.out.printf("Bonus: %s%n",
        employee2.getsalesBonus());
        
        System.out.printf("YearlySalary: %s%n",
        employee2.getyearlySalary());
        
        
        double preraise2 = employee2.getmonthSalary();
        employee2.setmonthSalary(preraise2 += 100);
        

        
        System.out.printf("%s %s%n",
        employee1.getfirstName(), employee1.getlastName());
        
        System.out.printf("MonthlySalary: %s%n",
        employee1.getmonthSalary());
        
        System.out.printf("Bonus: %s%n",
        employee1.getsalesBonus());
        
        System.out.printf("YearlySalary: %s%n",
        employee1.getyearlySalary());
        
        
        
        System.out.printf("%s %s%n",
        employee2.getfirstName(), employee1.getlastName());
        
        System.out.printf("MonthlySalary: %s%n",
        employee2.getmonthSalary());
        
        System.out.printf("Bonus: %s%n",
        employee2.getsalesBonus());
        
        System.out.printf("YearlySalary: %s%n",
        employee2.getyearlySalary());
        

        
        
        
    }
    
}
