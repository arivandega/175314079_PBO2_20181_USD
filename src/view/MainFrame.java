/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ROG
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jarkom
 */
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem tambahAntrianMenuItem;

    public MainFrame() {
        init();
    }

    public void init() {

        menuBar = new JMenuBar();

        this.setTitle("Main Frame");
        pasienMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("Exit");
        tambahPasienMenuItem = new JMenuItem("Tambah Pasien");
        tambahAntrianMenuItem = new JMenuItem("Tambah Antrian");
        pasienMenu.add(exitMenuItem);
        pasienMenu.add(tambahAntrianMenuItem);
        pasienMenu.add(tambahPasienMenuItem);
        menuBar.add(pasienMenu);

        this.setJMenuBar(menuBar);

        tambahAntrianMenuItem.addActionListener(this);
        tambahPasienMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tambahPasienMenuItem) {
            TambahPAsienBaruDialog test = new TambahPAsienBaruDialog();
        test.setSize(500, 600);
        test.setVisible(true);
        }

        if (ae.getSource() == tambahAntrianMenuItem) {
            TambahAntrianDialog test = new TambahAntrianDialog();
        test.setSize(500, 600);
        test.setVisible(true);
        }
        if (ae.getSource() == exitMenuItem) {
            System.exit(0);
}
        
    }
}
