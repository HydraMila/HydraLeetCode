package god.hydra.algorithm.move_zero;

import god.hydra.classDef.AlgorithmDef;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MoveZero implements AlgorithmDef {

    /*
    解题思路：
    在不申请额外的数组空间的情况，只申请变量，用变量存储值为0的元素索引
    遍历数组，动态修改0的位置，将0的位置和非0数值的位置做交换
    0每次只+1，因为可能遇到连续2位都是0的情况
     */
    public void moveZero(int[] nums){
//        申请变量记录0的位置
        int zeroPosition = 0;
        for (int i = 0; i < nums.length; i++) {
//            判断当前位是否为零
            if (0 != nums[i]) {
//                如果当前位不为零，则与变量中记录的零做交换
                int temp = nums[i];
                nums[i] = nums[zeroPosition];
                nums[zeroPosition] = temp;
                /*
                这里零的位置只做+1操作
                比如[0, 2]交换后0的位置是+1
                比如[0, 0, 2]是第一个0与2交换，交换后0的位置还是+1
                 */
                zeroPosition++;
            }
        }
    }
}
