
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
   public static void main (String [] args){
       Guru guruIPA =new Guru ("Mr.Budi",20);
       
       mataPelajaran IPA =new mataPelajaran("IPA",guruIPA);
       
       IPA.addNilai(Penilaian.UTS,30,Penilaian.UAS,70);
       
       Siswa Raka = new Siswa ("Raka" ,33,IPA);
       
       
       IPA.showDetail();
       Raka.showDetail();
       
   }
}
