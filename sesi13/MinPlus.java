package sesi13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MinPlus implements ActionListener {

    private JFrame fr;
    private int num;
    private JButton btnPlus, btnMin;
    private JLabel numL;

    public MinPlus() {
        num = 0;
        buatFrame();
        fr.setVisible(true);
    }

    private void buatFrame() {
        fr = new JFrame("Event Sederhana");
        fr.setSize(250, 100);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pn = (JPanel) fr.getContentPane();
        pn.setLayout(new BorderLayout());

        JPanel p = new JPanel();

        btnMin = new JButton("-");
        // mendaftarkan actionListener pada tombol btnMin
        btnMin.addActionListener(this);
        p.add(btnMin); // mengaitkan button ke panel p

        btnPlus = new JButton("+");
        // mendaftarkan actionListener pada tombol btnPlus
        btnPlus.addActionListener(this);
        p.add(btnPlus); // mengaitkan button ke panel p

        pn.add(p, BorderLayout.NORTH); // mengaitkan panel p ke pn

        numL = new JLabel("0", SwingConstants.CENTER);
        pn.add(numL, BorderLayout.CENTER); // mengaitkan label ke pn
    }

    public void tambah() {
        num++;
    }

    public void kurang() {
        num--;
    }

    public void actionPerformed(ActionEvent event) {
        String opr = event.getActionCommand();
        if (opr.equals("-")) {
            this.kurang();
        } else {
            this.tambah();
        }
        numL.setText(Integer.toString(num));
    }

    public static void main(String[] args) {
        new MinPlus();
    }
}
