package CS_EF_RakaArrayanMuttaqien_2306161800_OOP2;


/**
 * Write a description of class FullTimeEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeEmployee extends Employee implements CalculateSalary
{
    private double baseSalary;
    private double baseBonus;
    private double performanceRating;
    
    public  FullTimeEmployee(String name, int id, Position position, Division division, 
double baseSalary, double baseBonus, double performanceRating){
    super (name,id,position,division);
    this.baseSalary=baseSalary;
    this.baseBonus=baseBonus;
    this.performanceRating=performanceRating;
}

    public double  bonusSalary(){
        if (performanceRating < 0.2){
            return 0;
        }
        else {
            return baseBonus * performanceRating;
        }  
    }
    
    public double totalSalary(){
        return baseSalary * baseBonus;
    }
    
    public void displayInfo(){
        System.out.println("Nama: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Posisi: " + position);
        System.out.println("Divisi: " + division);
        System.out.println("baseSalary: "+ baseSalary);
        System.out.println("baseBonus: " + baseBonus);
        System.out.println("totalSalary: "+ totalSalary());
        System.out.println();
    }
    
}
