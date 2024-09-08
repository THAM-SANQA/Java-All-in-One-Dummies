
package book4.chap1;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class StringBuilderApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int vowelCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                sb.setCharAt(i, '*');
                vowelCount++;
            }
        }
        System.out.println();
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println(s);
        System.out.println(sb.toString());
    }
}
