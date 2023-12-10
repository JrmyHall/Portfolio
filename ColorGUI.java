import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorGUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;

    public ColorGUI() {
        // Set up the JFrame
        setTitle("Color GUI");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Create a panel to change its background color
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        // Create the Red button
        redButton = new JButton("Red");
        redButton.addActionListener(this);

        // Create the Green button
        greenButton = new JButton("Green");
        greenButton.addActionListener(this);

        // Create the Blue button
        blueButton = new JButton("Blue");
        blueButton.addActionListener(this);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            // Change the background color to Red
            panel.setBackground(Color.RED);
        } else if (e.getSource() == greenButton) {
            // Change the background color to Green
            panel.setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            // Change the background color to Blue
            panel.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorGUI app = new ColorGUI();
            app.setVisible(true);
        });
    }
}
