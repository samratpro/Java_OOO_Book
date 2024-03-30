import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;

public class NewClass {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Count Up Down App");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Initialize count as AtomicInteger
        AtomicInteger count = new AtomicInteger(0);
        
        JPanel topPanel = new JPanel();
        JLabel topLabel = new JLabel("Count Up/Down App");
        topPanel.add(topLabel);
        frame.add(topPanel, BorderLayout.NORTH);

        
        JPanel midPanel = new JPanel(new GridBagLayout());
        JLabel countLabel = new JLabel("Count: " + count.get());
        midPanel.add(countLabel, new GridBagConstraints());
        frame.add(midPanel, BorderLayout.CENTER);
        

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS)); // Use BoxLayout with vertical alignment
        JButton upButton = new JButton("Up");
        leftPanel.add(Box.createVerticalGlue()); // Add glue to push glue button to the top
        leftPanel.add(upButton);
        leftPanel.add(Box.createVerticalGlue()); // Add glue to push glue button to the bottom
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count.incrementAndGet();
                countLabel.setText("Count: " + count.get());
            }
        });
        leftPanel.setBackground(Color.lightGray);
        frame.add(leftPanel, BorderLayout.WEST);
        
 
      
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS)); // Use BoxLayout with vertical alignment
        JButton downButton = new JButton("Down");
        rightPanel.add(Box.createVerticalGlue()); // Add glue to push glue button to the top
        rightPanel.add(downButton);
        rightPanel.add(Box.createVerticalGlue()); // Add glue to push glue button to the bottom
        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count.get() > 0) {
                    count.decrementAndGet();
                    countLabel.setText("Count: " + count.get());
                }
            }
        });
        rightPanel.setBackground(Color.lightGray);
        frame.add(rightPanel, BorderLayout.EAST);

        
        // Bottom panel for attribution
        JPanel bottomPanel = new JPanel();
        JLabel createdByLabel = new JLabel("Created by Samrat");
        bottomPanel.add(createdByLabel);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
