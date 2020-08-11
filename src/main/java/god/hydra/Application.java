package god.hydra;

import god.hydra.algorithm.binary_search.BinarySearch;
import god.hydra.algorithm.climbing_stairs.ClimbingStairs;
import god.hydra.algorithm.move_zero.MoveZero;

/**
 * 主要启动类
 */
public class Application {

    public static void main(String[] args) {

//        移动零
        /*int[] testArr = {0, 2, 0, 1, 4};
        int[] testArr = {0, 0, 0, 0, 0};
        int[] testArr = {2, 0, 1, 4};
        MoveZero moveZero = new MoveZero();
        moveZero.moveZero(testArr);
        moveZero.printAnswer(testArr);*/

//        二分查找法具体实现
//        BinarySearch binarySearch = new BinarySearch();
        /*int[] nums = {1, 3, 5, 7, 9, 11};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.printAnswer(binarySearch.binarySearch(nums, 8));*/

        /*int[] numsLeft = {1, 2, 2, 2, 4};
        binarySearch.printAnswer(binarySearch.binarySearchLeftBound(numsLeft, 2));*/

//        爬楼梯
        ClimbingStairs climbingStairs = new ClimbingStairs();
        climbingStairs.printAnswer(climbingStairs.climbingStairs(6));
        climbingStairs.printAnswer(climbingStairs.climbingStairsFinb(6));
    }


}
