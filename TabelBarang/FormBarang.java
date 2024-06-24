package TabelBarang;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends JFrame {
    private String[] judul = {"Kode Barang", "Nama Barang", "Kategori", "Harga", "Stok"};
    DefaultTableModel df;
    JTable tab = new JTable();
    JScrollPane scp = new JScrollPane();
    JPanel pnl = new JPanel();
    JLabel lblKodeBarang = new JLabel("Kode Barang");
    JTextField txKodeBarang = new JTextField(20);
    JLabel lblNamaBarang = new JLabel("Nama Barang");
    JTextField txNamaBarang = new JTextField(20);
    JLabel lblKategori = new JLabel("Kategori");
    JTextField txKategori = new JTextField(20);
    JLabel lblHarga = new JLabel("Harga");
    JTextField txHarga = new JTextField(10);
    JLabel lblStok = new JLabel("Stok");
    JTextField txStok = new JTextField(5);
    JButton btTambah = new JButton("Tambah");
    JButton btBaru = new JButton("Baru");
    JButton btHapus = new JButton("Hapus");
    JButton btUbah = new JButton("Ubah");

    FormBarang() {
        super("Data Barang");
        setSize(600, 400);
        pnl.setLayout(null);

        pnl.add(lblKodeBarang);
        lblKodeBarang.setBounds(20, 10, 100, 20);
        pnl.add(txKodeBarang);
        txKodeBarang.setBounds(120, 10, 150, 20);

        pnl.add(lblNamaBarang);
        lblNamaBarang.setBounds(20, 40, 100, 20);
        pnl.add(txNamaBarang);
        txNamaBarang.setBounds(120, 40, 200, 20);

        pnl.add(lblKategori);
        lblKategori.setBounds(20, 70, 100, 20);
        pnl.add(txKategori);
        txKategori.setBounds(120, 70, 150, 20);

        pnl.add(lblHarga);
        lblHarga.setBounds(20, 100, 100, 20);
        pnl.add(txHarga);
        txHarga.setBounds(120, 100, 100, 20);

        pnl.add(lblStok);
        lblStok.setBounds(20, 130, 100, 20);
        pnl.add(txStok);
        txStok.setBounds(120, 130, 50, 20);

        pnl.add(btBaru);
        btBaru.setBounds(300, 10, 100, 20);
        btBaru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btBaruAksi(e);
            }
        });

        pnl.add(btTambah);
        btTambah.setBounds(300, 40, 100, 20);
        btTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btTambahAksi(e);
            }
        });

        pnl.add(btUbah);
        btUbah.setBounds(300, 70, 100, 20);
        btUbah.setEnabled(false);
        btUbah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btUbahAksi(e);
            }
        });

        pnl.add(btHapus);
        btHapus.setBounds(300, 100, 100, 20);
        btHapus.setEnabled(false);
        btHapus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btHapusAksi(e);
            }
        });

        df = new DefaultTableModel(null, judul);
        tab.setModel(df);
        scp.getViewport().add(tab);
        tab.setEnabled(true);
        tab.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        scp.setBounds(20, 170, 550, 180);
        pnl.add(scp);
        getContentPane().add(pnl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Memuat data saat pertama kali aplikasi dijalankan
        loadData();
    }

    void loadData() {
        try {
            Connection cn = new Database().getConnect();
            Statement st = cn.createStatement();
            String sql = "SELECT * FROM tbl_barang";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String kodeBarang = rs.getString("kode_barang");
                String namaBarang = rs.getString("nama_barang");
                String kategori = rs.getString("kategori_barang");
                int harga = rs.getInt("harga_barang");
                int stok = rs.getInt("stok_barang");
                String[] data = {kodeBarang, namaBarang, kategori, String.valueOf(harga), String.valueOf(stok)};
                df.addRow(data);
            }
            rs.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void clearTable() {
        int numRows = df.getRowCount();
        for (int i = numRows - 1; i >= 0; i--) {
            df.removeRow(i);
        }
    }

    void clearTextField() {
        txKodeBarang.setText(null);
        txNamaBarang.setText(null);
        txKategori.setText(null);
        txHarga.setText(null);
        txStok.setText(null);
    }

    void tambahData(Barang barang) {
        try {
            Connection cn = new Database().getConnect();
            Statement st = cn.createStatement();
            String sql = "INSERT INTO tbl_barang (kode_barang, nama_barang, kategori_barang, harga_barang, stok_barang) " +
                         "VALUES ('" + barang.getKodeBarang() + "', '" + barang.getNamaBarang() + "', '" + 
                         barang.getKategoriBarang() + "', '" + barang.getHargaBarang() + "', '" + barang.getStokBarang() + "')";
            int result = st.executeUpdate(sql);
            cn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Info", JOptionPane.INFORMATION_MESSAGE);
            String[] data = {barang.getKodeBarang(), barang.getNamaBarang(), barang.getKategoriBarang(),
                             String.valueOf(barang.getHargaBarang()), String.valueOf(barang.getStokBarang())};
            df.addRow(data);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void hapusData(String kodeBarang) {
        try {
            Connection cn = new Database().getConnect();
            Statement st = cn.createStatement();
            String sql = "DELETE FROM tbl_barang WHERE kode_barang = '" + kodeBarang + "'";
            int result = st.executeUpdate(sql);
            cn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Info", JOptionPane.INFORMATION_MESSAGE);
            df.removeRow(tab.getSelectedRow());
            clearTextField();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void ubahData(Barang barang, String kodeBarang) {
        try {
            Connection cn = new Database().getConnect();
            Statement st = cn.createStatement();
            String sql = "UPDATE tbl_barang SET kode_barang='" + barang.getKodeBarang() +
                         "', nama_barang='" + barang.getNamaBarang() + "', kategori_barang='" + barang.getKategoriBarang() +
                         "', harga_barang='" + barang.getHargaBarang() + "', stok_barang='" + barang.getStokBarang() +
                         "' WHERE kode_barang='" + kodeBarang + "'";
            int result = st.executeUpdate(sql);
            cn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah", "Info", JOptionPane.INFORMATION_MESSAGE);
            clearTable();
            loadData();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void btBaruAksi(ActionEvent evt) {
        clearTextField();
        btUbah.setEnabled(false);
        btHapus.setEnabled(false);
        btTambah.setEnabled(true);
    }

    private void btTambahAksi(ActionEvent evt) {
        Barang barang = new Barang();
        barang.setKodeBarang(txKodeBarang.getText());
        barang.setNamaBarang(txNamaBarang.getText());
        barang.setKategoriBarang(txKategori.getText());
        barang.setHargaBarang(Integer.parseInt(txHarga.getText()));
        barang.setStokBarang(Integer.parseInt(txStok.getText()));
        tambahData(barang);
    }

    private void btHapusAksi(ActionEvent evt) {
        int status;
        status = JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (status == 0) {
            hapusData(txKodeBarang.getText());
        }
    }

    private void btUbahAksi(ActionEvent evt) {
        Barang barang = new Barang();
        barang.setKodeBarang(txKodeBarang.getText());
        barang.setNamaBarang(txNamaBarang.getText());
        barang.setKategoriBarang(txKategori.getText());
        barang.setHargaBarang(Integer.parseInt(txHarga.getText()));
        barang.setStokBarang(Integer.parseInt(txStok.getText()));
        ubahData(barang, tab.getValueAt(tab.getSelectedRow(), 0).toString());
    }

   private void tabMouseClicked(MouseEvent evt) {
    btUbah.setEnabled(true); // Aktifkan tombol Ubah
    btHapus.setEnabled(true);
    btTambah.setEnabled(false);
    int selectedRow = tab.getSelectedRow();
    txKodeBarang.setText(tab.getValueAt(selectedRow, 0).toString());
    txNamaBarang.setText(tab.getValueAt(selectedRow, 1).toString());
    txKategori.setText(tab.getValueAt(selectedRow, 2).toString());
    txHarga.setText(tab.getValueAt(selectedRow, 3).toString());
    txStok.setText(tab.getValueAt(selectedRow, 4).toString());
}


    public static void main(String[] args) {
        new FormBarang();
    }
}
