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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JButton antriButton;

    /**
     * konstruktor TambahAntrianDialog untuk membuat object
     */
    public TambahAntrianDialog() {

        init();
    }

    /**
     * konstruktor TambahAntrianDialog untuk membuat object dengan variabel
     * lokal title yang bertipe string
     *
     * @param title
     */
    public TambahAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("FORM DAFTAR ANTRIAN");
        judulLabel.setFont(new Font(null, Font.BOLD, 16));
        judulLabel.setBounds(50, 20, 250, 30);
        this.add(judulLabel);

        noRMLabel = new JLabel();
        noRMLabel.setText("No. RM");
        noRMLabel.setBounds(50, 70, 80, 20);
        this.add(noRMLabel);

        noRMText = new JTextField();
        noRMText.setBounds(150, 70, 120, 20);
        this.add(noRMText);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 100, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 100, 120, 20);
        this.add(namaText);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 130, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(150, 130, 120, 20);
        this.add(alamatText);

        antriButton = new JButton();
        antriButton.setText("Antri");
        antriButton.setBounds(150, 180, 80, 30);
        this.add(antriButton);

        noRMText.addActionListener(this);
        antriButton.addActionListener(this);

    }

    /**
     * method abstrak dari ActionListener untuk pengoperasian tiap object
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noRMText) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            if (cari == null) {
                JOptionPane.showMessageDialog(null, "Data Pasien " + noRMText.getText() + " Tidak Ada");
            } else {
                namaText.setText(cari.getNama());
                alamatText.setText(cari.getAlamat());
            }
        }
        if (ae.getSource() == antriButton) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
                if (cari == Pasien.daftarPasien.get(i)) {
                    JOptionPane.showMessageDialog(null, "Nomor Antrian Anda : " + (i + 1));
                    this.dispose();
                }
            }
        }
    }
}