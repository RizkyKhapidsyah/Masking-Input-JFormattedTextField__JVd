package com.rk;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;

public class FormUtama extends JFrame {

    public FormUtama() {
        super("Masking Input");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        setPreferredSize(new Dimension(400, 200));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setInput("Phone 1");
        setInput("Phone 2");
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setInput(String teks) {
        JFormattedTextField jFTF;
        JLabel jL;

        try {
            jL = new JLabel(teks);
            jL.setFont(new Font("Tahoma", Font.PLAIN, 17));
            add(jL);

            MaskFormatter MF = new MaskFormatter("(###)#######");
            MF.setPlaceholderCharacter('_');

            jFTF = new JFormattedTextField(MF);
            jFTF.setFont(new Font("Tahoma", Font.PLAIN, 18));
            jFTF.setPreferredSize(new Dimension(200, 40));
            add(jFTF);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
