package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mahasiswaberaksi {
    public static void main (String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19710080";
        mahasiswa.nama = "Linda Oktaviyani";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("08-10-2001");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19710032","Dikta","09-01-2001");
        mahasiswa2.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku " + mahasiswa2.hitungUsia() + " tahun");
    }
}
