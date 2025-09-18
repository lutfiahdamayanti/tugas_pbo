public class Mahasiswa {
    public String nama;
    public String nim;
    public String jurusan;
    public double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void ShowMahasiswa(){
        System.out.println("nama: " + this.nama);
        System.out.println("Gaji: " + this.nim);
        System.out.println("jurusan: " + this.jurusan);
        System.out.println("ipk: " + this.ipk);
    }
}
