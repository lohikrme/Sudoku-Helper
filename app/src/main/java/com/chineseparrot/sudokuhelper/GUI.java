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


    // this very first thing is maybe the most important detail to notice!
    // here we locally store data, so when user changes numbers in GUI, they are also stored here.
    private static int[][][] sudokuData = new int[9][3][3]; // use this to locally store data

    public static int[][][] fetchSudokuData() {
        return sudokuData;
    };

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {



        // create the whole GUI using JFrame object from swing library
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
        nextNumberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("painoit next numberia!");
            }
        });

        // add clear to top panel
        JButton clearButton = new JButton("Clear");
        clearButton.setPreferredSize(new Dimension(100, 50));
        clearButton.setFont(new Font("Arial", Font.BOLD, 18));
        menuPanel.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("painoit clearbuttonia!");
            }
        });

        // add menu to top panel
        JButton menuButton = new JButton("Menu");
        menuButton.setPreferredSize(new Dimension(100, 50));
        menuButton.setFont(new Font("Arial", Font.BOLD, 18));
        menuPanel.add(menuButton);
        menuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("painoit menua!");
            }
        });

        JPanel gridPanel = new JPanel(new GridLayout(3, 3)); // sudoku here
        gridPanel.setBackground(Color.blue);

        for (int k = 0; k < 9; k++) { // create 9 slots for 3x3 matrices
            JPanel subGrid = new JPanel(new GridLayout(3, 3));
            subGrid.setBorder(BorderFactory.createLineBorder(Color.blue, 5));


        for (int i = 0; i < 3; i++) { // X-axis
            for (int j = 0; j < 3; j++) { // Y-axis
                JButton button = new JButton();
                button.setMinimumSize(new Dimension(30,30));
                button.setMaximumSize(new Dimension(30, 30));
                button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
                button.setFont(new Font("Arial", Font.BOLD, 20));
                button.setActionCommand(k + "," + i + "," + j); // these letters are for data matrix

                // listen user choosing a number
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // as said a few lines earlier, k, i, j are needed to store data to matrix
                        int k = Character.getNumericValue(button.getActionCommand().charAt(0));
                        int i = Character.getNumericValue(button.getActionCommand().charAt(2));
                        int j = Character.getNumericValue(button.getActionCommand().charAt(4));
                        String[] options = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                        String input = (String) JOptionPane.showInputDialog(null,
                                "Select Number:", // message text
                                "Number 0-9 (0 means empty)", // title of pop window
                                JOptionPane.QUESTION_MESSAGE, // this time no error/etc, just norm
                                null, // no icon selected
                                options, // user can select one of 'options' list element
                                options[0]); // default value is number 1
                        if (!input.equals("0")) {
                            button.setText(input); // if 1-9 write down
                            sudokuData[k][i][j] = Integer.parseInt(input);
                            test();
                        } else {
                            button.setText("");
                            sudokuData[k][i][j] = 0;
                            test();
                        }

                    } // actionPerformed ends
                }); // addActionListener ends
                subGrid.add(button); // add 1 button to matrix
            } // 9 buttons have been added
            gridPanel.add(subGrid); // add 1 matrix to sudoku
        }
        } // 9 3x3 matrices have been added

        frame.getContentPane().add(menuPanel, "North"); // draw menuPanel on top of screen
        frame.getContentPane().add(gridPanel); // draw the sudoku graphic filling most of screen

        frame.setVisible(true); // sudoku board becomes visible
    } // ends GUI method

    private void test(){
        // test print matrix content to see stored data
        System.out.println("Tulosta sudokuDatan sisältö: ");
        System.out.println();
        for (int a = 0; a < 9; a ++) {
            for (int b = 0; b < 3; b ++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(sudokuData[a][b][c]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sudokuDatan sisältö päättyy!");
    }
} // ends GUI class


