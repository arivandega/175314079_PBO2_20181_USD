/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jarkom
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {

    private Klinik klinik;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * constructor untuk mendeklarasikan objek AntrianPasien
     */
    public AntrianPasien() {

    }

    /**
     * method untuk mengambil nilai dari variabel klinik
     *
     * @return
     */
    public Klinik getKlinik() {
        //perintah untuk pengambalian nilai dari variabel klnik
        return klinik;
    }

    /**
     * method untuk meng set nilai dari variabel klinik dengan variabel lokal
     * klinik yang bertipe data Klinik
     *
     * @param nama
     */
    public void setKlinik(Klinik klinik) {
        // pernyataan bahwa nilai dari variabel klinik yang bersifat global sama dengan nilai dari variabel lokal klinik
        this.klinik = klinik;
    }

    /**
     * method untuk mengambil nilai dari variabel daftarPasien
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        //perintah untuk pengambalian nilai dari variabel daftarPasien
        return daftarPasien;
    }

    /**
     * method untuk mengset nilai dari variabel daftarPasien dengan variabel
     * lokal daftar pasien yang bertipe ArrayList pasien
     *
     * @param nama
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien yang bersifat global sama dengan nilai dari variabel lokal daftarPasien
        this.daftarPasien = daftarPasien;
    }

    /**
     * Method untuk menampilkan tanggal dan waktu antrian
     */
    public void TanggalAntrian() {
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat fr = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
        // menampilkan data dari objek ft dengan format date
        System.out.println(fr.format(date));
    }

    /**
     * Method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) {
        // mengisi data pada variabel daftarPasien dengan variabel lokal daftarPasien 
        daftarPasien.add(pasien);
    }

}