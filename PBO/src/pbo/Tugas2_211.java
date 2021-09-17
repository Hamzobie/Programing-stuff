package pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame{
    JButton OkButton;
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
    JTextField t1,t2,t3;
    JPasswordField p1;
    public MyFrame(){
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        OkButton= new JButton("Selesai");
        OkButton.setLocation(200, 300);
        OkButton.setSize(100, 30);
        
        L1 = new JLabel("BUAT AKUN BARU");
        L1.setBounds(200, 25, 200, 30);
        L2 = new JLabel("Nama Depan");
        L2.setBounds(75, 75, 150, 30);
        L3 = new JLabel("Nama Belakang");
        L3.setBounds(75, 125, 150, 30);
        L4 = new JLabel("No.HP");
        L4.setBounds(75, 175, 100, 30);
        L5 = new JLabel("Kata Sandi");
        L5.setBounds(75, 225, 150, 30);
        L6 = new JLabel();
        L6.setBounds(40, 40, 200, 30);
        L7 = new JLabel();
        L7.setBounds(40, 80, 200, 30);
        L8 = new JLabel();
        L8.setBounds(40, 120, 200, 30);
        L9 = new JLabel();
        L9.setBounds(40, 160, 200, 30);
        
        t1 = new JTextField();
        t1.setBounds(250, 75, 175, 30);
        t2 = new JTextField();
        t2.setBounds(250, 125, 175, 30);
        t3 = new JTextField();
        t3.setBounds(250, 175, 175, 30);
        p1 = new JPasswordField();
        p1.setBounds(250, 225, 175, 30);
        
        OkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame F = new JFrame();
                F.setSize(400, 400);
                F.setDefaultCloseOperation(EXIT_ON_CLOSE);
                F.setVisible(rootPaneCheckingEnabled);
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = t3.getText();
             
                L6.setText("Pendaftaran Berhasil");
                L7.setText("Nama User : "+s1+" "+s2);
                L8.setText("No.HP : "+s3);
                L9.setText("Selamat Datang "+s1);
                F.add(L6);
                F.add(L7);
                F.add(L8);
                F.add(L9);
            }
        });
        
        getContentPane().setLayout(null);
        getContentPane().add(OkButton);
        getContentPane().add(L1);
        getContentPane().add(L2);
        getContentPane().add(L3);
        getContentPane().add(L4);
        getContentPane().add(L5);
        getContentPane().add(t1);
        getContentPane().add(t2);
        getContentPane().add(t3);
        getContentPane().add(p1);
         
    }    
}

public class Tugas2_211 {
    public static void main(String args[]) {
        MyFrame f1 = new MyFrame();
        f1.setVisible(true);
    }
}
