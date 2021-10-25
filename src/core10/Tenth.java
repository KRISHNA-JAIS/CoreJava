package core10;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        String word = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        while (!word.equals("done")) {
            word = in.next();
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
        }
    }
}