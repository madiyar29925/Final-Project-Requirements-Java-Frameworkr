
package assn_4;

/**
 *
 * @author donnie
 */
public class ASSN_4 {
    
    private String firstName;
    private String lastName;
    private double monthSalary;
    private double salesBonus;
    
    
    public ASSN_4(String firstName, String lastName, double monthSalary, double salesBonus)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthSalary = monthSalary;
        this.salesBonus = salesBonus;
   
        
    }


    
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    

    
   public String getfirstName()
   {
       return firstName;
   }
    

   
   public void setlastName(String lastName)
   {
       this.lastName = lastName;
   }
    

   
   public String getlastName()
   {
       return lastName;
   }
    

   
   public void setmonthSalary(double monthSalary)
   {
       this.monthSalary = monthSalary;
   }
   

   
   public double getmonthSalary()
   {
       return monthSalary;
   }
   

   
   public void setsalesBonus(double salesBonus)
   {
       this.salesBonus = salesBonus;
   }
           

   
   public double getsalesBonus()
   {
       return salesBonus;
       
   }
   
   

   
   public double getyearlySalary()
   {
       return monthSalary * 12 + salesBonus;
   }
   
}
