package java_swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Color;



-------------------------------------------ImageIcon+Title
        JFrame frame= new JFrame();
        ImageIcon image= new  ImageIcon("C:\\Users\\asus\\Downloads\\logo1.png");

        JLabel label= new JLabel();
        label.setText("Welcome to KKBAU");
//        frame.setLayout(new FlowLayout());
        label.setIcon(image);
        frame.setLocation(0,200);
        frame.setSize(600,600);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        Font font =new Font("Arial",Font.BOLD,40);
        label.setFont(font);
        label.setIconTextGap(50);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
//        frame.setBounds(400, 400, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First Frame");
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.yellow);
        
        
        frame.add(label);
        
        frame.setVisible(true);





---------------------------------------------------------Dialog Box

        JFrame frame= new JFrame();
        ImageIcon image= new  ImageIcon("C:\\Users\\asus\\Downloads\\logo1.png");

        JLabel label= new JLabel();
        label.setText("Welcome to KKBAU");
//        frame.setLayout(new FlowLayout());
        label.setIcon(image);
        frame.setLocation(0,200);
        frame.setSize(600,600);
        
//        frame.setBounds(400, 400, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First Frame");
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.yellow);
        frame.setVisible(true);
        JOptionPane.showConfirmDialog(frame,"This is a dialog box");
        JOptionPane.showConfirmDialog(null, "Hi", "title", JOptionPane.YES_NO_OPTION);
        frame.add(label);


----------------------------------------------------------------------------Layout
JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First Frame");
        frame.setSize(200, 200);

        JButton button1 = new JButton("A");
        JButton button2 = new JButton("B");
        JButton button3 = new JButton("C");
        JButton button4 = new JButton("D");
        JButton button5 = new JButton("E");
//
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);



        //frame.setLayout(new GridLayout(2, 3));
//        frame.setLayout(new BorderLayout());
//
//
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
//        frame.add(button5);

        frame.setVisible(true);
---------------------------------------------------------Button

        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        JButton button1 = new JButton("Click Me");
        JButton button2 = new JButton("Exit");

        // Add ActionListener to the first button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 was clicked!");
            }
        });

        // Add ActionListener to the second button for closing the frame
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting the application.");
                System.exit(0);
            }
        });

        // Set layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);

-----------------------------------------------------------Counter UP Down
{



        JFrame frame = new JFrame("Counter Up/Down Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);

        JButton incrementButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");
        countLabel = new JLabel("Count: " + count);

        // Set layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add ActionListener to the increment button
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                updateCountLabel();
            }
        });

        // Add ActionListener to the decrement button
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                updateCountLabel();
            }
        });

        frame.add(incrementButton);
        frame.add(decrementButton);
        frame.add(countLabel);

        frame.setVisible(true);
    }

    private static void updateCountLabel() {
        countLabel.setText("Count: " + count);
    }

  
-----------------------------------------------------Login_Registration

    private static final String USER_FILE = "C:\\Users\\asus\\Desktop\\user.txt";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login/Register Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2)); // Increased to accommodate new buttons

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");
        JButton deleteButton = new JButton("Delete");
        JButton resetButton = new JButton("Reset");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);
        panel.add(deleteButton); // Adding delete button
        panel.add(resetButton); // Adding reset button

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (authenticateUser(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (registerUser(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Registration successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Username already exists.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                deleteUserInfo(username, password);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static boolean authenticateUser(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean registerUser(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            writer.write(username + "," + password);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void deleteUserInfo(String username, String password) {
        try {
            File inputFile = new File(USER_FILE);
            File tempFile = new File("tempUserFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = username + "," + password;
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // Trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            
            // Delete original file
            if (!inputFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            // Rename the temp file to the original file
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Could not rename file");
            }
            
            JOptionPane.showMessageDialog(null, "User information deleted successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
