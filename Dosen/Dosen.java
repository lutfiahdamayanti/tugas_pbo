public class Dosen {

    //property
    public String nama;
    public String NIP;

    //method
    public Dosen(String nama, String NIP){
        this.nama = nama;
        this.NIP = NIP;
    }
    
    public void ShowDosen(){
        System.out.println("nama: " + this.nama);
        System.out.println("NIP: " + this.NIP);
    }
}
