package LeetCode_0387_字符串中的第一个唯一字符;

import java.util.HashMap;

/**
 * @Author OliverYu
 * @Date 2019/7/27 0:59
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int firstUniqChar(String s) {
        if (s.equals("")) {
           return -1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0; i<len; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),0);
            } else {
              map.put(s.charAt(i),1);
            }
        }
        for (int i=0; i<len; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
