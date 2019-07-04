package LeetCode_0520_检测大写字母;

/**
 * @Author OliverYu
 * @Date 2019/7/4 23:08
 * @Email 253757635@qq.com
 * @Description TODO
 *
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *  输入: "USA"
 *  输出: True
 *
 * 示例 2:
 *  输入: "FlaG"
 *  输出: False
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int count = 0;
        for (int i=0; i<len; i++) {
            if (isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        if (count == 0 || count == len) {
            return true;
        } else if (isUpperCase(word.charAt(0)) && count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUpperCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }
}
