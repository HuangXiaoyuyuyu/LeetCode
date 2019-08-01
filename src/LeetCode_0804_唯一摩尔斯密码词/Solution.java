package LeetCode_0804_唯一摩尔斯密码词;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author OliverYu
 * @Date 2019/8/1 21:43
 * @Email 253757635@qq.com
 * @Description 此题比较简单，很显然就是先把每一个word转换为密文，再用set去重。
 *              但是在word转换为密文的时候涉及到字符串的拼接，
 *              建议使用StringBuilder的append()，效率较高,而不是字符串+字符串。
 *
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 
 * 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
 * ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
 * "-..-","-.--","--.."]
 *
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。
 * 我们将这样一个连接过程称作单词翻译。
 * 返回我们可以获得所有词不同单词翻译的数量。
 * 例如:
 *  输入: words = ["gin", "zen", "gig", "msg"]
 *  输出: 2
 * 解释:
 * 各单词翻译如下:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * 共有 2 种不同翻译, "--...-." 和 "--...--.".
 *
 * 注意:
 *  单词列表words 的长度不会超过 100。
 *  每个单词 words[i]的长度范围为 [1, 12]。
 *  每个单词 words[i]只包含小写字母。
 */
public class Solution {
    private String[] table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
             ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
             "-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i=0; i<words.length; i++) {
            set.add(transferWordsToSecret(words[i]));
        }
        return set.size();
    }
    private String transferWordsToSecret(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<word.length(); i++) {
            stringBuilder.append(table[word.charAt(i) - 97]);
        }
        return stringBuilder.toString();
    }
}
