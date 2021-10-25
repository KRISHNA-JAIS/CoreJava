package core6;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        int i,j,count;
        String string;
        System.out.println("Enter String");
        Scanner in = new Scanner(System.in);
        string = in.nextLine();

        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string are ");
        for(i = 0; i < words.length; i++) {
            count = 1;
            for(j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}