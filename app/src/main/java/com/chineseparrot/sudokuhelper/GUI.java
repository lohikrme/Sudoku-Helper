package app.src.main.java.com.chineseparrot.sudokuhelper;

import java.awt.Color; // change color
import java.awt.Dimension; // dimension sets size (w, h)
import java.awt.GridLayout; // creates symmetrical squares
import java.awt.event.ActionEvent; // clicking button
import java.awt.event.ActionListener; // happens after clicking button
import java.awt.Font; // set text fonts e.g for buttons

import javax.swing.BorderFactory; // add border colors to panels and buttons
import javax.swing.JButton; // add buttons
import javax.swing.JFrame; // the whole GUI is inside a frame
import javax.swing.JPanel; // divide frame into divs or areas allowing control of GUI
import javax.swing.JOptionPane; // here user can select which number he wants

public class GUI {

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {

        // create the whole GUI
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // create the top panel for GUI with all necessary buttons
        JPanel menuPanel = new JPanel(); // menu and next number button here
        menuPanel.setBackground(Color.GRAY);

        // add nextNumber to top panel
        JButton nextNumberButton = new JButton("Next Number!");
        nextNumberButton.setPreferredSize(new Dimension(160, 50));
        nextNumberButton.setFont(new Font("Arial", Font.BOLD, 18));
        menuPanel.add(nextNumberButton);

        // add clear to top panel
        JButton clearButton = new JButton("Clear");
        clearButton.setPreferredSize(new Dimension(100, 50));
        clearButton.setFont(new Font("Arial", Font.BOLD, 18));
        menuPanel.add(clearButton);

        // add menu to top panel
        JButton menuButton = new JButton("Menu");
        menuButton.setPreferredSize(new Dimension(100, 50));
        menuButton.setFont(new Font("Arial", Font.BOLD, 18));
        menuPanel.add(menuButton);

        JPanel gridPanel = new JPanel(new GridLayout(3, 3)); // sudoku here
        gridPanel.setBackground(Color.blue);

        for (int i = 0; i < 9; i++) { // create 9 3x3 matrices
            JPanel subGrid = new JPanel(new GridLayout(3, 3));
            subGrid.setBorder(BorderFactory.createLineBorder(Color.blue, 5));

            // and here during creating a 3x3 matrix, we create all 9 buttons for the 3x3 matrix
            for (int j = 0; j < 9; j++) {
                JButton button = new JButton();
                button.setMinimumSize(new Dimension(30,30));
                button.setMaximumSize(new Dimension(30, 30));
                button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
                button.setFont(new Font("Arial", Font.BOLD, 20));

                // listen user choosing a number
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String[] options = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                        String input = (String) JOptionPane.showInputDialog(null,
                                "Select Number:", // message text
                                "Number 0-9 (0 means empty)", // title of pop window
                                JOptionPane.QUESTION_MESSAGE, // this time no error/etc, just norm
                                null, // no icon selected
                                options, // user can select one of 'options' list element
                                options[0]); // default value is number 1
                        if (input != "0") {
                            button.setText(input); // if a number has been selected, it will be written
                        } else {
                            button.setText("");
                        }
                    } // actionPerformed ends
                }); // addActionListener ends
                subGrid.add(button); // add 1 button to matrix
            } // 9 buttons have been added
            gridPanel.add(subGrid); // add 1 matrix to sudoku
        } // 9 3x3 matrices have been added

        frame.getContentPane().add(menuPanel, "North"); // draw menuPanel on top of screen
        frame.getContentPane().add(gridPanel); // draw the sudoku graphic filling most of screen

        frame.setVisible(true); // turn on the GUI
    } // ends the method 'GUI'
} // ends the public class 'GUI'
