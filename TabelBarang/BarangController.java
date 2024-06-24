package TabelBarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class BarangController {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost/toko2";
        String usr = "root";
        String pwd = "";

        try {
            // Load driver database
            Class.forName(DRIVER);

            // Buat koneksi ke database
            connection = DriverManager.getConnection(DB_URL, usr, pwd);
            System.out.println("Koneksi Berhasil");

            // Buat statement
            statement = connection.createStatement();

            // Jalankan query
            String sql = "SELECT * FROM tbl_barang";
            resultSet = statement.executeQuery(sql);

            // Proses hasil query
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            int columnCount = rsMetaData.getColumnCount();

            // Tampilkan nama kolom
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsMetaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Tampilkan data baris demi baris
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver tidak ditemukan - " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error: Koneksi atau query bermasalah - " + e.getMessage());
        } finally {
            // Tutup semua resource
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error saat menutup resource - " + e.getMessage());
            }
        }
    }
}
