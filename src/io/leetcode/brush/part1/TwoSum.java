package io.leetcode.brush.part1;

import java.util.Arrays;

/**
 * @Author: XuanDaddy
 * @Description:
 * @Date: 2020/5/10
 */
class TwoSum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum2(new int[]{2, 7, 11, 15}, 9)));
    }


}

/**
 * 1. 暴力法
 * 2. 哈希表
 */
class Solution {

    /**
     * 暴力法：两重for循环，时间复杂度：O(n^2)，空间复杂度：O(1)
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("Not found solution");
    }

    /**
     * 哈希表：用空间换时间，一次for循环。时间复杂度：O(n)，空间复杂度：O(n)
     */
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
