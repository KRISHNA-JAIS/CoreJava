package core7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Seventh {
    public static void main(String[] args)
    {
        String str;
        System.out.println("Enter String");
        Scanner in = new Scanner(System.in);
        str = in.next();

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] Array = str.toCharArray();

        for (char c : Array) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}