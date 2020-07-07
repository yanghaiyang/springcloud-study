package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 输入一个正数n，输出所有和为n的连续正数序列。
 * 分析：设定两个指针，min指向和为n的连续正数序列的最小值，max指向和为n的连续正数序列最大值。sum表示真正的和。
 * 初始情况下,min、max和sum 都指向1.
 * 当sum小于n时，max++；
 * 当sum大于n时，min++;
 * 当sum等于n时，输出整个序列。
 * Created by zhy on 2017/4/19.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ConfigClientEurekaApplication.class)*/
public class Test01 {

    //@Test
    public static void getAns(int n) {
        int min = 1;
        int max = 1;
        int sum = 1;
        while (min <= n /2 + 1) {//超过中值，不可能有两个或两个以上之和等于它
            if (sum == n) {
                for (int k = min; k <= max; k++) {
                    System.out.println(k + " ");
                }
                System.out.println();
                sum = sum - min;
                min++;
                max++;
                sum = sum + max;
            }
            if (sum > n) {
                sum = sum - min;
                min++;
            } else {
                max++;
                sum = sum + max;
            }
        }
    }

    public static void main(String[] args) {
        getAns(15);
    }
}
