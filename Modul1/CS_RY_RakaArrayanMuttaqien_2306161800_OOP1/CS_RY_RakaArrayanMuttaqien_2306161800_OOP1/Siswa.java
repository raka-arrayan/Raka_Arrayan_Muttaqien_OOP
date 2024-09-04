
/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa implements Showing 
{
    public String nama;
    public int id;
    public String status;
    public float totalNilai;
    public mataPelajaran mataPelajaran;
    
    public Siswa (String nama,int id,mataPelajaran mataPelajaran){
        this.nama=nama;
        this.id=id;
        this.mataPelajaran=mataPelajaran;
    }
    
    public void totalNilai(){
        float totalNilai=(40*mataPelajaran.nilaiUTS)/100+(60*mataPelajaran.nilaiUAS)/100;
        if (totalNilai >= 75.0){
            System.out.println("LULUS");
        }
        else {
            System.out.println("TIDAK LULUS");
        }
    }
    
    public void showDetail(){
        System.out.println ("Nama Siswa :" + nama);
        System.out.println("ID" + id);
        System.out.println("Mata Pelajaran :"+ mataPelajaran);
        System.out.println("Total Nilai" + totalNilai);
        System.out.println("Status :" + status);
        System.out.println();
    }
    
}
