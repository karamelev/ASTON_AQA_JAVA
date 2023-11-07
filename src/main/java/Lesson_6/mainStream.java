package Lesson_6;

import java.io.*;

public class mainStream {
    public static void main(String[] args) {
        File file = new File("src/resources/saveAndReade.csv");
        AppData appDate = new AppData();
        String [] header = appDate.getHeader();
        int[][] date = appDate.getData();

        try (PrintStream streamSave = new PrintStream(new FileOutputStream(file))) {
            for (String value: header) {
                streamSave.printf(value);
                streamSave.printf(";");
            }
               streamSave.println();

            for (int[] row : date){
                for(int elem : row) {
                    streamSave.printf(String.valueOf(elem));
                    streamSave.printf(";");
                }
                streamSave.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (BufferedReader stream = new BufferedReader(new FileReader(file))) {
            int dataFromFile;

            while ((dataFromFile = stream.read())!=-1) {
                System.out.print((char) dataFromFile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
