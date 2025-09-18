public class MataKuliah {

    //property
    public String namaMatkul;
    public int sks;
    public String dosenPengampu;

    //method
    public MataKuliah(String namaMatkul, int sks, String dosenPengampu){
        this.namaMatkul = namaMatkul; 
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public void showMataKuliah() {
        System.out.println(("nama: " + this.namaMatkul));
        System.out.println(("sks: " + this.sks));
        System.out.println(("Dosen Pengampu: " + this.dosenPengampu));

    }
    
}

