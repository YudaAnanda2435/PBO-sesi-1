package sesi13;

import javax.swing.*;
import java.awt.event.*;

public class EventSederhana {
    private JFrame frame;
    JLabel lbinama = new JLabel("Nama");
    JTextField txnama = new JTextField(20);
    JLabel lblnim = new JLabel("NIM");
    JTextField txnim = new JTextField(7);
    JLabel lblkelamin = new JLabel("Jenis Kelamin");
    JRadioButton pria = new JRadioButton("Pria");
    JRadioButton wanita = new JRadioButton("Wanita");
    ButtonGroup kelompok = new ButtonGroup();
    JLabel lblhobi = new JLabel("Hobi");
    JCheckBox baca = new JCheckBox("Membaca");
    JCheckBox mancing = new JCheckBox("Memancing");
    JCheckBox jalan = new JCheckBox("Jalan-jalan");
    JCheckBox tidur = new JCheckBox("tidur");
    JButton cetak = new JButton("Cetak");
    JTextArea hasil = new JTextArea();

    public EventSederhana() {
        makeFrame();
        frame.setVisible(true);
        AksiReaksi();
    }

    private void makeFrame() {
        frame = new JFrame("Event Sederhana");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        komponenVisual();
    }

    private void komponenVisual() {
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);

        panel.add(lbinama);
        lbinama.setBounds(10, 10, 80, 20);

        panel.add(txnama);
        txnama.setBounds(105, 10, 175, 20);

        panel.add(lblnim);
        lblnim.setBounds(10, 33, 80, 20);

        panel.add(txnim);
        txnim.setBounds(105, 33, 70, 20);

        panel.add(lblkelamin);
        lblkelamin.setBounds(10, 56, 80, 20);

        kelompok.add(pria);
        kelompok.add(wanita);

        panel.add(pria);
        pria.setBounds(105, 56, 50, 20);

        panel.add(wanita);
        wanita.setBounds(160, 56, 70, 20);

        panel.add(lblhobi);
        lblhobi.setBounds(10, 80, 70, 20);

        panel.add(baca);
        baca.setBounds(105, 80, 100, 20);

        panel.add(mancing);
        mancing.setBounds(105, 103, 100, 20);

        panel.add(jalan);
        jalan.setBounds(105, 126, 100, 20);

        panel.add(tidur);
        tidur.setBounds(105, 126, 100, 20);

        panel.add(cetak);
        cetak.setBounds(10, 150, 270, 20);

        JScrollPane scrollPane = new JScrollPane(hasil);
        panel.add(scrollPane);
        scrollPane.setBounds(10, 180, 270, 100);
    }

    public void AksiReaksi() {
        cetak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hasil.append(txnama.getText() + "\n");
                hasil.append(txnim.getText() + "\n");

                if (pria.isSelected()) {
                    hasil.append(pria.getText() + "\n");
                } else {
                    hasil.append(wanita.getText() + "\n");
                }

                if (baca.isSelected()) {
                    hasil.append(baca.getText() + "\n");
                }

                if (mancing.isSelected()) {
                    hasil.append(mancing.getText() + "\n");
                }

                if (jalan.isSelected()) {
                    hasil.append(jalan.getText() + "\n");
                }

                  if (tidur.isSelected()) {
                    hasil.append(tidur.getText() + "\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        new EventSederhana();
    }
}
