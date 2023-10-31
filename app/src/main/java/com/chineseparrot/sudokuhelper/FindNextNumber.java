package app.src.main.java.com.chineseparrot.sudokuhelper;

import java.util.ArrayList;

import app.src.main.java.com.chineseparrot.sudokuhelper.GUI;

public class FindNextNumber {
    public static void main(String[] args) {

    }

    public static void findNumber() {

        

        // sudoku numbers form a board
        int[][][] sudokuData = GUI.fetchSudokuData();


        System.out.println("find numbers works!");
        GUI.changeOneNumberOfSudoku(8, 0, 2, 1);


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
}