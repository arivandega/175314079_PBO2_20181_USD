/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoAntrian;

/**
 *
 * @author ROG
 */
public class Dokter {
    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public Dokter() {

    }

    public Dokter(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) throws Exception {
        if (nomorPegawai.length() == 5) {
            this.nomorPegawai = (nomorPegawai + nama.substring(0, 3));
        }else {
            throw new Exception("Format Tidak Sesuai");
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

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("tidak ada tanggal lebih dari 31,\n pastikan tanggal benar");
            }
        } else {
            throw new Exception("tidak ada tanggal 0,\n pastikan tanggal benar");
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
            throw new Exception("Salah input tahun");
        }
    }
}
