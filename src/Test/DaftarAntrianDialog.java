/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ROG
 */
public class DaftarAntrianDialog extends JDialog{
    private JLabel JudulLabel;
    private JLabel NoRM;
    private JLabel NamaLabel;
    private JTextField NamaText;
    private JButton SaveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String Title) {
       this.setTitle(Title);
       init();
    }
    
    
   public void init(){
       this.setLayout(null);

    JudulLabel = new JLabel("Form Daftar Antrian");
    JudulLabel.setBounds(150, 35, 300, 40 );
    JudulLabel.setFont(new Font(null, Font.BOLD, 20));
    this.add(JudulLabel);
    
    NamaLabel = new JLabel("No RM");
    NamaLabel.setBounds(15, 80, 100, 25);
    NamaLabel.setFont(new Font(null, Font.BOLD, 15));
    this.add(NamaLabel);
    
    NamaLabel = new JLabel("Nama");
    NamaLabel.setBounds(15, 125, 100, 25);
    NamaLabel.setFont(new Font(null, Font.BOLD, 15));
    this.add(NamaLabel);
    
    NamaLabel = new JLabel("Alamat");
    NamaLabel.setBounds(15, 180, 100, 25);
    NamaLabel.setFont(new Font(null, Font.BOLD, 15));
    this.add(NamaLabel);
    
    NamaText = new JTextField();
    NamaText.setBounds(115, 80, 300, 25);
    this.add(NamaText);
    
    NamaText = new JTextField();
    NamaText.setBounds(115, 125, 300, 25);
    this.add(NamaText);
    
    NamaText = new JTextField();
    NamaText.setBounds(115, 180, 300, 25);
    this.add(NamaText);
   
    SaveButton = new JButton("Simpan");
    SaveButton.setBounds(200, 300, 100, 40);
    this.add(SaveButton);
    
}
    
}
