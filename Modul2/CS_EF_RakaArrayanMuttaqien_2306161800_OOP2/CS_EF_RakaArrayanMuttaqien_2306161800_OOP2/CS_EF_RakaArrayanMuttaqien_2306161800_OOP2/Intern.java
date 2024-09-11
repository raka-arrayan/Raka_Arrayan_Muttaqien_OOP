package CS_EF_RakaArrayanMuttaqien_2306161800_OOP2;


/**
 * Write a description of class Intern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intern extends Employee implements CalculateSalary
{
    private double hourlyRate;
    private double hoursWorked;
    
    
    public Intern(String name, int id, Position position, Division division, double 
    hourlyRate, int hoursWorked) {
    super (name,id,position,division);
    this.hourlyRate=hourlyRate;
    this.hoursWorked=hoursWorked;
    }
    
    public double totalSalary(){
        int  monthlyWorked =  hoursWorked * 20;
        
        if ( hoursWorked < 20 ){
            return 0;
        }
        
        int salary =monthlyWorked * hoursWorked;
        if (hoursWorked < 80 ) {
            return salary;     
        }
        
    }
    
    public displayInfo(){
        System.out.println("Nama" + getName());
        System.out.println("ID" + getId());
        System.out.println("Posisi" + position);
        System.out.println("Divisi" + division);
        System.out.println("hourlyRate"+ hourlyRate);
        System.out.println("hoursWorked" + hoursWorked);
        System.out.println("totalSalary"+ totalSalary());
    }
}
