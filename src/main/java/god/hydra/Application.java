package god.hydra;

import god.hydra.move_zero.MoveZero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 主要启动类
 */
public class Application {

    public static void main(String[] args) {
//        int[] testArr = {0, 2, 0, 1, 4};
//        int[] testArr = {0, 0, 0, 0, 0};
        int[] testArr = {2, 0, 1, 4};
        new MoveZero().moveZero(testArr);
        for (int i : testArr) {
            System.out.print(i + ", ");
        }
    }


}
