package CS_EF_RakaArrayanMuttaqien_2306161800_OOP2;


/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Manager extends Person 
{
    private List<Employee> employees;
    
    public Manager(String name, int id){
        super(name,id);
        employees = new ArrayList<>();
    }
    
    public void  addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void assignTask(Employee employee, String task){
        //employee.recievetask(task);
    }
    
    public void displayInfo(){
        System.out.println("Nama: " + getName());
        System.out.println("ID: " + getId());
        System.out.println();
    }
    
    for 
    
}
