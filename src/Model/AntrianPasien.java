/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {

    private int nomorAntrian = 0;
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();

    public AntrianPasien() {
    }

    public AntrianPasien(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }

    /**
     * membuat method public int dengan nama getTanggalAntrian
     *
     * @return
     */
    public int getTanggalAntrian() {
        //pengembalian nilai dari tanggalAntrian
        return tanggalAntrian;
    }

    /**
     * membuat method public void dengan nama setTanggalAntrian()
     *
     * @param tanggalAntrian
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        //tanggalAntrian dari variabel global sama dengan tanggalAntrian dari variabel lokal
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * membuat method public int dengan nama getBulanAntrian
     *
     * @return
     */
    public int getBulanAntrian() {
        //pengembalian nilai dari bulanAntrian
        return bulanAntrian;
    }

    /**
     * membuat method public void dengan nama setBulanAntrian()
     *
     * @param bulanAntrian
     */
    public void setBulanAntrian(int bulanAntrian) {
        //bulanAntrian dari variabel global sama dengan bulanAntrian dari variabel lokal
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * membuat method public int dengan nama getTahunAntrian
     *
     * @return
     */
    public int getTahunAntrian() {
        //pengembalian nilai dari tahunAntrian
        return tahunAntrian;
    }

    /**
     * membuat method public void dengan nama setTahunAntrian()
     *
     * @param tahunAntrian
     */
    public void setTahunAntrian(int tahunAntrian) {
        //tahunAntrian dari variabel global sama dengan tahunAntrian dari variabel lokal
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * membuat method public int dengan nama getKlinik
     *
     * @return
     */
    public Klinik getKlinik() {
        //pengembalian nilai dari klinik
        return klinik;
    }

    /**
     * membuat method public void dengan nama setKlinik()
     *
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        //klinik dari variabel global sama dengan klinik dari variabel lokal
        this.klinik = klinik;
    }

    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik()
                + klinik.getNama();
    }

    /**
     * membuat method public int dengan nama getNomorAntrian
     *
     * @return
     */
    public int getNomorAntrian() {
        //pengembalian nilai dari nomorAntrian
        return nomorAntrian;
    }

    /**
     * membuat method public void dengan nama setNomorAntrian()
     *
     * @param nomorAntrian
     */
    public void setNomorAntrian(int nomorAntrian) {
        //nomorAntrian dari variabel global sama dengan nomorAntrian dari variabel lokal
        this.nomorAntrian = nomorAntrian;
    }

    /**
     * membuat method public Pasien[] dengan nama getDaftarPasienKlinik()
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasienAntri() {
        //pengembalian nilai dari daftarPasienKlinik
        return daftarPasienAntri;
    }
    /**
     * MEmbuat method Tanggal Antrian
     */
     public void TanggalAntrian() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
        System.out.println(ft.format(date));
    }

    /**
     * Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     *
     */
    public void Mendaftar(Pasien pasien) {
        //membandingkan nomorAntrian dengan jumlah maksimal pasien yang dilayani
        daftarPasienAntri.add(pasien);
    }
/**
 * Membuat method daftar Pasien
 * @param pasien
 * @param tanggal
 * @param bulan
 * @param tahun
 * @param klinik 
 */
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0 ) {
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);

        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }
    }
/**
 * Membuat method Cari Pasien
 * @param NoRM
 * @return 
 */
    public AntrianPasien cariPasien(String NoRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (NoRM.equals(daftarPasienAntri.get(i).getNoRekamMedis())) {
                return daftarAntrian.get(i);
            }
        }
        return null;
    }
/**
 * membuat method Buat Antrian
 * @param tanggalAntrian
 * @param bulanAntrian
 * @param tahunAntrian
 * @param klinik 
 */
    public static void buatAntrian(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggalAntrian);
        antrian.setBulanAntrian(bulanAntrian);
        antrian.setTahunAntrian(tahunAntrian);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggalAntrian, bulanAntrian, tahunAntrian, klinik) < 0) {
           //tambah list antiran
            daftarAntrian.add(antrian);
        } else {
            System.out.println("Antrian Sudah Terpakai");
        }

        
    }
/**
 * Membuat method Cari Antrian
 * @param tanggalAntrian
 * @param bulanAntrian
 * @param tahunAntrian
 * @param klinik
 * @return 
 */
    public static int cariAntrian(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggalAntrian
                    && daftarAntrian.get(i).getBulanAntrian() == bulanAntrian
                    && daftarAntrian.get(i).getTahunAntrian() == tahunAntrian
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())) {
                return 1;
            }

        }
        return -1;
    }

 }