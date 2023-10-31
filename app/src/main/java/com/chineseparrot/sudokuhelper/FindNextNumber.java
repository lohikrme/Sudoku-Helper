package app.src.main.java.com.chineseparrot.sudokuhelper;

import java.util.ArrayList;
import app.src.main.java.com.chineseparrot.sudokuhelper.GUI; // import GUI file

public class FindNextNumber {

    // note that the data u fetch here is a copy!
    // after u find next number, change the original data instead of the copy!
    private static int[][][] sudokuData2;


    public static void main(String[] args) {

    }

    public static void findNumber() {

        sudokuData2 = GUI.copySudokuData();


        GUI.changeOneNumberOfSudoku(8, 0, 2, 9);
        test2();


        // these store real and predicted numbers of all rows from up to down
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        ArrayList<Integer> row4 = new ArrayList<Integer>();
        ArrayList<Integer> row5 = new ArrayList<Integer>();
        ArrayList<Integer> row6 = new ArrayList<Integer>();
        ArrayList<Integer> row7 = new ArrayList<Integer>();
        ArrayList<Integer> row8 = new ArrayList<Integer>();
        ArrayList<Integer> row9 = new ArrayList<Integer>();

        // these store real and predicted numbers of all cols from left to right
        ArrayList<Integer> col1 = new ArrayList<Integer>();
        ArrayList<Integer> col2 = new ArrayList<Integer>();
        ArrayList<Integer> col3 = new ArrayList<Integer>();
        ArrayList<Integer> col4 = new ArrayList<Integer>();
        ArrayList<Integer> col5 = new ArrayList<Integer>();
        ArrayList<Integer> col6 = new ArrayList<Integer>();
        ArrayList<Integer> col7 = new ArrayList<Integer>();
        ArrayList<Integer> col8 = new ArrayList<Integer>();
        ArrayList<Integer> col9 = new ArrayList<Integer>();

        // these store real and predicted numbers of all boxes from left up to right down
        ArrayList<Integer> box1 = new ArrayList<Integer>();
        ArrayList<Integer> box2 = new ArrayList<Integer>();
        ArrayList<Integer> box3 = new ArrayList<Integer>();
        ArrayList<Integer> box4 = new ArrayList<Integer>();
        ArrayList<Integer> box5 = new ArrayList<Integer>();
        ArrayList<Integer> box6 = new ArrayList<Integer>();
        ArrayList<Integer> box7 = new ArrayList<Integer>();
        ArrayList<Integer> box8 = new ArrayList<Integer>();
        ArrayList<Integer> box9 = new ArrayList<Integer>();
    }

    private static void test2(){

        System.out.println();
        System.out.println("test2 begins!");
        System.out.println();

        // test print matrix content to see stored data
        System.out.println("Tulosta sudokuData2:n sisältö: ");
        System.out.println();
        for (int a = 0; a < 9; a ++) {
            for (int b = 0; b < 3; b ++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(sudokuData2[a][b][c]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sudokuData2:n sisältö päättyy!");
        System.out.println();
        System.out.println("test2 ends!");
        System.out.println();

    }

    // end FindNextNumber class
}