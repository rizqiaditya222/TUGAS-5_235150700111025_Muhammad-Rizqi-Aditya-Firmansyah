import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class FormPendaftaran implements ActionListener {
    
    private JButton submit;
    private JTextField txtNama;
    private JTextField txtTanggal;
    private JTextField txtTelp;
    private JTextField txtNoDaftar;
    private JTextArea txtAlamat;
    private JTextField txtEmail;

    public static void main(String[] args) {
        new FormPendaftaran();
    }

    public FormPendaftaran() {
        initComponents();
    }

    void initComponents() {
        JFrame form = new JFrame();
        form.getContentPane().setBackground(Color.yellow);
        form.setTitle("Form Pendaftaran");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setSize(540, 600);
        form.setLayout(null); 
        form.setLocationRelativeTo(null);

        JLabel labelNama = new JLabel("Nama Lengkap");
        labelNama.setBounds(50, 20, 100, 30);
        form.add(labelNama);

        txtNama = new JTextField();
        txtNama.setBounds(175, 20, 300, 30);
        txtNama.setBorder(BorderFactory.createCompoundBorder(txtNama.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        form.add(txtNama);

        JLabel labelTanggal = new JLabel("Tanggal Lahir");
        labelTanggal.setBounds(50, 60, 100, 30);
        form.add(labelTanggal);

        txtTanggal = new JTextField();
        txtTanggal.setBounds(175, 60, 300, 30);
        txtTanggal.setBorder(BorderFactory.createCompoundBorder(txtTanggal.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        form.add(txtTanggal);

        JLabel labelNoDaftar = new JLabel("Nomor Pendaftaran");
        labelNoDaftar.setBounds(50, 100, 120, 30);
        form.add(labelNoDaftar);

        txtNoDaftar = new JTextField();
        txtNoDaftar.setBounds(175, 100, 300, 30);
        txtNoDaftar.setBorder(BorderFactory.createCompoundBorder(txtNoDaftar.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        form.add(txtNoDaftar);

        JLabel labelTelp = new JLabel("No. Telp");
        labelTelp.setBounds(50, 140, 100, 30);
        form.add(labelTelp);

        txtTelp = new JTextField();
        txtTelp.setBounds(175, 140, 300, 30);
        txtTelp.setBorder(BorderFactory.createCompoundBorder(txtTelp.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        form.add(txtTelp);

        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(50, 180, 100, 30);
        form.add(labelAlamat);

        txtAlamat = new JTextArea();
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        txtAlamat.setBorder(BorderFactory.createCompoundBorder(border, new EmptyBorder(5, 5, 5, 5)));
        txtAlamat.setLineWrap(true);
        txtAlamat.setWrapStyleWord(true);
        txtAlamat.setBounds(175, 180, 300, 110);
        form.add(txtAlamat);

        JLabel labelEmail = new JLabel("E-Mail");
        labelEmail.setBounds(50, 300, 100, 30);
        form.add(labelEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(175, 300, 300, 30);
        txtEmail.setBorder(BorderFactory.createCompoundBorder(txtEmail.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        form.add(txtEmail);
        
        submit = new JButton(); 
        submit.setBounds(395, 340, 78, 30);
        submit.addActionListener(this);
        submit.setText("Submit");
        submit.setFocusable(false);
        form.add(submit);

        form.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (txtNama.getText().isEmpty() || txtTanggal.getText().isEmpty() || txtNoDaftar.getText().isEmpty() ||
                txtTelp.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (konfirmasi==JOptionPane.YES_OPTION) {
                    String nama = txtNama.getText();
                    String tanggal = txtTanggal.getText();
                    String noDaftar = txtNoDaftar.getText();
                    String telp = txtTelp.getText();
                    String alamat = txtAlamat.getText();
                    String email = txtEmail.getText();
                    
                    Result hasil = new Result(nama, tanggal, noDaftar, telp, alamat, email);
                }
                
        }
    }
}
}