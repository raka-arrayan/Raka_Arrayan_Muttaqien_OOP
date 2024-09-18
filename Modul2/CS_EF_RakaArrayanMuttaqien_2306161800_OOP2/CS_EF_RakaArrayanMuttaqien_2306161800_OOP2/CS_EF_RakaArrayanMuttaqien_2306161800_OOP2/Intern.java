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
    private int  hoursWorked;
    
    public Intern(String name, int id, Position position, Division division, double 
    hourlyRate, int hoursWorked) {
    super (name,id,position,division);
    this.hourlyRate=hourlyRate;
    this.hoursWorked=hoursWorked;
    }
    
    public double totalSalary() {
        int monthlyWorked = hoursWorked * 20;

        if (monthlyWorked < 20) {
            return 0; 
        }

        double salary = hourlyRate * hoursWorked;
        if (monthlyWorked < 80) {
            return salary;
        } else {
            double bonus = salary * 0.125; 
            return salary + bonus;
        }
    }
    
    public void  displayInfo(){
        System.out.println("Nama" + getName());
        System.out.println("ID" + getId());
        System.out.println("Posisi" + position);
        System.out.println("Divisi" + division);
        System.out.println("hourlyRate"+ hourlyRate);
        System.out.println("hoursWorked" + hoursWorked);
        System.out.println("totalSalary"+ totalSalary());
        System.out.println();
    }
}
