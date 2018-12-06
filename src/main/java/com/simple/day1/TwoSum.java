package com.simple.day1;

import lombok.extern.slf4j.Slf4j;

/**
 * Create By S I M P L E On 2018/12/06 16:08:01
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
@Slf4j
public class TwoSum {

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 2, 4};
        int[] result = twoSum(a, 2);
        log.info("result:{}", result);
    }

//    private static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                int result = nums[i] + nums[j];
//                if (result == target) {
//                    if (i == j) {
//                        continue;
//                    }
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    if (i == j) {
                        break;
                    }
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
