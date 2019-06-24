package LeetCode_0020_有效的括号;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author OliverYu
 * @Date 2019/6/24 22:49
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    private HashMap<Character,Character> hashMap;

    public Solution () {
        hashMap = new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i=0; i<len; i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                } else  if (stack.pop() != hashMap.get(c)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
