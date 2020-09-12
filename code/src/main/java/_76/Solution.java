package _76;

//给你一个字符串 S、一个字符串 T 。请你设计一种算法，可以在 O(n) 的时间复杂度内，从字符串 S 里面找出：包含 T 所有字符的最小子串。
//
//
//
// 示例：
//
// 输入：S = "ADOBECODEBANC", T = "ABC"
//输出："BANC"
//
//
//
// 提示：
//
//
// 如果 S 中不存这样的子串，则返回空字符串 ""。
// 如果 S 中存在这样的子串，我们保证它是唯一的答案。
//
// Related Topics 哈希表 双指针 字符串 Sliding Window
// 👍 743 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        int[] answer = new int[]{-1, -1};
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        char[] chars = s.toCharArray();
        int left = 0, right = left;
        Map<Character, Integer> newMap = new HashMap<>();
        while (right < chars.length) {
            /*
                //次数太多，失败
                newMap.clear();
                for (int i = left; i <= right; i++) {
                    newMap.put(chars[i], newMap.getOrDefault(chars[i], 0) + 1);
                }
                */
            newMap.put(chars[right], newMap.getOrDefault(chars[right], 0) + 1);
            boolean isContain = isContain(newMap, tMap);
            while (isContain) {
                if (right - left < answer[1] - answer[0] || answer[0] + answer[1] == -2) {
                    answer[0] = left;
                    answer[1] = right;
                }
                left++;

                /*
                //次数太多，失败
                left++;
                newMap.clear();
                for (int i = left; i <= right; i++) {
                    newMap.put(chars[i], newMap.getOrDefault(chars[i], 0) + 1);
                }
                */
                char leftChar = chars[left - 1];
                newMap.put(leftChar, Math.max(newMap.get(leftChar) - 1, 0));
                isContain = newMap.get(leftChar) >= tMap.getOrDefault(leftChar, 0);
            }
            right++;
        }
        if (answer[0] + answer[1] != -2) {
            return s.substring(answer[0], answer[1] + 1);
        }
        return "";
    }

    public boolean isContain(Map<Character, Integer> newMap, Map<Character, Integer> t) {
        for (Map.Entry<Character, Integer> entry : t.entrySet()) {
            if (newMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

