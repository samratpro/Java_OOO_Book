package calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lab_project_final extends JFrame {

    private Container c;
    private JLabel number1, number2, result;
    private JTextField input1, input2;
    private JButton sum, sub, mul, div, clear;
    private Font f;
    private JTextArea ta;

    Lab_project_final() {
        action();
    }

    public void action() {
        c = this.getContentPane();
        c.setLayout(null);
        f = new Font("Roboto", Font.PLAIN, 17);

        number1 = new JLabel("Enter 1st Number :");
        number1.setBounds(20, 20, 150, 20);
        number1.setFont(f);
        c.add(number1);

        number2 = new JLabel("Enter 2nd Number :");
        number2.setBounds(20, 60, 150, 20);
        number2.setFont(f);
        c.add(number2);

        result = new JLabel("Result Sheet");
        result.setBounds(40, 150, 100, 25);
        result.setFont(f);
        c.add(result);
        
        ta = new JTextArea();
        ta.setBounds(140,150,200,200);
        ta.setBackground(Color.green);
        c.add(ta);

        input1 = new JTextField();
        input1.setBounds(180, 20, 100, 30);
        input1.setFont(f);
        c.add(input1);

        input2 = new JTextField();
        input2.setBounds(180, 55, 100, 30);
        input2.setFont(f);
        c.add(input2);

        sum = new JButton("Sum");
        sum.setBounds(20, 100, 70, 30);
        sum.setFont(f);
        c.add(sum);

        sub = new JButton("Sub");
        sub.setBounds(100, 100, 70, 30);
        sub.setFont(f);
        c.add(sub);

        mul = new JButton("Mul");
        mul.setBounds(180, 100, 70, 30);
        mul.setFont(f);
        c.add(mul);

        div = new JButton("Div");
        div.setBounds(260, 100, 70, 30);
        div.setFont(f);
        c.add(div);

        clear = new JButton("Clear");
        clear.setBounds(30, 400, 100, 30);
        c.add(clear);

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num_1 = input1.getText();
                String num_2 = input2.getText();
                //int a = Integer.parseInt(num_1);
                //int b = Integer.parseInt(num_2);
                Double a = Double.parseDouble(num_1);
                Double b = Double.parseDouble(num_2);
                Double sumOf = a + b;
                //result.setText("Sum Result = " + sumOf);
                ta.append("Sum Result = " + sumOf+"\n");

            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num_1 = input1.getText();
                String num_2 = input2.getText();
                Double a = Double.parseDouble(num_1);
                Double b = Double.parseDouble(num_2);
                Double subOf = a - b;
                ta.append("Subtract Result = " + subOf+"\n");

            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num_1 = input1.getText();
                String num_2 = input2.getText();
                Double a = Double.parseDouble(num_1);
                Double b = Double.parseDouble(num_2);
                Double mulOf = a * b;
                ta.append("Multiplication Result = " + mulOf+"\n");

            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num_1 = input1.getText();
                String num_2 = input2.getText();
                Double a = Double.parseDouble(num_1);
                Double b = Double.parseDouble(num_2);
                Double divOf = a / b;
                ta.append("Div Result = " + divOf+"\n");

            }
        });

        clear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                input1.setText(" ");
                input2.setText(" ");
                ta.setText(" ");
                

            }
        });

    }

    public static void main(String[] args) {

        Lab_project_final fame = new Lab_project_final();
        fame.setVisible(true);
        fame.setBounds(900, 100, 400, 500);
        fame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fame.setTitle("Calculator");

    }

}
