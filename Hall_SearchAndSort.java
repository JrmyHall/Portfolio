import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* Jeramy Hall
   Programming Fundamentals III
   11/12/2023 */

public class Hall_SearchAndSort extends JApplet {
    private LinkedList<Integer> list = new LinkedList<>();
    private JTextField jhNumber = new JTextField(10);
    private JTextArea jhNumbers = new JTextArea();
    private JButton jhSort = new JButton("Sort");
    private JButton jhShuffle = new JButton("Shuffle");
    private JButton jhReverse = new JButton("Reverse");
    private JButton jhClear = new JButton("Clear");

    private static final int MIN_NUMBERS = 5;
    private static final int MAX_NUMBERS = 15;

    public Hall_SearchAndSort() {
        // First Panel: Input
        JPanel firstPanel = new JPanel();
        firstPanel.add(new JLabel("Enter a number: "));
        firstPanel.add(jhNumber);

        // Second Panel: Output
        JScrollPane panel = new JScrollPane(jhNumbers);

        // Third Panel: Buttons
        JPanel secondPanel = new JPanel();
        secondPanel.add(jhSort);
        secondPanel.add(jhShuffle);
        secondPanel.add(jhReverse);
        secondPanel.add(jhClear);

        // Adding panels to the applet
        add(firstPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(secondPanel, BorderLayout.SOUTH);

        // ActionListener for input field
        jhNumber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jhNumber.getText().trim();
                if (!input.isEmpty()) {
                    int enteredNumber = Integer.parseInt(input);
                    if (!list.contains(enteredNumber) && list.size() < MAX_NUMBERS) {
                        // Append to output if not already present and limit not reached
                        jhNumbers.append(input + " ");
                        list.add(enteredNumber);
                    } else if (list.contains(enteredNumber)) {
                        // Display an error message for duplicate numbers
                        JOptionPane.showMessageDialog(null, "Error: Duplicate number entered.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Display an error message for exceeding the limit
                        JOptionPane.showMessageDialog(null, "Error: Number limit exceeded.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    // If the maximum number count is reached, disable further input
                    if (list.size() == MAX_NUMBERS) {
                        jhNumber.setEnabled(false);
                    }
                }
                // Clear the text field after processing
                jhNumber.setText("");
            }
        });

        // ActionListener for Sort button
        jhSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (list.size() >= MIN_NUMBERS && list.size() <= MAX_NUMBERS) {
                    Collections.sort(list);
                    displayResult();
                } else {
                    // Display an error message for insufficient numbers
                    JOptionPane.showMessageDialog(null, "Error: Insufficient numbers to perform sort.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // ActionListener for Shuffle button
        jhShuffle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (list.size() >= MIN_NUMBERS && list.size() <= MAX_NUMBERS) {
                    Collections.shuffle(list);
                    displayResult();
                } else {
                    // Display an error message for insufficient numbers
                    JOptionPane.showMessageDialog(null, "Error: Insufficient numbers to perform shuffle.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // ActionListener for Reverse button
        jhReverse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (list.size() >= MIN_NUMBERS && list.size() <= MAX_NUMBERS) {
                    Collections.reverse(list);
                    displayResult();
                } else {
                    // Display an error message for insufficient numbers
                    JOptionPane.showMessageDialog(null, "Error: Insufficient numbers to perform reverse.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // ActionListener for Clear button
        jhClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear the list, input, and output areas
                list.clear();
                jhNumber.setEnabled(true);
                jhNumber.setText("");
                jhNumbers.setText("");
            }
        });
    }

    // Display the result in the output area
    private void displayResult() {
        jhNumbers.setText(null);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            jhNumbers.append(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        // Create and show the GUI frame
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setTitle("SearchAndSort");
            frame.add(new Hall_SearchAndSort(), BorderLayout.CENTER);

            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}




















