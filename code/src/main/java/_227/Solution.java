package _227;

//实现一个基本的计算器来计算一个简单的字符串表达式的值。
//
// 字符串表达式仅包含非负整数，+， - ，*，/ 四种运算符和空格 。 整数除法仅保留整数部分。
//
// 示例 1:
//
// 输入: "3+2*2"
//输出: 7
//
//
// 示例 2:
//
// 输入: " 3/2 "
//输出: 1
//
// 示例 3:
//
// 输入: " 3+5 / 2 "
//输出: 5
//
//
// 说明：
//
//
// 你可以假设所给定的表达式都是有效的。
// 请不要使用内置的库函数 eval。
//
// Related Topics 字符串
// 👍 183 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char flag = '+';
        int num = 0;
        boolean first = false;
        s=s.replace(" ","");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
                first = true;
            }
            if (c == '-' || c == '+' || c == '*' || c == '/' || i == s.length() - 1) {
                if (first) {
                    if (flag == '-') {
                        stack.push(-num);
                    } else if (flag == '+') {
                        stack.push(num);
                    } else if (flag == '*') {
                        stack.push(num * stack.pop());
                    } else if (flag == '/') {
                        stack.push(stack.pop() / num);
                    }
                }
                flag = c;
                num = 0;
            }
        }
        int sum = 0;
        for (Integer integer : stack) {
            sum = sum + integer;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

