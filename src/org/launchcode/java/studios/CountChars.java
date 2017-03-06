package org.launchcode.java.studios;

import java.util.HashMap;

/**
 * Created by modus on 3/4/17.
 */
public class CountChars {
    public static void main(String[] args) {
        String lipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        // String lipsum = "abcdefghijklmnopqrstuvwxyzzzABCDEFGHIJKLMNOPQRSTUVWZZZ";
        // String lipsum = "AaaaBBbbCCCc";
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        int len = lipsum.length();
        for (int i = 0; i < len; i++) {
            Character c = lipsum.charAt(i);
            if (countMap.containsKey(c)) {
                Integer count = countMap.get(c);
                count++;
                countMap.put(c, count);
            }
            else {
                Integer count = 1;
                countMap.put(c, count);
            }
        }
        for (HashMap.Entry<Character, Integer> pair: countMap.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
