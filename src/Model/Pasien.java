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
 * @author Asus
 */
public class Pasien {

    private String noRekamMedis;
    private String Nama;
    private String Alamat;
    private String TmptLahir;
    private int TglLahir;
    private int BlnLahir;
    private int ThLahir;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * constructor untuk mendeklarasikan objek pasien
     */
    public Pasien() {

    }

    /**
     * constructor untuk mendeklarasikan objek pasien dengan parameter lokal
     * nama dengan tipe data String
     *
     * @param nama
     */
    public Pasien(String nama) {
        // pernyataan bahwa nilai variabel nama sama dengan nilai dari variabel lokal nama
        this.Nama = nama;
    }

    public Pasien(String nama, String Alamat, String tempatLahir, int tanggal, int bulan, int tahun, String nik) {
        this.Nama = nama;
        this.Alamat = this.Alamat;
        this.TmptLahir = tempatLahir;
        this.TglLahir = tanggal;
        this.BlnLahir = bulan;
        this.ThLahir = tahun;
        this.noRekamMedis = nik;
    }

    /**
     * method untuk mengambil nilai dari variabel noRekamMedis
     *
     * @return
     */
    public String getNoRekamMedis() {
        //pengambalian nilai dari variabel noRekamMedis
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        // pengambalian nilai dari variabel nama
        return Nama;
    }

    /**
     * method untuk mengset nilai dari variabel nema dengan parameter lokal nama
     * yang bertipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        // pernyataan bahwa nilai dari variabel nama sama dengan nilai dari variabel lokal nama
        this.Nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel alamat
     *
     * @return
     */
    public String getAlamat() {
        //pengambalian nilai dari variabel alamat
        return Alamat;
    }

    /**
     * method untuk mengset nilai dari variabel alamat dengan parameter lokal
     * alamat yang bertipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        // pernyataan bahwa nilai dari variabel alamat sama dengan nilai dari variabel lokal alamat
        this.Alamat = alamat;
    }

    /**
     * method untuk mengambil nilai dari variabel tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        //pengambalian nilai dari variabel tempatLahir
        return TmptLahir;
    }

    /**
     * method untuk mengset nilai dari variabel tempatLahir dengan parameter
     * lokal tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        // pernyataan bahwa nilai dari variabel tempatLahir sama dengan nilai dari variabel lokal tempatLahir
        this.TmptLahir = tempatLahir;
    }

    /**
     * method untuk mengambil nilai dari variabel tanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        //pengambalian nilai dari variabel tanggalLahir
        return TglLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tanggalLahir dengan variabel
     * lokal tanggalLahir dengan tipe data String
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
  
                this.TglLahir = tanggalLahir;
            } else {

                throw new Exception("Input Tanggal Lebih Dari 31");
            }
        } else {

            throw new Exception("Input Tanggal Kurang Dari 0");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel bulanLahir
     *
     * @return
     */
    public int getBulanLahir() {

        return BlnLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel bulanLahir dengan variabel
     * lokal bulanLahir dengan tipe data String
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {

        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {

                this.BlnLahir = bulanLahir;
            } else {

                throw new Exception("Input Bulan Lebih Dari 12");
            }
        } else {

            throw new Exception("input Bulan Kurang Dari 0");
        }

    }

    /**
     * method untuk mengambil nilai dari variabel tahunLahir
     *
     * @return
     */
    public int getTahunLahir() {

        return ThLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tahunLahir dengan variabel
     * lokal tahunLahir dengan tipe data String
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {

        if (tahunLahir > 0) {

            this.ThLahir = tahunLahir;
        } else {

            throw new Exception("Salah Input Tahun");
        }
    }

    /**
     * method untuk membuat nomor rekam medis yang terdiri dari tanggal pasien
     * mengatri ditambah 3 huruf pertama dari nama
     *
     * @return
     */
    public String BuatNomorRekamMedis() {

        String nomorRekamMEdis;

        Date date = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");

        nomorRekamMEdis = ft.format(date) + Nama.substring(0, 3);

        return nomorRekamMEdis;
    }

    /**
     * method untuk menambahkan objek pasien ke arrayList daftarpasien
     *
     * @param pasien
     */
    public static void tambahPasienBaru(Pasien pasien) {

        daftarPasien.add(pasien);

    }

    /**
     * method untuk mencari object pasien berdasarkan nomor rekam medis
     *
     * @param NoRM
     * @return
     */
    public static Pasien cariPasien(String NoRM) {

        for (int i = 0; i < daftarPasien.size(); i++) {

            if (NoRM == null ? daftarPasien.get(i).getNoRekamMedis() == null
                    : NoRM.equals(daftarPasien.get(i).getNoRekamMedis())) {

                return daftarPasien.get(i);
            }
        }

        return null;
    }
}
