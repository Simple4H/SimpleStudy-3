package com.simple.test;

import lombok.extern.slf4j.Slf4j;

/**
 * Create By S I M P L E On 2018/12/12 11:13:49
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        byte s1 = 127;
        s1 = (byte) (s1 + 1);
        short s2 = 1;
        s2 += 1;
        log.info("s1:{},s2:{}", s1, s2);
    }

    private static void test() {
        int a = 1;

        while (( a = 0) > 0){

        }
    }
}
