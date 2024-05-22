import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Result {

    private String nama, tanggal, noDaftar, telp, alamat, email;

    public Result(String nama, String tanggal, String noDaftar, String telp, String alamat, String email) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.noDaftar = noDaftar;
        this.telp = telp;
        this.alamat = alamat;
        this.email = email;

        initComponents();
    }

    void initComponents() {
        JFrame hasilForm = new JFrame();
        hasilForm.getContentPane().setBackground(Color.yellow);
        hasilForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hasilForm.setSize(540, 600);
        hasilForm.setLayout(null); 
        hasilForm.setLocationRelativeTo(null);

        JLabel DataMahasiswa = new JLabel("Data Mahasiswa");
        DataMahasiswa.setBounds(200, 30, 150, 30);
        DataMahasiswa.setFont(new Font("Arial", Font.BOLD, 18));
        hasilForm.add(DataMahasiswa);

        StringBuilder finalTxt = new StringBuilder();
        finalTxt.append("Nama Lengkap \t: ").append(nama).append("\n")
        .append("Tanggal Lahir \t: ").append(tanggal).append("\n")
        .append("Nomor Pendaftaran \t: ").append(noDaftar).append("\n")
        .append("No. Telp \t\t: ").append(telp).append("\n")
        .append("Alamat \t\t: ").append(alamat).append("\n")
        .append("E-Mail \t\t: ").append(email).append("\n");

        JTextArea txtHasil = new JTextArea();
        txtHasil.setLineWrap(true);
        txtHasil.setFont(new Font(null, Font.PLAIN, 14));
        txtHasil.setWrapStyleWord(true);
        txtHasil.setBounds(50, 70, 420, 430);
        txtHasil.setBorder(BorderFactory.createCompoundBorder(txtHasil.getBorder(), new EmptyBorder(10, 10, 10, 10)));
        txtHasil.setBackground(Color.white);
        txtHasil.setText(finalTxt.toString());
        txtHasil.setEditable(false);
        hasilForm.add(txtHasil);

        hasilForm.setVisible(true);
    }
}
