package LeetCode_0824_山羊拉丁文;

/**
 * @Author OliverYu
 * @Date 2019/8/3 23:15
 * @Email 253757635@qq.com
 * @Description 个人觉得比较简单 switch+StringBuilder即可
 *              在拼接字符串的时候，建议多用StringBuilder 效率高。
 *
 * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
 * 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
 *
 * 山羊拉丁文的规则如下：
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 * 例如，单词"apple"变为"applema"。
 *
 * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词"goat"变为"oatgma"。
 *
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 * 返回将 S 转换为山羊拉丁文后的句子。
 *
 * 示例 1:
 *  输入: "I speak Goat Latin"
 *  输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 * 示例 2:
 *  输入: "The quick brown fox jumped over the lazy dog"
 *  输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa
 *       overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 *
 * 说明:
 *  S 中仅包含大小写字母和空格。单词间有且仅有一个空格。
 *  1 <= S.length <= 150。
 */

public class Solution {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        StringBuilder aChange = new StringBuilder();
        for(String s : S.split(" ")){
            //1.判断元音还是辅音
            switch(s.charAt(0)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    sb.append(s);
                    break;
                default:
                    sb.append(s.substring(1) + s.charAt(0));
            }
            //2.添加"ma"、"a"、空格
            sb.append("ma");
            aChange.append("a");
            sb.append(aChange);
            sb.append(" ");
        }
        //3.删除最后一个空格
        if(sb.length() > 0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
