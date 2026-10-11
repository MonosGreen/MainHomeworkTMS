package Homework.lesson10.minimumSymbol;

import java.util.HashSet;
import java.util.Set;

public class WordAnalyzer {

    public int uniqueCharacters(String word) {
        Set<Character> uniqueChar = new HashSet<>();
        for (char c : word.toCharArray()) {
            uniqueChar.add(c);
        }
        return uniqueChar.size();
    }
}
