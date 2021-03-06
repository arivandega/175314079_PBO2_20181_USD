/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Pasien;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JLabel tanggallahirLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JLabel tanggalLabel;
    private JLabel bulanLabel;
    private JLabel tahunLabel;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;
    private String tanggalArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulanArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    private String tahunArray[] = {"1969","1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002","2003","2004","2005"};

    /**
     * konstruktor TambahPasienBariDialog untuk membuat object
     */
    public TambahPasienBaruDialog() {
        init();
    }

    /**
     * konstruktor TambahPasienBariDialog untuk membuat object dengan parameter
     * lokal title yang bertipe string
     */
    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }

    /**
     * method yang berisikan tampilan
     */
    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("FORM DAFTAR PASIEN BARU");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        judulLabel.setBounds(50, 20, 250, 50);
        this.add(judulLabel);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 90, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 90, 120, 20);
        this.add(namaText);

        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(250, 120, 80, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(150, 120, 100, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);

        tanggallahirLabel = new JLabel("Tanggal Lahir");
        tanggallahirLabel.setBounds(50, 180, 80, 20);
        this.add(tanggallahirLabel);

        tanggalLabel = new JLabel("Tanggal");
        tanggalLabel.setBounds(150, 150, 80, 20);
        this.add(tanggalLabel);

        tanggalCombo = new JComboBox(tanggalArray);
        tanggalCombo.setBounds(150, 180, 80, 20);
        this.add(tanggalCombo);

        bulanLabel = new JLabel("Bulan");
        bulanLabel.setBounds(250, 150, 80, 20);
        this.add(bulanLabel);

        bulanCombo = new JComboBox(bulanArray);
        bulanCombo.setBounds(250, 180, 80, 20);
        this.add(bulanCombo);

        tahunLabel = new JLabel("Tahun");
        tahunLabel.setBounds(350, 150, 80, 20);
        this.add(tahunLabel);

        tahunCombo = new JComboBox(tahunArray);
        tahunCombo.setBounds(350, 180, 80, 20);
        this.add(tahunCombo);

        nikLabel = new JLabel();
        nikLabel.setText("NIK");
        nikLabel.setBounds(50, 210, 80, 20);
        this.add(nikLabel);

        nikText = new JTextField();
        nikText.setBounds(150, 210, 120, 20);
        this.add(nikText);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 250, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(150, 250, 120, 20);
        this.add(alamatText);

        tambahButton = new JButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(150, 280, 80, 30);
        this.add(tambahButton);
        tambahButton.addActionListener(this);

    }

    /**
     * method abstrak dari ActionListener untuk pengoperasian tiap object
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tambahButton) {

            Pasien baru = new Pasien();

            baru.setNama(namaText.getText());

            baru.setAlamat(alamatText.getText());

            baru.setNoRekamMedis(nikText.getText());
  
            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Sudah Ditambahkan");

            this.dispose();
        }
    }
}