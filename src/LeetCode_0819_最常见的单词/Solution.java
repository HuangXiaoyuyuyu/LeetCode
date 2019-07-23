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
        if (paragraph.indexOf("!") > 0) {
            paragraph = paragraph.replace("!","");
        }
        if (paragraph.indexOf("?") > 0) {
            paragraph = paragraph.replace("?","");
        }
        if (paragraph.indexOf("'") > 0) {
            paragraph = paragraph.replace("'","");
        }
        if (paragraph.indexOf(",") > 0) {
            paragraph = paragraph.replace(",","");
        }
        if (paragraph.indexOf(";") > 0) {
            paragraph = paragraph.replace(";","");
        }
        if (paragraph.indexOf(".") > 0) {
            paragraph = paragraph.replace(".","");
        }
        String[] strings = paragraph.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        int len = strings.length;
        for (int i=0; i<len; i++) {
            if (map.keySet().contains(strings[i].toLowerCase())) {
                map.put(strings[i].toLowerCase(),map.get(strings[i].toLowerCase()) + 1);
            } else {
              map.put(strings[i].toLowerCase(),1);
            }
        }

        for (int i=0; i<banned.length; i++) {
            if (map.keySet().contains(banned[i].toLowerCase())) {
                map.remove(banned[i].toLowerCase());
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        return list.get(list.size()-1).getKey();
    }
}
