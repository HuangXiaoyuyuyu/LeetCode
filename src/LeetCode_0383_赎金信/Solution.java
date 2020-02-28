package LeetCode_0383_赎金信;

import java.util.HashMap;

/**
 * @Author OliverYu
 * @Date 2019/7/16 21:09
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        if (ransomNote.length() > magazine.length()) {
//            return false;
//        }
//        HashMap<Character,Integer> map = new HashMap<>();
//        int magazineLen = magazine.length();
//        for (int i=0; i<magazineLen; i++) {
//            if (map.containsKey(magazine.charAt(i))) {
//                map.put(magazine.charAt(i),map.get(magazine.charAt(i)) + 1);
//            }else {
//                map.put(magazine.charAt(i),1);
//            }
//        }
//
//        int ransomNoteLen = ransomNote.length();
//        for (int i=0; i<ransomNoteLen; i++) {
//            if (map.containsKey(ransomNote.charAt(i))) {
//                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i)) - 1);
//                if (map.get(ransomNote.charAt(i)) < 0) {
//                    return false;
//                }
//            }else {
//               return false;
//            }
//        }
//        return true;
//    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] tempArr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            tempArr[magazine.charAt(i) - 97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (tempArr[ransomNote.charAt(i) - 97] > 0) {
                tempArr[ransomNote.charAt(i) - 97] --;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(new Solution().canConstruct(ransomNote,magazine));
    }
}
