package LeetCode_0819_最常见的单词;

import java.util.*;

/**
 * @Author OliverYu
 * @Date 2019/7/23 22:11
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();
        HashMap<String, Integer> wordsMap = new HashMap<>();
        String mcw = "";
        int mcwCount = -1;

        // filter spaces and punctuation
        String[] wordsArr = paragraph.toLowerCase().split(" |!|\\?|'|,|;|\\.");

        // put banned words into hash set
        for(String s: banned)
            bannedSet.add(s);

        // add and count non-banned words into wordsMap
        for(String s: wordsArr) {
            if(!bannedSet.contains(s) && !s.equals("")) {
                wordsMap.put(s, wordsMap.getOrDefault(s, 0) + 1);
                int count = wordsMap.get(s);
                // keep tracking the most common word
                if(count > mcwCount) {
                    mcw = s;
                    mcwCount = count;
                }
            }
        }
        return mcw;
    }
}
