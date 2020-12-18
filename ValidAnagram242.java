package leetcode;

import java.util.Arrays;

public class ValidAnagram242 {

    public void ValidAnagram242() {
        String s = "", t = "";
        if (s.length() != t.length()) {
            System.out.println("false");
        }
        char cS[] = s.toCharArray();
        char cT[] = t.toCharArray();
        Arrays.sort(cS);
        Arrays.sort(cT);
        for (int i = 0; i < cS.length; i++) {
            if (cS[i] != cT[i]) {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}
