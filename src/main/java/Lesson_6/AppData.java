package Lesson_6;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData() {
        header = new String[]{"Value1", "value2", "value3"};
        data = new int[][] {{100, 200, 123},
                            {300, 400, 500}};
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}

