package com.simple.day1;

import lombok.extern.slf4j.Slf4j;

/**
 * Create By S I M P L E On 2018/12/12 09:38:41
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

@Slf4j
public class IsPalindrome {

    public static void main(String[] args) {
        log.info("result:{}", isPalindrome(12329));
    }

    private static boolean isPalindrome(int x) {

        if (x >=0) {
            for (int i = 0; x > 10; i++) {
                int[] result = new int[x];
                result[i] = x % 10;

            }
        }
        return false;


//        if (x >= 0) {
//            int y = x % 10;
//            log.info("result:{}",x/10);
//            while (x > 10) {
//                x = x / 10;
//            }
//            log.info("y:{},x:{}", y, x);
//        }
//        return false;
    }
}
