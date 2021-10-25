package core3;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int i, length;
        String str, NewStr = "";
        char rm = 'a';
        Scanner in = new Scanner(System.in);
        str = in.next();
        length = str.length();
        for (i = 0; i <= length - 1; i++) {
            if (str.charAt(i) != rm) {
                NewStr = NewStr + str.charAt(i);
            }
        }
        System.out.println(NewStr);
    }
}
