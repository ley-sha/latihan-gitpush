//NIM: 250102048
//NAMA: LEISYA RIDHA RAMADHANI
//KELAS: TI1B

import jasaangkut.*;
import java.util.Scanner;

public class Implementasi {
    public static void main(String[] args) {

        boolean cek;

        Scanner input = new Scanner(System.in);

        Angkot wijaya = new Angkot();

        System.out.println("    Entry Data Angkot   ");
        System.out.println("------------------------");

        System.out.print("Nomor Polisi\t: ");
        wijaya.setNoAngkot(input.nextLine());

        System.out.print("Nama Sopir\t: ");
        wijaya.setNamaSopir(input.nextLine());

        System.out.print("Tahun Rakit\t: ");
        wijaya.setTahunRakit(Integer.parseInt(input.nextLine()));

        System.out.print("Merk\t        : ");
        wijaya.setMerk(input.nextLine());

        System.out.print("Warna\t        : ");
        wijaya.setWarna(input.nextLine());

        System.out.print("Jenis BBM\t: ");
        wijaya.setBBM(input.nextLine());

        System.out.print("Type (1/2/3)\t: ");
        wijaya.setTipe(input.nextLine());

        System.out.println();
        System.out.println("    Lihat Data Angkot   ");
        System.out.println("------------------------");

        System.out.println("No. Polisi  : " + wijaya.getNoAngkot());
        System.out.println("Nama Sopir  : " + wijaya.getNamaSopir());
        System.out.println("Tahun Rakit : " + wijaya.getTahunRakit());
        System.out.println("Merk        : " + wijaya.getMerk());
        System.out.println("Warna       : " + wijaya.getWarna());
        System.out.println("Jenis BBM   : " + wijaya.getBBM());
        System.out.println("Type        : " + wijaya.getTipe());

        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("            Lihat Data Muatan          ");
        System.out.println("---------------------------------------");

        wijaya.setPenumpang(new Penumpang(Integer.parseInt(wijaya.getTipe())));

        System.out.println("Kapasitas maksimal penumpang : " + wijaya.getPenumpang().getIsiMax() + " orang");

        cek = wijaya.getPenumpang().menaikanPenumpang(5);
        System.out.println("Jumlah penumpang naik : 5 orang");

        if (cek)
            System.out.println("    Ok......");
        else
            System.out.println("    Gagal......");

        System.out.println("Total penumpang : " + wijaya.getPenumpang().getIsi() + " orang");
        System.out.println();

        cek = wijaya.getPenumpang().menaikanPenumpang(2);
        System.out.println("Jumlah penumpang naik : 2 orang");

        if (cek)
            System.out.println("    Ok......");
        else
            System.out.println("    Gagal......");

        System.out.println("Total penumpang : " + wijaya.getPenumpang().getIsi() + " orang");
        System.out.println();

        cek = wijaya.getPenumpang().menaikanPenumpang(1);
        System.out.println("Jumlah penumpang naik : 1 orang");

        if (cek)
            System.out.println("    Ok......");
        else
            System.out.println("    Gagal......");

        System.out.println("Total penumpang : " + wijaya.getPenumpang().getIsi() + " orang");
        System.out.println();

        cek = wijaya.getPenumpang().menurunkanPenumpang(5);
        System.out.println("Jumlah penumpang turun : 5 orang");

        if (cek)
            System.out.println("    Ok......");
        else
            System.out.println("    Gagal......");

        System.out.println("Total penumpang : " + wijaya.getPenumpang().getIsi() + " orang");


        System.out.println("==================================================");
    }
}