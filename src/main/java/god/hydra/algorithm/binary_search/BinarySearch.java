package god.hydra.algorithm.binary_search;

import god.hydra.classDef.AlgorithmDef;

/**
 * 二分查找的具体实现
 */
public class BinarySearch implements AlgorithmDef {

    /**
     * 给定数组，需要查询的目标值，返回目标值的索引，未找到返回-1
     * @param nums 给定数组
     * @param target 需要查询的目标值
     * @return 返回目标值的索引，未找到返回-1
     */
    public int binarySearch(int[] nums, int target){
//        校验
        if (nums.length == 0) return -1;
//        初始化左边界和右边界
        int left = 0;
        int right = nums.length - 1;

        /*
        循环条件是，左值小于等于右值则继续
        若right = nums.length，则left < right
        若right = nums.length - 1，则left <= right
         */
        while (left <= right) {
//            这里等同(left + right) / 2,这样写防止left right直接相加造成int溢出
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) {
                /*
                目标值比中间值大,则目标值在右边区间
                将左边界制为中间值
                这里要加1,因为target == nums[mid]已经不成立,所以缩小范围加了个1
                 */
                left = mid + 1;
            } else if (target < nums[mid]) {
//                和上述同理
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 查询带有重复元素的数组，返回最左边的索引
     * 比如{1, 2, 2, 3} 查2返回1
     * @param nums 给定数组
     * @param target 需要查询的目标值
     * @return 返回目标值的索引，找到返回最左边的索引，未找到返回-1
     */
    public int binarySearchLeftBound(int[] nums, int target){
//        TODO 完善
//        校验
        if (nums.length == 0) return -1;
//        初始化左边界和右边界
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
//            这里等同(left + right) / 2,这样写防止left right直接相加造成int溢出
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) right = mid + 1;
            else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
//                和上述同理
                right = mid - 1;
            }
        }
        return left;
    }
}
