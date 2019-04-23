package pboo8;

public class Siswa extends Manusia {
    void Umur() {
        System.out.print("Umur : ");
        char u = a.next().charAt(0);
    }
    void Asal() {
        System.out.print("Asal Daerah : ");
        char ad = a.next().charAt(0);
    }
    void Status() {
        System.out.print("Status : ");
        char u = a.next().charAt(0);
    }
    
    @Override
     protected void Identitas() {
        System.out.print("Nama Lengkap : ");
        nama = i.nextLine();
        System.out.print("Tanggal Lahir : ");
        int tgl = i.nextInt();
        System.out.print("Jenis Kelamin L/P : ");
        jk = a.nextLine();
    }
}  

