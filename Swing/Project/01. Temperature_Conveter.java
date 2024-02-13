

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_To_F {

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\pc\\Downloads\\calculator.png");
        Image image = icon.getImage();

        JTextField celsiusField;
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusLabel.setBounds(20, 20, 60, 25);
        panel.add(celsiusLabel);

        celsiusField = new JTextField(10);
        celsiusField.setBounds(90, 20, 150, 25);
        panel.add(celsiusField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(90, 50, 100, 25);
        panel.add(convertButton);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(20, 80, 250, 25);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convert(celsiusField, resultLabel);
            }
        });

        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setLocationRelativeTo(null);
        f.setTitle("Celsius To Fahrenheit");
        f.setIconImage(image);
        f.add(panel);
        f.setVisible(true);
    }

    public static void convert(JTextField celsiusField, JLabel resultLabel) {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            resultLabel.setText("Result: " + String.format("%.2f", fahrenheit) + " °F");
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number for Celsius.");
        }
    }
}
