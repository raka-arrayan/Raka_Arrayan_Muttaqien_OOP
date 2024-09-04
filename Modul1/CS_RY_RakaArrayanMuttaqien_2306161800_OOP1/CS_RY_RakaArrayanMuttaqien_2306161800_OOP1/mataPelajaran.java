
/**
 * Write a description of class Pelajaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mataPelajaran implements Showing
{
   public String namaMataPelajaran;
   public Guru guru;
   public Penilaian UTS;
   public Penilaian UAS;
   public float nilaiUTS;
   public float nilaiUAS;
   
   public mataPelajaran(String namaMataPelajaran,Guru guru ){
       this.namaMataPelajaran=namaMataPelajaran;
       this.guru=guru;
   }
   
   public void addNilai (Penilaian UTS,float nilaiUTS,Penilaian UAS,float nilaiUAS){
       this.UTS=UTS;
       this.nilaiUTS=nilaiUTS;
       this.UAS=UAS;
       this.nilaiUAS=nilaiUAS;
   }
   
   public void showDetail(){
       System.out.println("Mata Pelajaran :" + namaMataPelajaran);
       System.out.println("Nama Guru :" + guru.name);
       System.out.println("Nilai UTS :" + nilaiUTS);
       System.out.println("Nilai UAS :" +nilaiUAS);
       System.out.println();
   }
}

