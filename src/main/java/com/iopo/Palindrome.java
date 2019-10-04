package com.iopo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Palindrome {


    public List<String> readFromFile(Path thePath) {

        List<String> myPalindromeList = new LinkedList<>();
        String line;
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedReader reader = Files.newBufferedReader(thePath, charset)) {
            while ((line = reader.readLine()) != null) {
                myPalindromeList.add(line);
            }
            return myPalindromeList;
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
            return null;
        }
    }

    public boolean isPalindrome(String str) {

        try {

            if ((str.isEmpty()) || (str.matches(" *"))) {
                return false;
            }

            String trimString = str.replaceAll("[^A-Za-z]", "");
            char[] strToCharArray = trimString.toCharArray();
            char[] reverseStrToChar = new char[strToCharArray.length];
            int j = strToCharArray.length;

            for (int i = 0; i < strToCharArray.length; i++) {
                reverseStrToChar[j - 1] = strToCharArray[i];
                j--;
            }
            String reverseString = String.valueOf(reverseStrToChar);
            return trimString.equalsIgnoreCase(reverseString);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public void writeToFile(List<String> list, Path isPalindromeFile, Path isNotPalindromeFile) {

        Charset charset = StandardCharsets.UTF_8;
        try (BufferedWriter writerPal = Files.newBufferedWriter(isPalindromeFile, charset);
             BufferedWriter writerNotPal = Files.newBufferedWriter(isNotPalindromeFile, charset)) {
            int counter = 0;
            for (String line : list) {
                if (isPalindrome(line)) {
                    writerPal.write((counter+1) + ". " + line + "\n");
                    System.out.println((counter+1) + ". " + line + "--> A palindrome!");
                    counter++;
                } else {
                    writerNotPal.write((counter+1) + ". " + line + "\n");
                    System.out.println((counter+1) + ". " + line + "--> Not a palindrome!");
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
