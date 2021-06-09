package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm("19710036");
        mahasiswa.setNama("Miftah Hadi");
        mahasiswa.setTanggalLahir(simpleDateFormat.parse("12-10-2000"));

        System.out.println("Nama \t\t\t : " + mahasiswa.getNpm());
        System.out.println("Npm \t\t\t : " + mahasiswa.getNama());
        System.out.println("Tanggal Lahir \t : " + mahasiswa.getTanggalLahir());

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNpm("19638888");
        mahasiswa2.setNama("Delapu");
        mahasiswa2.setTanggalLahir(simpleDateFormat.parse("08-08-2008"));

        System.out.println("Nama \t\t\t : " + mahasiswa2.getNpm());
        System.out.println("Npm \t\t\t : " + mahasiswa2.getNama());
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.getTanggalLahir()));

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa m = new Mahasiswa("1963002","Dwi", new Date());
        m.tampilkanAtribut();

    }
}
