package io.leetcode.brush.part3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XuanDaddy
 * @Description: 无重复字符的最长子串
 * @Date: 2020/5/10
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abba"));
    }

    /**
     * 主要使用滑动窗口算法
     * 在滑动窗口类型的问题中都会有两个指针。一个用于延伸现有窗口的 rightright 指针，和一个用于收缩窗口的 leftleft 指针。在任意时刻，只有一个指针运动，而另一个保持静止。
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        //存储字符及下标的对应关系
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        //左侧位置
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果出现重复字符，滑动窗口到之前位置的下一个位置，由于可能出现多次重复，如abba，需要选择最大位置
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(map.get(s.charAt(i)) + 1, left);
            }
            //更新存储关系
            map.put(s.charAt(i), i);
            //获取结果，字符位置 - 左侧位置
            result = Math.max(result, i - left + 1);
        }

        return result;
    }
}
