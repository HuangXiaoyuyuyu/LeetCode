package LeetCode_0859_亲密字符串;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author OliverYu
 * @Date 2019/7/18 22:16
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length() || (A.equals("") && B.equals("")) || (A.length()==1 && B.length() == 1)) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i=0; i<A.length(); i++) {
            if (map.containsKey(A.charAt(i))) {
                map.put(A.charAt(i),map.get(A.charAt(i)) + 1);
            } else {
                map.put(A.charAt(i),1);
            }
            if (A.charAt(i) != B.charAt(i)) {
                count++;
                list.add(i);
                if (count > 2) {
                    return false;
                }
            }
        }
        if (count == 0) {
            if (A.equals(B)) {
                Object[] lists = map.values().toArray();
                for (int i=0; i<lists.length; i++) {
                    if ((Integer)lists[i] >= 2) {
                        return true;
                    }
                }
            }
        }
        if (count == 1) {
            return false;
        }
        if (count == 2) {
            if (A.charAt(list.get(0)) == B.charAt(list.get(1)) && A.charAt(list.get(1)) == B.charAt(list.get(0))) {
                return true;
            }
        }
        return false;
    }
}
