package CS_EF_RakaArrayanMuttaqien_2306161800_OOP2;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String [] args ){
        FullTimeEmployee karyawan1 = new FullTimeEmployee("Harvan",2294,Position.DIRECTOR,Division.Seminar,
            1000,700,0.6);
            
        FullTimeEmployee karyawan2 = new FullTimeEmployee("Rafi",2938,Position.STAFF,Division.Marketing,500,100,0.9);
            
        karyawan1.displayInfo();
        karyawan2.displayInfo();
    }
}
