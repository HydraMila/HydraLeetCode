package god.hydra.classDef;

/**
 * 每个算法类需要实现的接口
 * 目前主要包含算法结果的打印
 */
public interface AlgorithmDef {

    default void printAnswer(Object obj){
        if (obj instanceof Integer) {
            System.out.println(obj);
        } else if (obj instanceof int[]) {
            for (int i = 0; i < ((int[]) obj).length; i++) {
                System.out.print(((int[]) obj)[i] + ",");
            }
        }
    }
}
