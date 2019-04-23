package pboo8;
import java.util.Scanner;

public class Manusia {
    public Scanner i = new Scanner(System.in);
    public Scanner a = new Scanner(System.in);
      String jk, nama;
      int tgl ;
      
    protected void Identitas() {
        System.out.print("Nama Lengkap : ");
        nama = i.nextLine();
        System.out.print("Tanggal Lahir : ");
        tgl = i.nextInt();
        System.out.print("Jenis Kelamin L/P : ");
        jk = a.nextLine();
    }
}

