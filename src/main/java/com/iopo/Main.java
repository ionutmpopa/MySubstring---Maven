package com.iopo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Path thePath = Paths.get("resources/checkPalindromes.txt");
        Path palindromes = Paths.get("resources/palindromes.txt");
        Path notPalindromes = Paths.get("resources/NOTpalindromes.txt");

        Palindrome palindrome = new Palindrome();
        List<String> palindromeList = palindrome.readFromFile(thePath);
        palindrome.writeToFile(palindromeList, palindromes, notPalindromes);
    }
}
