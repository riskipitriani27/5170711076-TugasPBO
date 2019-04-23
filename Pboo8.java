package pboo8;


public class Pboo8 {
    public static void main(String[] args) {
        Siswa gaul = new Siswa();
        Pegawai gesit = new Pegawai();

        System.out.println("==== Siswa ===");
            gaul.Identitas();
            gaul.Umur();
            gaul.Asal();
            gaul.Status();
        System.out.println("=== Pegawai ===");
            gesit.Identitas();
            gesit.Penghasilan();
    }

}
    
