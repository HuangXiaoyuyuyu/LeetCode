package LeetCode_0929_独特的电子邮件地址;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author OliverYu
 * @Date 2019/7/25 21:55
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        String s = "";
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i=0; i<emails.length; i++) {
            stringBuilder =  new StringBuilder("");
            int indexOf = emails[i].indexOf("@");
            s = emails[i].substring(0,indexOf);
            if (s.indexOf(".") > 0) {
                s = s.replace(".","");
            }
            if (s.indexOf("+") > 0) {
                int index = s.indexOf("+");
                stringBuilder.append(s.substring(0,index)).append(emails[i].substring(indexOf));
                if (!list.contains(stringBuilder.toString())) {
                    list.add(stringBuilder.toString());
                }
            }else {
                if (!list.contains(s + emails[i].substring(indexOf))) {
                    list.add(s + emails[i].substring(indexOf));
                }
            }
        }
        return list.size();
    }
}
