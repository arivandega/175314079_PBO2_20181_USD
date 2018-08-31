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
public class AntrianPasien {
    private int TanggalAntrian;
    private int BulanAntrian;
    private int TahunAntrian;
    private Klinik klinik;
    private int nomorAntrian=0;
    private final int JUMLAH_MAKSIMAL_PASIEN=50;
    private Pasien[] DaftarPasien = new Pasien[JUMLAH_MAKSIMAL_PASIEN];

    public AntrianPasien() {
    }
    /**
     * fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     * @return 
     */
    
    public void mendaftar(Pasien pasien) throws Exception{
        //nomoro antrian dibandingkan dengan jumlah maksimal pasien yang dilayani
        if (nomorAntrian < JUMLAH_MAKSIMAL_PASIEN) {
            DaftarPasien[nomorAntrian]= pasien;
            nomorAntrian++;
        }else{
            //antrian sudah penuh
            throw new Exception("Antrian Sudah Penuh");
        }
        
    }
    
    public Pasien PanggilPasien(int nomorAntrian)throws Exception{
        if (nomorAntrian<JUMLAH_MAKSIMAL_PASIEN) {
        return DaftarPasien[nomorAntrian];
        }else{
            throw new Exception("Tidak ada pasien dengan nomor tersebut");
        }
    }

    public int getTanggalAntrian() {
        return TanggalAntrian;
    }

    public void setTanggalAntrian(int TanggalAntrian) {
        this.TanggalAntrian = TanggalAntrian;
    }

    public int getBulanAntrian() {
        return BulanAntrian;
    }

    public void setBulanAntrian(int BulanAntrian) {
        this.BulanAntrian = BulanAntrian;
    }

    public int getTahunAntrian() {
        return TahunAntrian;
    }

    public void setTahunAntrian(int TahunAntrian) {
        this.TahunAntrian = TahunAntrian;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {
        return DaftarPasien;
    }

    public void setDaftarPasien(Pasien[] DaftarPasienp) {
        this.DaftarPasien = DaftarPasienp;
    }

}