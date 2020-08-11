package god.hydra.algorithm.climbing_stairs;

import god.hydra.classDef.AlgorithmDef;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ClimbingStairs implements AlgorithmDef {

    /*
    解题思路-暴力解法-递归
    当1阶台阶时，答案只能是1步
    当2阶太极时，答案是1+1或2+0
    当第n阶台阶时，取决于最后2阶怎么走，可以走1步也可以走2步，变相就是求出最后一次走1步的方法数+最后一次走2步的方法数
    以此类推
     */
    public int climbingStairs(int n){
//        递归第一步先写出口
//        台阶为1只有1这种方法 台阶为2有2种
        if (n == 1 || n == 2) return n;
//        第一次执行到这里的时候，其实只是计算最后2步怎么走，因为最后一步有2种选择，走1+1或是2
//        进入递归后，又会计算n-1和n-2的最后2步怎么走就是n-3和n-4怎么走直到n=1|2
        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }

    /*
    解题思路-斐波那契数列
    动态规划抽象出重复自底向上
    从最底部开始计算，每次计算得到下一步的2种答案
     */
    public int climbingStairsFinb(int n){
        int first = 1;
        int second = 2;
        for (int i = 3; i < n; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return first + second;
    }
}
