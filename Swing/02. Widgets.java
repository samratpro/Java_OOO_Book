// JFrame
JFrame frame = new JFrame();
frame.setSize(400, 500);         // Height width
f.setLocationRelativeTo(null);   // Cnter Position
f.setBounds(x,y,h,w);   // Set location and Height Width
f.setVisible(true);     // Frame visible
f.setTitle("Project Name");
                            // Set Icon Image
ImageIcon icon = new ImageIcon("C:\\Users\\pc\\Downloads\\calculator.png");
Image image = icon.getImage();
f.setIconImage(image);
