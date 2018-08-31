/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ROG
 */
public class MainTest {

    public static void main(String[] args) {
        Pasien pas = new Pasien("Ari");
        Dokter dok = new Dokter("Syelen");

        try {
            pas.setAlamat("Jl. Nangka III no 1");
            pas.setTempatLahir("Denpasar");
            pas.setTanggalLahir(11);
            pas.setBulanLahir(11);
            pas.setTahunLahir(1998);
            pas.setNoRekamMedis(pas.BuatNomorRekamMedis());
            
            dok.setAlamat("Jl. Cinderlaras Gg Randu no 30");
            dok.setTempatLahir("Lubuklinggau");
            dok.setTanggalLahir(31);
            dok.setBulanLahir(3);
            dok.setTahunLahir(1999);
            dok.setNomorPegawai("84655");
            
            

        } catch (Exception error) {
            error.printStackTrace();
        }
        System.out.println("----------PASIEN----------");
        System.out.println("Nama\t\t\t:"+pas.getNama());
        System.out.println("Alamat\t\t\t:"+pas.getAlamat());
        System.out.println("Tempat,tgl lahit\t:"+pas.getTempatLahir()+","+pas.getTanggalLahir() + "/" + pas.getBulanLahir() + "/" + pas.getTahunLahir());
        System.out.println("No Rekam Medis\t\t:"+pas.getNoRekamMedis());
        System.out.println("----------DOKTER----------");
        System.out.println("Nama\t\t\t:"+dok.getNama());
        System.out.println("Alamat\t\t\t:"+dok.getAlamat());
        System.out.println("Tempat,tgl lahit\t:"+dok.getTempatLahir()+","+dok.getTanggalLahir() + "/" + dok.getBulanLahir() + "/" + dok.getTahunLahir());
        System.out.println("No Pegawai\t\t:"+dok.getNomorPegawai());
        
        
    }
}
