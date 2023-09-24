package app.src.main.java.com.chineseparrot.sudokuhelper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveData {

    private static final String FILE_NAME = "SudokuData.txt";
    private static Path path = Paths.get(FILE_NAME);

    public static void saveData() {
        try {
            // if file not already exist, create and init a SudokuData.txt file
            if (!Files.exists(path)) {
                Files.createFile(path);

                int[][][] sudokuData = new int[9][3][3]; // sudoku GUI uses 9 piece of 3x3 matrices

                StringBuilder data = new StringBuilder();
                for (int k = 0; k < 9; k++) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            data.append(sudokuData[k][i][j]);
                            if (j < 2) {
                                data.append(",");
                            }
                        }
                        data.append("\n");
                    }
                    data.append("\n");
                }
                Files.write(path, data.toString().getBytes());

            }
        } catch(Exception e) {
                e.printStackTrace();
        }
    } // ends saveData

    public static void clearFile() {

    } // ends clearFile method
} // ends MoveData class