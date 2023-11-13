package Lesson_8;

import java.util.*;

public class ArrayWorld  {
    public static void main(String[] args) {
        String[] words = {
                "dog", "cat", "zebra", "cat", "elephant",
                "cat", "tiger", "zebra", "elephant", "snake",
                "monkey", "dog", "dog", "monkey", "cat",
                "elephant", "zebra", "panda", "dog", "zebra"
        };

      Set<String> uniqueWords = new TreeSet<>();
      Map <String,Integer> repeatedWords = new HashMap<>();
        for (String word : words) {
            uniqueWords.add(word);
            repeatedWords.put(word,repeatedWords.getOrDefault(word,0) + 1);

        }
        System.out.println("Список уникальных слов:" + uniqueWords);
        System.out.println("Количество повторений каждого слова:" + repeatedWords);
    }
}
