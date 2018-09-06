/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ROG
 */
public class Pasien {

    private String NoRekamMedis;
    private String Nama;
    private String Alamat;
    private String TmptLahir;
    private int TglLahir;
    private int BlnLahir;
    private int Thlahir;

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
        // pernyataan bahwa nilai variabel nama yang bersifat global sama dengan nilai dari variabel lokal nama
        this.Nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel noRekamMedis
     *
     * @return
     */
    public String getNoRekamMedis() {
        //perintah untuk pengambalian nilai dari variabel noRekamMedis
        return NoRekamMedis;
    }

    /**
     * method untuk meng-set nilai dari variabel noRekamMedis dengan variabel
     * lokal noRekamMedis dengan tipe data String
     *
     * @param noRekamMedis
     * @throws Exception
     */
    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        // pengecekan Banyak karakter variabel NoRekamMedis harus lebih dari 6 
        if (noRekamMedis.length() > 6) {
            // pernyataan bahwa nilai variabel NoRekamMedis yang bersifat global sama dengan nilai dari variabel lokal NoRekamMedis
            this.NoRekamMedis = noRekamMedis;
        } else {
            // pesan apabila input noRekamMedis salah
            throw new Exception("Nomor rekam Medis Salah");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        // perintah untuk pengambalian nilai dari variabel nama
        return Nama;
    }

    /**
     * method untuk mengset nilai dari variabel nema dengan parameter lokal nama
     * yang bertipe data String
     *
     * @param nama
     */
    public void setNama(String nama) {
        // pernyataan bahwa nilai dari variabel nama yang bersifat global sama dengan nilai dari variabel lokal nama
        this.Nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel alamat
     *
     * @return
     */
    public String getAlamat() {
        //perintah untuk pengambalian nilai dari variabel alamat
        return Alamat;
    }

    /**
     * method untuk mengset nilai dari variabel alamat dengan parameter lokal
     * alamat yang bertipe data String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        // pernyataan bahwa nilai dari variabel alamat yang bersifat global sama dengan nilai dari variabel lokal alamat
        this.Alamat = alamat;
    }

    /**
     * method untuk mengambil nilai dari variabel tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        //perintah untuk pengambalian nilai dari variabel TmptLahir
        return TmptLahir;
    }

    /**
     * method untuk mengset nilai dari variabel tempatLahir dengan parameter
     * lokal tempatLahir yang bertipe data String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        // pernyataan bahwa nilai dari variabel Tmptlahir yang bersifat global sama dengan nilai dari variabel lokal tempatLahir
        this.TmptLahir = tempatLahir;
    }

    /**
     * method untuk mengambil nilai dari variabel tanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        // perintah untuk pengambalian nilai dari variabel TglLahir
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
        //pengecekan nilai variabel lokal tanggalLahir harus lebih dari 0
        if (tanggalLahir > 0) {
            //pengecekan nilai variabel lokal tanggalLahir harus kurang dari atau sama dengan 31
            if (tanggalLahir <= 31) {
                //pernyataan bahwa nilai dari variabel TglLahir yang bersifat global sama dengan nilai dari variabel lokal tanggalLahir
                this.TglLahir = tanggalLahir;
            } else {
                // pesan apabila input tanggalLahir lebih dari 31 
                throw new Exception("Input Tanggal Lebih Dari 31");
            }
        } else {
            // pesan apabila input tanggalLahir kurang dari 0 
            throw new Exception("Input Tanggal Kurang Dari 0");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel bulanLahir
     *
     * @return
     */
    public int getBulanLahir() {
        // perintah untuk pengambalian nilai dari variabel BlnLahir
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
        //pengecekan nilai variabel lokal bulanLahir harus lebih dari 0
        if (bulanLahir > 0) {
            //pengecekan nilai variabel lokal bulanLahir harus kurang dari atau sama dengan 12
            if (bulanLahir <= 12) {
                //pernyataan bahwa nilai dari variabel BlnLahir yang bersifat global sama dengan nilai dari variabel lokal bulanLahir
                this.BlnLahir = bulanLahir;
            } else {
                // pesan apabila input bulanLahir lebih dari 12
                throw new Exception("Input Bulan Lebih Dari 12");
            }
        } else {
            // pesan apabila input bulanLahir kurang dari 0 
            throw new Exception("input Bulan Kurang Dari 0");
        }

    }

    /**
     * method untuk mengambil nilai dari variabel tahunLahir
     *
     * @return
     */
    public int getTahunLahir() {
        // perintah untuk pengambalian nilai dari variabel ThLahir
        return Thlahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tahunLahir dengan variabel
     * lokal tahunLahir dengan tipe data String
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        //pengecekan nilai variabel lokal tahunLahir harus lebih dari 0
        if (tahunLahir > 0) {
            //pernyataan bahwa nilai dari variabel ThnLahir yang bersifat global sama dengan nilai dari variabel lokal tahunLahir
            this.Thlahir = tahunLahir;
        } else {
            // pesan apabila input tahunLahir
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
        // mendeklarasikan variabel nomorRekamMedis yang bertipe String
        String nomorRekamMEdis;
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        //mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari nama
        nomorRekamMEdis = ft.format(date) + Nama.substring(0, 3);
        // perintah untuk pengembalian nilai variabel nomorRekamMedis
        return nomorRekamMEdis;
    }

}