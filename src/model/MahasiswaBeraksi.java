package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19710036";
        mahasiswa.nama = "Miftah Hadi";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("12-10-2000");


        System.out.println("Nama \t\t\t : " + mahasiswa.npm);
        System.out.println("Npm \t\t\t : " + mahasiswa.nama);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19638888";
        mahasiswa2.nama = "Delapu";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("08-08-2008");

        System.out.println("Nama \t\t\t : " + mahasiswa2.npm);
        System.out.println("Npm \t\t\t : " + mahasiswa2.nama);
        System.out.println("Tanggal Lahir \t : " +
                simpleDateFormat.format(mahasiswa2.tanggalLahir));

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa m = new Mahasiswa("1963002","Dwi", new Date());
        m.tampilkanAtribut();

    }
}
