package LeetCode_1108_IP地址无效化;

/**
 * @Author OliverYu
 * @Date 2019/7/30 21:58
 * @Email 253757635@qq.com
 * @Description 建议采用StringBuilder效率高(击败98.16%)
 *              直接用String的replace效率太低。
 *
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * 示例 1：
 *  输入：address = "1.1.1.1"
 *  输出："1[.]1[.]1[.]1"
 * 示例 2：
 *  输入：address = "255.100.50.0"
 *  输出："255[.]100[.]50[.]0"
 */
public class Solution {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<address.length(); i++) {
            if (address.charAt(i) == '.') {
                stringBuilder.append('[');
                stringBuilder.append('.');
                stringBuilder.append(']');
            } else {
              stringBuilder.append(address.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
