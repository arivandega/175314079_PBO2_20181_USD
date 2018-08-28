/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoAntrian;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ROG
 */
public class Pasien {
    
    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    
    public Pasien() {

    }

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws Exception{
        if (noRekamMedis.length() <= 11 && noRekamMedis.length() >= 6 ) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("Nomor rekam Medis Salah,\n maksimal 11 karakter dan minimal 6 karakter");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception{
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            }else{
                throw new Exception("tidak ada tanggal lebih dari 31,\n pastikan tanggal benar");
            }
            
        }else{
            throw new  Exception("tidak ada tanggal 0,\n pastikan tanggal benar");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("tidak ada bulan lebih dari 12,\n pastikan bulan benar");
            }
        } else {
            throw new Exception("tidak ada bulan 0,\n pastikan bulan benar");
        }

    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Salah Input Tahun");
        }
    }
    public String BuatNomorRekamMedis() {
        String nomorRekamMEdis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        nomorRekamMEdis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMEdis;
    }


}
