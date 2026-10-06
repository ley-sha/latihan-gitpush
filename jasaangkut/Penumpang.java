//NIM: 250102048
//NAMA: LEISYA RIDHA RAMADHANI
//KELAS: TI1B

package jasaangkut;

public class Penumpang {
    private int isi;
    private int isiMax;

    public Penumpang(int tipe) {
        isi = 0;

        switch (tipe) {
            case 1:
                isiMax = 8;
                break;
            case 2:
                isiMax = 7;
                break;
            case 3:
                isiMax = 6;
                break;
        }
    } 

    public int getIsi() {
        return isi;
    }

    public int getIsiMax() {
        return isiMax;
    }

    public boolean menaikanPenumpang(int jumlah) {
        if (isi + jumlah <= isiMax) {
            isi += jumlah;
            return true;
        } else {
            return false;
        }
    }

    public boolean menurunkanPenumpang(int jumlah) {
        if (isi - jumlah >= 0) {
            isi -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}