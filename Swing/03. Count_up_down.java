import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountUpDownApp extends JFrame {
    private JLabel countLabel;
    private int count = 0;

    public CountUpDownApp() {
        super("Count Up Down App");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel for count display
        JPanel topPanel = new JPanel();
        countLabel = new JLabel("Count: " + count);
        topPanel.add(countLabel);
        add(topPanel, BorderLayout.NORTH);

        // Middle panel for buttons
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(1, 2));

        JButton upButton = new JButton("Up");
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                updateCountLabel();
            }
        });
        middlePanel.add(upButton);

        JButton downButton = new JButton("Down");
        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count > 0) {
                    count--;
                    updateCountLabel();
                }
            }
        });
        middlePanel.add(downButton);

        add(middlePanel, BorderLayout.CENTER);

        // Bottom panel for attribution
        JPanel bottomPanel = new JPanel();
        JLabel createdByLabel = new JLabel("Created by Samrat");
        bottomPanel.add(createdByLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateCountLabel() {
        countLabel.setText("Count: " + count);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CountUpDownApp();
            }
        });
    }
}
