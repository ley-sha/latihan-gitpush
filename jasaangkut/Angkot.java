//NIM: 250102048
//NAMA: LEISYA RIDHA RAMADHANI
//KELAS: TI1B

package jasaangkut;

public class Angkot extends Mobil {

    private String noAngkot;
    private String namaSopir;
    private String tipe;
    private int tahunRakit;

    private Penumpang penumpang;

    public Angkot() {
        
    }

    public void setNoAngkot(String noAngkot) {
        this.noAngkot = noAngkot;
    }

    public void setNamaSopir(String namaSopir) {
        this.namaSopir = namaSopir;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setTahunRakit(int tahunRakit) {
        this.tahunRakit = tahunRakit;
    }

    public String getNoAngkot() {
        return noAngkot;
    }

    public String getNamaSopir() {
        return namaSopir;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTahunRakit() {
        return tahunRakit;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }
}