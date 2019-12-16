import sun.jvm.hotspot.runtime.sparc.SPARCFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiumsConverterGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel celsiusLabel;
    private JTextField celsiusTextField;
    private JButton convert;
    private JLabel farhenheitLabel;

    public CelsiumsConverterGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temFahr = (int) ((Double.parseDouble(celsiusTextField.getText()))*1.8 + 32);
                farhenheitLabel.setText(temFahr + " Fahrenheit");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiumsConverterGUI("Ma Celsius Converter");
        frame.setVisible(true);

    }





}
