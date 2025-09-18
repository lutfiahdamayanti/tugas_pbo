public class MataKuliah {

    //property
    public String namaMatkul;
    public int sks;

    //method
    public MataKuliah(String namaMatkul, int sks){
        this.namaMatkul = namaMatkul; 
        this.sks = sks; 
    }

    public void showMataKuliah() {
        System.out.println(("nama: " + this.namaMatkul));
        System.out.println(("sks: " + this.sks));
    }
    
}

